package net.entrofi.workouttracker.app;


import net.entrofi.workouttracker.WorkoutTrackerApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = WorkoutTrackerApplication.class)
@TestPropertySource(locations = "classpath:test-application.properties")
@ContextConfiguration(classes = {ServiceTestsApplicationConfig.class})
public abstract class WorkoutTrackerApplicationTests {

}
