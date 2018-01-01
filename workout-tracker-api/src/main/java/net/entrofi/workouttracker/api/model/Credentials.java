
package net.entrofi.workouttracker.api.model;


import org.springframework.hateoas.ResourceSupport;

public class Credentials extends ResourceSupport {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
