
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
