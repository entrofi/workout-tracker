package net.entrofi.workouttracker.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

/**
 * TODO add javadoc
 * Created on 29/11/2016.
 */
@Document
public class Workout {

    private LocalDate date;

    private Exercise warmUpExcercise;

    private int streching;

    private LocalTime startTime;

    private LocalTime endTime;

    private String notes;

    private Mood mood;

    private int averageHeartRate;

    private int maxHeartRate;

    private Set<Exercise> exercises;

    private Training training;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Exercise getWarmUpExcercise() {
        return warmUpExcercise;
    }

    public void setWarmUpExcercise(Exercise warmUpExcercise) {
        this.warmUpExcercise = warmUpExcercise;
    }

    public int getStreching() {
        return streching;
    }

    public void setStreching(int streching) {
        this.streching = streching;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public int getAverageHeartRate() {
        return averageHeartRate;
    }

    public void setAverageHeartRate(int averageHeartRate) {
        this.averageHeartRate = averageHeartRate;
    }

    public int getMaxHeartRate() {
        return maxHeartRate;
    }

    public void setMaxHeartRate(int maxHeartRate) {
        this.maxHeartRate = maxHeartRate;
    }

    public Set<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(Set<Exercise> exercises) {
        this.exercises = exercises;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }
}
