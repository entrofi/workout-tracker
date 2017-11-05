
package net.entrofi.workouttracker.domain.model;

/**
 * TODO add javadoc
 * Created on 29/11/2016.
 */
public class ExerciseSetData {

    private int repetitions;

    /**
     * target exercise set time in milliseconds
     */
    private Long time;

    /**
     * for weight training this field will hold mass, for repetitive exercises it will hold number for metric
     * exercises like running this field will hold the related scalar like distance.
     */
    private Double load;


    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Double getLoad() {
        return load;
    }

    public void setLoad(Double load) {
        this.load = load;
    }
}
