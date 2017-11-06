package net.entrofi.workouttracker.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO add javadoc
 * Created on 29/11/2016.
 */
@Document
public class Exercise {


    @Id
    private String id;

    private String name;
    /**
     * Body region or target muscle group
     */
    private String targetRegion;


    private ExerciseType exerciseType;


    private Set<ExerciseSet> sets = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetRegion() {
        return targetRegion;
    }

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }

    public ExerciseType getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(ExerciseType exerciseType) {
        this.exerciseType = exerciseType;
    }

    public Set<ExerciseSet> getSets() {
        return sets;
    }

    public void setSets(Set<ExerciseSet> sets) {
        this.sets = sets;
    }
}
