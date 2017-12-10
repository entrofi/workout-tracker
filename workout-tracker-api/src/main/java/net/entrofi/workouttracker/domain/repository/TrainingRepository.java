/*
 * Copyright 2017 Boynergrup A.,S.. All Rights Reserved.
 *
 * Save to the extent permitted by law, you may not use, copy, modify,
 * distribute or create derivative works of this material or any part
 * of it without the prior written consent of Boynergrup A.,S..
 * Any reproduction of this material must contain this notice.
 */
package net.entrofi.workouttracker.domain.repository;

import net.entrofi.workouttracker.domain.model.Training;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface TrainingRepository extends MongoRepository<Training, String> {
}
