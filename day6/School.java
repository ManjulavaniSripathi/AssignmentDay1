package com.capgemini.day6;

import java.util.Objects;

public class School {
private String name;
private String city;
private String schooldistrict;
private int greatSchoolRanking;
public School() {
	super();
}

public School(String name,String city,String schooldistrict,int greatSchoolRanking) {
	this.name=name;
	this.city=city;
	this.schooldistrict=schooldistrict;
	this.greatSchoolRanking=greatSchoolRanking;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getSchooldistrict() {
	return schooldistrict;
}

public void setSchooldistrict(String schooldistrict) {
	this.schooldistrict = schooldistrict;
}

public int getGreatSchoolRanking() {
	return greatSchoolRanking;
}

public void setGreatSchoolRanking(int greatSchoolRanking) {
	this.greatSchoolRanking = greatSchoolRanking;
}
@Override
public String toString() {
	return "School [name=" + name + ", city=" + city +", schooldistrict=" + schooldistrict + ",greatSchoolRanking=" + greatSchoolRanking + "]";
}

@Override
public int hashCode() {
	return Objects.hash(name,city,schooldistrict);
}

@Override
public boolean equals(Object obj) {
	if(this == obj)
		return true;
	if(obj == null)
		return false;
	if(this.getClass() != obj.getClass())
		return false;
	
	School s2 = (School)obj;
	return this.name == s2.name && this.city == s2.city && this.schooldistrict == s2.schooldistrict;
}
}

