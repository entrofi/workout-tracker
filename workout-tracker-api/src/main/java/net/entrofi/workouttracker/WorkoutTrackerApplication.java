package net.entrofi.workouttracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
@EnableAutoConfiguration
@SpringBootApplication
public class WorkoutTrackerApplication {



    public static void main(String[] args) {
        SpringApplication.run(WorkoutTrackerApplication.class, args);
    }


}
