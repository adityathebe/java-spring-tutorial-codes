package com.example.api.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

  @Autowired
  private TopicService topicService;

  @RequestMapping("/topics")
  public List<Topic> getAllTopics() {
    return topicService.getAllTopics();
  }

  @RequestMapping("/topics/{queryName}")
  public Topic getTopic(@PathVariable String queryName) {
    return topicService.getTopic(queryName);
  }


  @PostMapping("/topics")
  public void addTopic(@RequestBody Topic topic) {
    topicService.addTopic(topic);
  }
}
