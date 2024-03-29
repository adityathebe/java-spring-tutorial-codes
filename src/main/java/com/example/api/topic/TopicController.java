package com.example.api.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

  @Autowired
  private TopicService topicService;

  @GetMapping("/topics")
  public List<Topic> getAllTopics() {
    return topicService.getAllTopics();
  }

  @GetMapping("/topics/{queryName}")
  public Topic getTopic(@PathVariable String queryName) {
    return topicService.getTopic(queryName);
  }

  @DeleteMapping("/topics/{queryName}")
  public void deleteTopic(@PathVariable String queryName) {
    topicService.deleteTopic(queryName);
  }

  @PutMapping("/topics")
  public void updateTopic(@RequestBody Topic queryTopic) {
    topicService.updateTopic(queryTopic);
  }

  @PostMapping("/topics")
  public void addTopic(@RequestBody Topic topic) {
    topicService.addTopic(topic);
  }
}
