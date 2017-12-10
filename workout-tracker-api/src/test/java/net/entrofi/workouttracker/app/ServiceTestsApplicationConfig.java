package net.entrofi.workouttracker.app;

import com.mongodb.MongoClient;
import cz.jirutka.spring.embedmongo.EmbeddedMongoFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.io.IOException;

/**
 * Created by comakh on 07/10/2015.
 */
@Configuration
@EnableMongoRepositories("net.entrofi.workouttracker.domain.repository")
@ComponentScan({"net.entrofi.workouttracker.service", "net.entrofi.workouttracker.domain"})
public class ServiceTestsApplicationConfig {


    private static final String MONGO_DB_URL = "localhost";

    private static final String MONGO_DB_NAME = "embeded_db";


    @Primary
    @Bean
    public MongoTemplate mongoTemplate() throws IOException {
        EmbeddedMongoFactoryBean mongo = new EmbeddedMongoFactoryBean();
        mongo.setBindIp(MONGO_DB_URL);
        MongoClient mongoClient = mongo.getObject();
        MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, MONGO_DB_NAME);
        return mongoTemplate;
    }
}
