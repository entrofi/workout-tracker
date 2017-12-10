package net.entrofi.workouttracker.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * TODO add javadoc
 * Created on 29/11/2016.
 */

@Document
public class ExerciseSet {

    @Id
    private String id;

    private ExerciseSetData targetSetData;

    private ExerciseSetData actualSetData;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
