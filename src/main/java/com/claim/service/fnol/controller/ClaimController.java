package com.claim.service.fnol.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claim.service.fnol.domain.Claim;
import com.claim.service.fnol.repository.ClaimRepository;
import com.claim.service.fnol.service.ClaimFnolService;

@RestController
@RequestMapping("/notificationLoss")
public class ClaimController {

	@Autowired
	private ClaimFnolService caimFnolService;

	@PostMapping("/createClaim")
	public String createClaim(@RequestBody Claim claim) {
		return caimFnolService.createClaim(claim);
	}

	@GetMapping("/findAllClaims")
	public List<Claim> getClaims() {
		return caimFnolService.getClaims();
	}

	@GetMapping("/findAllClaims/{id}")
	public Optional<Claim> getClaim(@PathVariable int id) {
		return caimFnolService.getClaim(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteClaim(@PathVariable int id) {
		return caimFnolService.deleteClaim(id);
	}
}
