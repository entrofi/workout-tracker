/*
 * Copyright 2003-2016 Monitise Group Limited. All Rights Reserved.
 *
 * Save to the extent permitted by law, you may not use, copy, modify,
 * distribute or create derivative works of this material or any part
 * of it without the prior written consent of Monitise Group Limited.
 * Any reproduction of this material must contain this notice.
 */
package net.entrofi.workouttracker.domain.repository;

import net.entrofi.workouttracker.domain.model.Exercise;
import org.springframework.data.repository.CrudRepository;

/**
 * TODO add javadoc
 * Created on 29/11/2016.
 */
public interface ExerciseRepository extends CrudRepository<Exercise, String>{
}
