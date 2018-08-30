package com.capgemini.day6;

import java.util.Objects;

public class Television {
	private String company;
	private String type;
	private String enabled3D;
	private int price;
	public Television() {
		super();
	}
	
public Television(String company,String type,String enabled3D,int price) {
	this.company=company;
	this.type=type;
	this.enabled3D=enabled3D;
	this.price=price;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getEnabled3D() {
	return enabled3D;
}

public void setEnabled3D(String enabled3d) {
	enabled3D = enabled3d;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Television [company=" + company + ", type=" + type +", enabled3D=" + enabled3D + ",price=" + price + "]";
}


@Override
public int hashCode() {
	return Objects.hash(company,type,price);
}

@Override
public boolean equals(Object obj) {
	if(this == obj)
		return true;
	if(obj == null)
		return false;
	if(this.getClass() != obj.getClass())
		return false;
	
	Television t2 = (Television)obj;
	return this.company == t2.company && this.type == t2.type && this.price == t2.price;
}
}

