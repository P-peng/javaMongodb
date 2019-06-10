package com.mogo.test;

import com.mogo.utils.MongoClientUtil;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.junit.Test;

/**
 * @author dengzhipeng
 * @date 2019/06/04
 */
public class updateCollection {

    @Test
    public void updateOne(){
        MongoCollection mongoCollection = MongoClientUtil.getMongoCollection();

        // 条件
        Bson conditino = Filters.eq("cn_name", "邓志鹏");
        //指定修改的更新文档
        Document value = new Document("$set", new Document("address", "china"));

        mongoCollection.updateMany(conditino, value);

    }

    @Test
    public void updateMany(){
        MongoCollection mongoCollection = MongoClientUtil.getMongoCollection();
    }
}
