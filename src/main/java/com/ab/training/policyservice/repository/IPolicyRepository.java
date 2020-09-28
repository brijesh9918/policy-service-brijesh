package com.ab.training.policyservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ab.training.policyservice.model.Policy;

public interface IPolicyRepository extends MongoRepository<Policy, String>{

}
