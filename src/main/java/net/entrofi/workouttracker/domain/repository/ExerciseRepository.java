
package net.entrofi.workouttracker.domain.repository;

import net.entrofi.workouttracker.domain.model.Exercise;
import net.entrofi.workouttracker.domain.model.ExerciseType;
import org.springframework.data.repository.CrudRepository;

/**
 * TODO add javadoc
 * Created on 29/11/2016.
 */
public interface ExerciseRepository extends CrudRepository<Exercise, String>{
    /**
     * Created by hasan on 11/30/2016.
     */
    interface ExerciseTypeRepository extends CrudRepository<ExerciseType, String> {

    }
}
