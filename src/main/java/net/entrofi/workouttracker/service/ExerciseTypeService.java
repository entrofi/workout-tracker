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
