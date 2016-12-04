package net.entrofi.workouttracker.repository;

import net.entrofi.workouttracker.domain.model.ExerciseType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hasan on 11/30/2016.
 */
public interface ExerciseTypeRepository extends CrudRepository<ExerciseType, String> {

}
