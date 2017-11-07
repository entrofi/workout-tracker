package net.entrofi.workouttracker.domain.repository;

import net.entrofi.workouttracker.domain.model.ExerciseType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * TODO add javadoc
 * Created on 30/11/2016.
 */
@RepositoryRestResource
public interface ExerciseTypeRepository extends MongoRepository<ExerciseType, String> {
}
