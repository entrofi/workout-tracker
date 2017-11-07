package net.entrofi.workouttracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;


@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
@EnableGlobalMethodSecurity
@EnableAutoConfiguration
@SpringBootApplication
public class WorkoutTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkoutTrackerApplication.class, args);
    }
}
