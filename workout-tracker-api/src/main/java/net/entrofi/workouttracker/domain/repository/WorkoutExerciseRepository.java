package net.entrofi.workouttracker.domain.repository;

import net.entrofi.workouttracker.domain.model.WorkoutExercise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * TODO add javadoc
 * Created on 29/11/2016.
 */
@RepositoryRestResource
public interface WorkoutExerciseRepository extends MongoRepository<WorkoutExercise, String> {

}
