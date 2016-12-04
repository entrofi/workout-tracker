package net.entrofi.workouttracker.service;

import net.entrofi.workouttracker.domain.model.ExerciseType;

import java.util.List;

/**
 * TODO add javadoc
 * Created on 30/11/2016.
 */
public interface ExerciseTypeService {

    ExerciseType save(ExerciseType exerciseType);

    ExerciseType update(ExerciseType exerciseType);

    void delete(ExerciseType exerciseType);

    void delete(String id);

    ExerciseType find(String id);

    List<ExerciseType> findAll();

}
