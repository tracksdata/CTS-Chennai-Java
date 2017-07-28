package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@Column(name = "product_id")
	private String proddId;
	@Column(name = "product_name")
	private String prodName;
	private double price;

	public String getProddId() {
		return proddId;
	}

	public void setProddId(String proddId) {
		this.proddId = proddId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
