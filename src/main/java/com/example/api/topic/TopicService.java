package com.example.api.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
  private List<Topic> topics = new ArrayList<>(Arrays.asList(
    new Topic(1, "Spring", "Spring framework"),
    new Topic(2, "Hibernate", "Hibernate Framework")
  ));

  public List<Topic> getAllTopics() {
    return topics;
  }

  public Topic getTopic(String queryName) {
    return topics.stream().filter(topic -> topic.getName().equals(queryName)).findFirst().get();
  }

  public void addTopic(Topic topic) {
    topics.add(topic);
  }
}
