package com.mogo.test;

import com.mogo.utils.MongoClientUtil;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengzhipeng
 * @date 2019/06/04
 */
public class InsertCollection {

    @Test
    public void insertMany(){
        MongoCollection<Document> mongoCollection = MongoClientUtil.getMongoCollection();

        List<Document> list = new ArrayList<Document>(4);
        Document document = new Document()
                .append("_id", 6)
                .append("name", "dengzhipeng")
                .append("cn_name", "邓志鹏")
                .append("address", "中国");
        list.add(document);

        mongoCollection.insertMany(list);
    }
}
