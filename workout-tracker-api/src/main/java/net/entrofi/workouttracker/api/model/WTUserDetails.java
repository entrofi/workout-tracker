package net.entrofi.workouttracker.api.model;

import net.entrofi.workouttracker.api.LoginHelper;
import net.entrofi.workouttracker.domain.model.User;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Optional;

public class WTUserDetails extends ResourceSupport implements UserDetails {

    private final User user;

    public WTUserDetails(Optional<User> userOptional) {
        this.user = userOptional.orElseGet(() -> new User(LoginHelper.ANONYMOUS_USER, null));
    }

    public WTUserDetails(User user) {
        this.user = Optional.ofNullable(user).orElseGet(() -> new User(LoginHelper.ANONYMOUS_USER, null));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.user.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.user.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.user.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return this.user.isEnabled();
    }






}
