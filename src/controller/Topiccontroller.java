package controller;

import Model.Topic;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Topiccontroller {
    List<Topic> topicList = new ArrayList<>();

    int idCounter = 0;
    public String addNewTopic(String topicName){
        idCounter+=1;
        int id = idCounter;
        Timestamp createdAt = new Timestamp(System.currentTimeMillis());
        Timestamp updatedAt = createdAt;
        Topic object = new Topic(id, topicName, createdAt, updatedAt);
        topicList.add(object);
        return  "Successfully New topic added";
    }
}