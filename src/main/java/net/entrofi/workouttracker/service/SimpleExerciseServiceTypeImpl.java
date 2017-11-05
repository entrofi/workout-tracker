package net.entrofi.workouttracker.service;

import net.entrofi.workouttracker.domain.model.ExerciseType;
import net.entrofi.workouttracker.domain.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hasan on 11/30/2016.
 */
public class SimpleExerciseServiceTypeImpl implements ExerciseTypeService {

    @Autowired
    private ExerciseRepository.ExerciseTypeRepository exerciseTypeRepository;

    @Override
    public ExerciseType save(ExerciseType exerciseTypexerciseType) {
        return null;
    }

    @Override
    public ExerciseType update(ExerciseType exerciseType) {
        return null;
    }

    @Override
    public void delete(ExerciseType exerciseType) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ExerciseType find(String id) {
        return null;
    }

    @Override
    public List<ExerciseType> findAll() {
        return null;
    }
}
