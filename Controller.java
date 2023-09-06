package com.example.demo12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@RestController
public class Controller {

   @Autowired
   private TopicService topicService;
    @RequestMapping ("/topics")
   // @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public List<Topic> getalltopics(){
        return  topicService.getallTopics();

    }
    @RequestMapping("/topics/{id}")
    public  Topic getTopic(@PathVariable String id)
    {
        return  topicService.gettopic(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addtopic(@RequestBody Topic topic)
    {
        topicService.addtopic(topic);
    }
    @RequestMapping(method =RequestMethod.PUT, value="/topics/{id}")
    public void update(@RequestBody Topic topic, @PathVariable String id )
    {
        topicService.update(id,topic);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
    public void  delete(@PathVariable String id )
    {
        topicService.delete(id);
    }
}
