
package net.entrofi.workouttracker.service;

import net.entrofi.workouttracker.domain.model.ExerciseType;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

/**
 * TODO add javadoc
 * Created on 30/11/2016.
 */
public class ExerciseTypeServiceTest extends AbstractServiceTest {


    @Autowired
    private ExerciseTypeService exerciseTypeService;

    public void testSave() {
        ExerciseType exerciseType = new ExerciseType();
        exerciseType.setDescription("Test exercise");
        exerciseType.setName("Test save");
        exerciseTypeService.save(exerciseType);
        assertNotNull(exerciseType.getId());
    }
}
