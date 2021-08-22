package com.bean;

public class QuoteDetails {
	private String address1;
	private String address2;
	private String state;
	private String city;
	private String zip;
	
	
	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private String ssid;
	
	
	private int value;
	private int area;
	private String roof;
	private int fullBaths;
	private int halfBaths;
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSsid() {
		return ssid;
	}
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	public int getFullBaths() {
		return fullBaths;
	}
	public void setFullBaths(int fullBaths) {
		this.fullBaths = fullBaths;
	}
	public int getHalfBaths() {
		return halfBaths;
	}
	public void setHalfBaths(int halfBaths) {
		this.halfBaths = halfBaths;
	}
	@Override
	public String toString() {
		return "QuoteDetails [address1=" + address1 + ", address2=" + address2 + ", state=" + state + ", city=" + city
				+ ", zip=" + zip + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", email="
				+ email + ", ssid=" + ssid + ", value=" + value + ", area=" + area + ", roof=" + roof + ", fullBaths="
				+ fullBaths + ", halfBaths=" + halfBaths + "]";
	}
	
}
