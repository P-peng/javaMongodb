package com.mogo.utils;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * @author dengzhipeng
 * @date 2019/06/04
 */
public class MongoClientUtil {
    private static final String addres = "localhost";
    private static final int port = 27017;
    private static final String db = "runoobdb";
    private static final String collection = "site2";


    public static MongoClient getMongoClient(){
        MongoClient mongoClient = new MongoClient(addres, port);
        return mongoClient;
    }
    public static MongoCollection<Document> getMongoCollection(){
        MongoClient mongoClient = getMongoClient();
        MongoDatabase mongoDatabase = mongoClient.getDatabase(db);
        return mongoDatabase.getCollection(collection);
    }

}
