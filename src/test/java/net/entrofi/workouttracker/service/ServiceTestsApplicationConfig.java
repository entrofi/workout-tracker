package net.entrofi.workouttracker.service;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by comakh on 07/10/2015.
 */
@Configuration
@EnableMongoRepositories("net.entrofi.workouttracker.domain.repository")
@ComponentScan({"net.entrofi.workouttracker.service", "net.entrofi.workouttracker.domain"})
public class ServiceTestsApplicationConfig {

    protected String getDatabaseName() {
        return "hrm_mongo_test";
    }


    @Bean(name = "mongoClient")
    public MongoClient mongoClient() throws Exception {
        return new MongoClient();
    }

    @Bean(name = "mongoTemplate")
    public MongoTemplate mongoTemplate() throws Exception{
        return new MongoTemplate(new SimpleMongoDbFactory(mongoClient(), getDatabaseName()));
    }
}
