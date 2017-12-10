package net.entrofi.workouttracker.service;


import com.mongodb.BasicDBList;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import com.mongodb.util.JSON;
import net.entrofi.workouttracker.app.WorkoutTrackerApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Optional;

import static junit.framework.TestCase.fail;

public abstract class AbstractServiceTest extends WorkoutTrackerApplicationTests {


    @Autowired
    private MongoTemplate mongoTemplate;

    protected void importJSON(final String collection, final String filePath) {
        try {
            Optional<BasicDBList> basicDBList = parseJson(collection, filePath);
            basicDBList.filter(b -> b.size() > 0).ifPresent( b -> consumeBasicDBList(collection, b));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unable to read data file: " + filePath);
        }
    }


    @Test
    public void testFind(){
        fail("not implemented yet.");
    }

    @Test
    public void testFindAll(){
        fail("not implemented yet.");
    }

    @Test
    public void testSave(){
        fail("not implemented yet.");
    }

    @Test
    public void testUpdate(){
        fail("not implemented yet.");

    }


    @Test
    public void testDelete(){
        fail("not implemented yet.");
    }

    private WriteResult consumeBasicDBList(String collection, BasicDBList b) {
        return mongoTemplate.getCollection(collection).insert(b.toArray(new DBObject[b.size()]));
    }

    private Optional<BasicDBList> parseJson(String collection, String filePath) throws IOException {
        String json = StreamUtils.copyToString(getClass().getResourceAsStream(filePath), Charset.forName("UTF-8"));

        if (mongoTemplate.getDb().collectionExists(collection)) {
            mongoTemplate.dropCollection(collection);
        }
        BasicDBList dbList = (BasicDBList) JSON.parse(json);

        return Optional.ofNullable(dbList);
    }
}
