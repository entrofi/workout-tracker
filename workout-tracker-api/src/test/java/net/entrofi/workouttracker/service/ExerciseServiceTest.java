
package net.entrofi.workouttracker.service;

import net.entrofi.workouttracker.domain.model.Exercise;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

/**
 * TODO add javadoc
 * Created on 30/11/2016.
 */
public class ExerciseServiceTest extends AbstractServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExerciseServiceTest.class);


    private static final String DEFAULT_DESCRIPTION = "Default description";
    @Autowired
    private ExerciseService exerciseTypeService;


    @Before
    public void setUp(){
        importJSON("exerciseType", "/data/exercise_types_sample.json");
    }


    @Test
    public void save() throws Exception {
        Exercise exercise = saveExerciseType("Dumble Triceps Extension", "Extend triceps with dumble");
        assertNotNull(exercise.getId());
    }

    @Test
    public void delete_by_id() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void find() throws Exception {

    }

    @Test
    public void findAll() throws Exception {

    }




    private Exercise saveExerciseType(String name, String description){
        Exercise exercise = new Exercise();
        exercise.setDescription(description);
        exercise.setName(name);
        return exerciseTypeService.save(exercise);
    }



}
