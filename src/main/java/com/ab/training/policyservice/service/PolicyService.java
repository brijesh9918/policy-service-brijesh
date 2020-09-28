package com.ab.training.policyservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.training.policyservice.model.Customer;
import com.ab.training.policyservice.model.Policy;
import com.ab.training.policyservice.repository.IPolicyRepository;

@Service
public class PolicyService {
	
	@Autowired
	IPolicyRepository policyRepository;
	
	@Autowired
	CustomerService customerService;

	public Policy createPolicy(Policy policy) {
		Customer customer;
		customer = customerService.getCustomerDetails(policy.getCustomerDetails().getCustomerId());
		policy.setCustomerDetails(customer);
		return policyRepository.save(policy);
	}

	public List<Policy> getPolicies() {
		return policyRepository.findAll();
	}

}
