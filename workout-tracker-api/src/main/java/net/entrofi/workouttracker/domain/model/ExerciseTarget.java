package net.entrofi.workouttracker.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Hasan COMAK
 */
@Document
public class ExerciseTarget {

    private String name;

    private String description;

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
}
