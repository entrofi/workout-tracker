

package net.entrofi.workouttracker.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import net.entrofi.workouttracker.domain.model.User;
import org.springframework.hateoas.ResourceSupport;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CurrentUserInfo extends ResourceSupport{

    private final boolean loggedIn;

    private final Set<String> roles = new HashSet<>();

    private final Map<String, Object> additionalInfo = new HashMap<>();

    @JsonIgnore
    private final User user;

    public CurrentUserInfo() {
        this.user = null;
        this.loggedIn = false;
    }

    public CurrentUserInfo(User user) {
        this.user = user;
        this.loggedIn = true;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getUsername() {
        return user != null ? user.getUsername() : null;
    }

    public String getEmail() {
        return user != null ? user.getEmail() : null;
    }


    public String getDisplayName() {
        if (this.user != null) {
            return this.user.getName() + " " + this.user.getLastName();
        } else {
            return null;
        }
    }

    public String getUserId() {
        return user != null ? user.getId() : null;
    }

    public Set<String> getRoles() {
        return roles;
    }


    public User getUser() {
        return user;
    }

    public Map<String, Object> getAdditionalInfo() {
        return additionalInfo;
    }
}
