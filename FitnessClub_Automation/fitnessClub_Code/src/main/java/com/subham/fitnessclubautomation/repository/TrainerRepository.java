package com.subham.fitnessclubautomation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subham.fitnessclubautomation.model.Trainer;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Long> {
}
