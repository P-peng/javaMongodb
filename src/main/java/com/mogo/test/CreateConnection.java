package com.mogo.test;

import com.mogo.entity.Site2;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.Test;

/**
 * @author dengzhipeng
 * @date 2019/06/04
 */
public class CreateConnection {

    @Test
    public void createConnection(){
        // 连接到 mongodb 服务
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoClient mongoClient2 = new MongoClient("localhost", 27017);
        // 连接到数据库
        MongoDatabase mongoDatabase = mongoClient.getDatabase("runoobdb");
        // 获取集合
        MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("site2");
        // 指定查询过滤器
        Bson filter = Filters.eq("address", "知乎");
        // 查找集合中的所有文档
        FindIterable findIterable = mongoCollection.find(filter);
        // 迭代文档
        MongoCursor cursor = findIterable.iterator();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }
}
