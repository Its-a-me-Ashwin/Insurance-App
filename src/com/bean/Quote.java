package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quote {
	@Id
	private int Id;
	private float MonthlyPremium;
	private float DwellingCoverage;
	private int PersonalProperty;
	private float Medicalexpense;
	private int Additional;
	private float Deductible;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public float getMonthlyPremium() {
		return MonthlyPremium;
	}
	public void setMonthlyPremium(float monthlyPremium) {
		MonthlyPremium = monthlyPremium;
	}
	public float getDwellingCoverage() {
		return DwellingCoverage;
	}
	public void setDwellingCoverage(float dwellingCoverage) {
		DwellingCoverage = dwellingCoverage;
	}
	public int getPersonalProperty() {
		return PersonalProperty;
	}
	public void setPersonalProperty(int personalProperty) {
		PersonalProperty = personalProperty;
	}
	public float getMedicalexpense() {
		return Medicalexpense;
	}
	public void setMedicalexpense(float medicalexpense) {
		Medicalexpense = medicalexpense;
	}
	public int getAdditional() {
		return Additional;
	}
	public void setAdditional(int additional) {
		Additional = additional;
	}
	public float getDeductible() {
		return Deductible;
	}
	public void setDeductible(float deductible) {
		Deductible = deductible;
	}
	@Override
	public String toString() {
		return "Quote [Id=" + Id + ", MonthlyPremium=" + MonthlyPremium + ", DwellingCoverage=" + DwellingCoverage
				+ ", PersonalProperty=" + PersonalProperty + ", Medicalexpense=" + Medicalexpense + ", Additional="
				+ Additional + ", Deductible=" + Deductible + ", email=" + email + "]";
	}
	
	
}
