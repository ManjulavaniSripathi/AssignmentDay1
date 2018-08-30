package com.capgemini.day6;

import java.util.Objects;

public class CellPhone {
private String company;
private String model;
private String description;
private String operatingsystem;
private int price;
public CellPhone() {
	super();
}
public CellPhone(String company,String model,String description,String operatingsystem,int price) {
this.company=company;
this.description=description;
this.model=model;
this.operatingsystem=operatingsystem;
this.price=price;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getOperatingsystem() {
	return operatingsystem;
}
public void setOperatingsystem(String operatingsystem) {
	this.operatingsystem = operatingsystem;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "CellPhone [company=" + company + ", description=" + description +", model=" + model + ", operatingSystem=" + operatingsystem
			+ ", price=" + price + "]";

}

@Override
public int hashCode() {
	return Objects.hash(company,model,price);
}

@Override
public boolean equals(Object obj) {
	if(this == obj)
		return true;
	if(obj == null)
		return false;
	if(this.getClass() != obj.getClass())
		return false;
	
	CellPhone c2 = (CellPhone)obj;
	return this.company == c2.company && this.model == c2.model && this.price == c2.price;
}
}


