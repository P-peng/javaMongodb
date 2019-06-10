package com.mogo.test;

import com.mogo.utils.MongoClientUtil;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import org.bson.conversions.Bson;
import org.junit.Test;

/**
 * @author dengzhipeng
 * @date 2019/06/04
 */
public class selectCollection {

    @Test
    public void list(){
        MongoCollection mongoCollection = MongoClientUtil.getMongoCollection();
        FindIterable findIterable = mongoCollection.find();
        MongoCursor cursor = findIterable.iterator();
        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }

    @Test
    public void condition(){
        MongoCollection mongoCollection = MongoClientUtil.getMongoCollection();
        Bson filter = Filters.eq("cn_name", "邓志鹏");
        FindIterable findIterable = mongoCollection.find(filter);
        // 指定查询过滤器
        MongoCursor cursor = findIterable.iterator();
        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
}
