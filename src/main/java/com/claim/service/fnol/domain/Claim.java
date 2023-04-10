package com.claim.service.fnol.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "claim")
public class Claim {

	@Id
	private long claimId;
	private String claimClass;
	private String lossType;
	private String lossCause;
}