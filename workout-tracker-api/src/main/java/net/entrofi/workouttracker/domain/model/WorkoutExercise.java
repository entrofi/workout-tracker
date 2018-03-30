package net.entrofi.workouttracker.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO add javadoc
 * Created on 29/11/2016.
 */
@Document
public class WorkoutExercise {


    @Id
    private String id;

    private String name;

    @DBRef
    private Exercise exercise;

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

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Set<ExerciseSet> getSets() {
        return sets;
    }

    public void setSets(Set<ExerciseSet> sets) {
        this.sets = sets;
    }
}
