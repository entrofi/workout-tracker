package net.entrofi.workouttracker.domain.repository;

import net.entrofi.workouttracker.domain.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by comakh on 29/09/2015.
 */
@RepositoryRestResource
public interface UserRepository extends MongoRepository<User, String> {

    User findById(String id);

    User findByUsername(String username);

    User findByEmail(String email);
}
