package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quote {
	
	private float monthlypremium;
	private float dwellingcoverage;
	private int personalproperty;
	private float medicalexpense;
	private int additional;
	private float deductible;
	private String email;
	@Id
	private int qid;
	
	public int getId () {
		return 1;
	}
	
	public void setId() {
		return;
	}
	
	public float getMonthlypremium() {
		return monthlypremium;
	}
	public void setMonthlypremium(float monthlypremium) {
		this.monthlypremium = monthlypremium;
	}
	public float getDwellingcoverage() {
		return dwellingcoverage;
	}
	public void setDwellingcoverage(float dwellingcoverage) {
		this.dwellingcoverage = dwellingcoverage;
	}
	public int getPersonalproperty() {
		return personalproperty;
	}
	public void setPersonalproperty(int personalproperty) {
		this.personalproperty = personalproperty;
	}
	public float getMedicalexpense() {
		return medicalexpense;
	}
	public void setMedicalexpense(float medicalexpense) {
		this.medicalexpense = medicalexpense;
	}
	public int getAdditional() {
		return additional;
	}
	public void setAdditional(int additional) {
		this.additional = additional;
	}
	public float getDeductible() {
		return deductible;
	}
	public void setDeductible(float deductible) {
		this.deductible = deductible;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	@Override
	public String toString() {
		return "Quote [monthlypremium=" + monthlypremium + ", dwellingcoverage=" + dwellingcoverage
				+ ", personalproperty=" + personalproperty + ", medicalexpense=" + medicalexpense + ", additional="
				+ additional + ", deductible=" + deductible + ", email=" + email + ", qid=" + qid + "]";
	}
	
	
	
	
}
