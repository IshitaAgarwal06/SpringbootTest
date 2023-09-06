package com.example.demo12;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics= new ArrayList<>(Arrays.asList(new Topic("java","java id","descripton"),
            new Topic("spring","spring id"," spring descripton"),
            new Topic("php","php id","php descripton"))
    );

    public List<Topic> getallTopics() {
        return topics;
    }
    public Topic gettopic(String id)
    {
        return topics.stream().filter(t ->t.getId().equalsIgnoreCase(id)).findFirst().get();
    }
    public  void addtopic(Topic topic)
    {topics.add(topic);
    }
    public void update(String id, Topic topic)
    {
        for (int i =0;i< topics.size();i++)

        {
            Topic t=topics.get(i);
            if(t.getId().equals(id))
            {
                topics.set(i,topic);
            }
        }
    }


    public void delete(String id) {
        topics.removeIf(t->t.getId().equals(id));
        //topics.remove(topics.stream().filter(topic -> topic.getId().equals(id)).findFirst());
//        for (int i =0;i< topics.size();i++)
//
//        {
//            Topic t=topics.get(i);
//            if(t.getId().equals(id))
//            {
//                topics.remove(t);
//            }
//        }
    }
}