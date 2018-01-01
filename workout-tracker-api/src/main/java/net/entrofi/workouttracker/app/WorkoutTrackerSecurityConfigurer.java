package net.entrofi.workouttracker.app;

import net.entrofi.workouttracker.api.RequestMappingConstants;
import net.entrofi.workouttracker.app.security.WAuthenticationEntryPoint;
import net.entrofi.workouttracker.app.security.WAuthenticationSuccessHandler;
import net.entrofi.workouttracker.app.security.WLogoutSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("checkstyle")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
@ComponentScan("net.entrofi.workouttracker")
public class WorkoutTrackerSecurityConfigurer extends WebSecurityConfigurerAdapter {


    @Autowired
    private WLogoutSuccessHandler logoutSuccessHandler;

    @Autowired
    private WAuthenticationSuccessHandler successHandler;

    @Autowired
    private WAuthenticationEntryPoint wAuthenticationEntryPoint;

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests().antMatchers("/").permitAll().and()
                .authorizeRequests().antMatchers("/console/**").permitAll();
        httpSecurity.headers().frameOptions().disable();

        httpSecurity.csrf().disable()
                .exceptionHandling().authenticationEntryPoint(wAuthenticationEntryPoint)
                .and().formLogin()
                .and().authorizeRequests()
                .antMatchers("/configuration/security", "/webjars/**").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/api/**").authenticated()
                .and().logout().permitAll().logoutUrl(RequestMappingConstants.LOGOUT_URL)
                .logoutSuccessHandler(logoutSuccessHandler);
    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }



    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider
                = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(encoder());
        return authProvider;
    }

    @Bean
    public WAuthenticationSuccessHandler authenticationSuccessHandler() {
        return new WAuthenticationSuccessHandler();
    }


    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder(5);
    }




}

