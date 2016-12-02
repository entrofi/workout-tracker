/*
 * Copyright 2003-2016 Monitise Group Limited. All Rights Reserved.
 *
 * Save to the extent permitted by law, you may not use, copy, modify,
 * distribute or create derivative works of this material or any part
 * of it without the prior written consent of Monitise Group Limited.
 * Any reproduction of this material must contain this notice.
 */
package net.entrofi.workouttracker.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * TODO add javadoc
 * Created on 29/11/2016.
 */

@Document
public class ExerciseSet {

    private ExerciseSetData targetSetData;

    private ExerciseSetData actualSetData;

    public ExerciseSetData getTargetSetData() {
        return targetSetData;
    }

    public void setTargetSetData(ExerciseSetData targetSetData) {
        this.targetSetData = targetSetData;
    }

    public ExerciseSetData getActualSetData() {
        return actualSetData;
    }

    public void setActualSetData(ExerciseSetData actualSetData) {
        this.actualSetData = actualSetData;
    }
}
