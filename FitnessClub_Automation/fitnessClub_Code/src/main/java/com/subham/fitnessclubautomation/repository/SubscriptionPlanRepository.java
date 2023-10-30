package com.subham.fitnessclubautomation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subham.fitnessclubautomation.model.SubscriptionPlan;

@Repository
public interface SubscriptionPlanRepository extends CrudRepository<SubscriptionPlan, Long> {
}
