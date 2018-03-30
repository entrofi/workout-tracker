package net.entrofi.workouttracker.domain.repository;

import net.entrofi.workouttracker.api.RequestMappingConstants;
import net.entrofi.workouttracker.domain.model.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * TODO add javadoc
 * Created on 30/11/2016.
 */
@RepositoryRestResource
public interface ExerciseRepository extends MongoRepository<Exercise, String> {
}
