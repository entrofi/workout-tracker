package net.entrofi.workouttracker.domain.model.projections;


import net.entrofi.workouttracker.domain.model.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {User.class})
public interface UserPublicProjection {

    String getId();

    String getUsername();

    String getName();

    String getLastName();

    String getEmail();
}
