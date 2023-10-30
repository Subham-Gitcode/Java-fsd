package com.subham.fitnessclubautomation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subham.fitnessclubautomation.model.SubscriptionPlan;
import com.subham.fitnessclubautomation.repository.SubscriptionPlanRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubscriptionPlanService {
    @Autowired
    SubscriptionPlanRepository subscriptionPlanRepository;

    public SubscriptionPlan addSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
        return subscriptionPlanRepository.save(subscriptionPlan);
    }

    public void deleteSubscriptionPlan(Long subscriptionPlan_id) {
        subscriptionPlanRepository.deleteById(subscriptionPlan_id);
    }

    public List<SubscriptionPlan> getAllSubscriptionPlans() {
        List<SubscriptionPlan> subscriptionPlans = new ArrayList<>();
        subscriptionPlanRepository.findAll().forEach(subscriptionPlans::add);
        return subscriptionPlans;
    }

    public SubscriptionPlan getSubscriptionPlan(Long subscriptionPlan_id) {
        return subscriptionPlanRepository.findById(subscriptionPlan_id).get();
    }
}
