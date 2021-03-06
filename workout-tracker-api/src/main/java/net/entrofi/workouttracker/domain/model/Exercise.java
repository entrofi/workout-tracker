package net.entrofi.workouttracker.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * Metadata holder for exercise. Mainly gives the description and name for the exercise.
 */
@Document
public class Exercise {

    @Id
    private String id;

    private String name;

    private String description;

    private Set<ExerciseTarget> targets = new HashSet<>();

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<ExerciseTarget> getTargets() {
        return targets;
    }

    public void setTargets(Set<ExerciseTarget> targets) {
        this.targets = targets;
    }
}
