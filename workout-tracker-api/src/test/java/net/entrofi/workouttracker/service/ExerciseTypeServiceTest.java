
package net.entrofi.workouttracker.service;

import net.entrofi.workouttracker.domain.model.ExerciseType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.style.ToStringCreator;

import static org.junit.Assert.assertNotNull;

/**
 * TODO add javadoc
 * Created on 30/11/2016.
 */
public class ExerciseTypeServiceTest extends AbstractServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExerciseTypeServiceTest.class);


    private static final String DEFAULT_DESCRIPTION = "Default description";
    @Autowired
    private ExerciseTypeService exerciseTypeService;


    @Before
    public void setUp(){
        importJSON("exerciseType", "/data/exercise_types_sample.json");
    }


    @Test
    public void save() throws Exception {
        ExerciseType exerciseType = saveExerciseType("Dumble Triceps Extension", "Extend triceps with dumble");
        assertNotNull(exerciseType.getId());
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




    private ExerciseType saveExerciseType(String name, String description){
        ExerciseType exerciseType = new ExerciseType();
        exerciseType.setDescription(description);
        exerciseType.setName(name);
        return exerciseTypeService.save(exerciseType);
    }



}
