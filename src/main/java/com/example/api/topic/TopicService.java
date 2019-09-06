package com.example.api.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TopicService {

  @Autowired
  private TopicRepository topicRepository;

  public List<Topic> getAllTopics() {
    List<Topic> topics = new ArrayList<>();
    topicRepository.findAll().forEach(topics::add);
    return topics;
  }

  public Topic getTopic(String queryId) {
    return topicRepository.findById(queryId).get();
  }

  public void addTopic(Topic topic) {
    topicRepository.save(topic);
  }

  public void updateTopic(Topic topic) {
    topicRepository.save(topic);
  }

  public void deleteTopic(String queryId) {
    topicRepository.deleteById(queryId);
  }
}
