package com.claim.service.fnol.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.claim.service.fnol.domain.Claim;
import com.claim.service.fnol.repository.ClaimRepository;

@Service
public class ClaimFnolService {

	@Autowired
	private ClaimRepository claimRepository;

	Logger logger = LoggerFactory.getLogger(ClaimFnolService.class);

	public String createClaim(@RequestBody Claim claim) {
		logger.info("ClaimFnolService Request triggered : {}", claim);
		claimRepository.save(claim);
		logger.info("ClaimFnolService response triggered : {}" + claim.getClaimId());
		return "Added claim with id : " + claim.getClaimId();
	}

	public List<Claim> getClaims() {
		logger.info("ClaimFnolService getClaims Request triggered ");
		return claimRepository.findAll();
	}

	public Optional<Claim> getClaim(@PathVariable int id) {
		logger.info("ClaimFnolService getClaim by Id Request triggered ");
		return claimRepository.findById(id);
	}

	public String deleteClaim(@PathVariable int id) {
		logger.info("ClaimFnolService deleteClaim by Id Request triggered ");
		claimRepository.deleteById(id);
		return "claim deleted with id : " + id;
	}
}
