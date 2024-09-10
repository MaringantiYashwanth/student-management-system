package com.student_management_system.StudentManagementSystem.mongodb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoDBConfig {
 
    @Value("${spring.data.mongodb.uri}")
    private String mongoUri;
 
    @Value("${spring.data.mongodb.database}")
    private String mongoDatabase;
 
    @Bean
    public MongoTemplate mongoTemplate() {
        MongoClient mongoClient = MongoClients.create(mongoUri);
        return new MongoTemplate(mongoClient, mongoDatabase);
    }
}