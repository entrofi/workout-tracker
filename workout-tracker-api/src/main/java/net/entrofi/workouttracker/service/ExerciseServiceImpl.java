package net.entrofi.workouttracker.service;

import net.entrofi.workouttracker.domain.model.Exercise;
import net.entrofi.workouttracker.domain.repository.ExerciseRepository;
import net.entrofi.workouttracker.domain.repository.WorkoutExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;
import java.util.List;

/**
 * TODO add javadoc
 * Created on 30/11/2016.
 */
@Named("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private ExerciseRepository exerciseTypeRepository;

    @Override
    public Exercise save(Exercise exercise) {
        return exerciseTypeRepository.save(exercise);
    }

    @Override
    public void delete(Exercise exercise) {
        exerciseTypeRepository.delete(exercise);
    }

    @Override
    public void delete(String id) {
        exerciseTypeRepository.delete(id);
    }

    @Override
    public Exercise find(String id) {
        return exerciseTypeRepository.findOne(id);
    }

    @Override
    public List<Exercise> findAll() {
        return (List) exerciseTypeRepository.findAll();
    }
}
