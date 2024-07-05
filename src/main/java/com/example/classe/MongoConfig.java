package com.example.classe;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.classe.repositories")
public class MongoConfig extends AbstractMongoClientConfiguration {


        @Override
        protected String getDatabaseName() {
            return "classDB";
        }

        @Override
        public MongoClient mongoClient() {
            return MongoClients.create("mongodb://127.0.0.1:27017");
        }

}
