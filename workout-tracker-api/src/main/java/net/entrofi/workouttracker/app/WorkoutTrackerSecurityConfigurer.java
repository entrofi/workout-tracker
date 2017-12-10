package net.entrofi.workouttracker.app;

import net.entrofi.workouttracker.api.RequestMappingConstants;
import net.entrofi.workouttracker.app.security.WLogoutSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("checkstyle")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class WorkoutTrackerSecurityConfigurer extends WebSecurityConfigurerAdapter {


    @Autowired
    private WLogoutSuccessHandler logoutSuccessHandler;

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests().antMatchers("/").permitAll().and()
                .authorizeRequests().antMatchers("/console/**").permitAll();

        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();

        httpSecurity.csrf().disable()
                .exceptionHandling()
                .and().formLogin().and().authorizeRequests()
                .antMatchers("/configuration/security", "/webjars/**").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/api/**").authenticated()
                .and().logout().permitAll().logoutUrl(RequestMappingConstants.LOGOUT_URL)
                .logoutSuccessHandler(logoutSuccessHandler);
    }

}

