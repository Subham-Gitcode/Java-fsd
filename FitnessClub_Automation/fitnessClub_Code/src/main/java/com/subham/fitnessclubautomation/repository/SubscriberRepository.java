package com.subham.fitnessclubautomation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subham.fitnessclubautomation.model.Subscriber;

@Repository
public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {
}
