package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "INSURANCE_POLICY")
@Data
@NoArgsConstructor
public class InsurancePolicy {

	@Id
	@Column(name = "POLICYID")
	@Type(type = "int")
	private Integer policyId;
	
	@Column(name = "POLICYNAME", length =20)
	@Type(type = "string")
	private String policyName;
	
	@Column(name = "COMPANY", length = 20)
	@Type(type = "string")
	private String company;
	
	@Column(name = "TENURE")
	@Type(type = "float")
	private Float tenure;
	
}
