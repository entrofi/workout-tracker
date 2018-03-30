package net.entrofi.workouttracker.service;

import net.entrofi.workouttracker.domain.model.Exercise;

import java.util.List;

/**
 * TODO add javadoc
 * Created on 30/11/2016.
 */
public interface ExerciseService {

    Exercise save(Exercise exercise);

    void delete(Exercise exercise);

    void delete(String id);

    Exercise find(String id);

    List<Exercise> findAll();

}
