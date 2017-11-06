package net.entrofi.workouttracker.service;


import com.mongodb.BasicDBList;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import net.entrofi.workouttracker.app.WorkouttrackerApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

import static junit.framework.TestCase.fail;

public abstract class AbstractServiceTest extends WorkouttrackerApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    protected void importJSON(String collection, String filePath) {
        try {
            String json = StreamUtils.copyToString(getClass().getResourceAsStream(filePath), Charset.forName("UTF-8"));

            if (mongoTemplate.getDb().collectionExists(collection)) {
                mongoTemplate.dropCollection(collection);
            }
            BasicDBList basicDBList = (BasicDBList) JSON.parse(json);
            mongoTemplate.getCollection(collection).insert(basicDBList.toArray(new DBObject[basicDBList.size()]));
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

}
