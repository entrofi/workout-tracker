/*
 * Copyright 2003-2016 Monitise Group Limited. All Rights Reserved.
 *
 * Save to the extent permitted by law, you may not use, copy, modify,
 * distribute or create derivative works of this material or any part
 * of it without the prior written consent of Monitise Group Limited.
 * Any reproduction of this material must contain this notice.
 */
package net.entrofi.workouttracker.service;

import net.entrofi.workouttracker.domain.model.ExerciseType;
import net.entrofi.workouttracker.domain.model.User;
import net.entrofi.workouttracker.domain.repository.ExerciseTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;
import java.util.List;

/**
 * TODO add javadoc
 * Created on 30/11/2016.
 */
@Named("exerciseTypeService")
public class ExerciseTypeServiceImpl implements ExerciseTypeService {

    @Autowired
    private ExerciseTypeRepository exerciseTypeRepository;

    @Override
    public ExerciseType save(ExerciseType exerciseType) {
        return exerciseTypeRepository.save(exerciseType);
    }

    @Override
    public ExerciseType update(ExerciseType exerciseType) {
        return  exerciseTypeRepository.save(exerciseType);
    }

    @Override
    public void delete(ExerciseType exerciseType) {
        exerciseTypeRepository.delete(exerciseType);
    }

    @Override
    public void delete(String id) {
        exerciseTypeRepository.delete(id);
    }

    @Override
    public ExerciseType find(String id) {
        return exerciseTypeRepository.findOne(id);
    }

    @Override
    public List<ExerciseType> findAll() {
        return (List) exerciseTypeRepository.findAll();
    }
}
