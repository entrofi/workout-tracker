package net.entrofi.workouttracker.domain.repository;

import net.entrofi.workouttracker.domain.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by comakh on 29/09/2015.
 */
public interface UserRepository extends CrudRepository<User, String> {

    User findById(String id);

    User findByUsername(String username);
}
