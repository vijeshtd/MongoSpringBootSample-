package com.claim.service.fnol.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.claim.service.fnol.domain.Claim;

public interface ClaimRepository  extends MongoRepository<Claim, Integer>{ 

}
