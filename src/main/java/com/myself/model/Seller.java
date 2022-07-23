package com.myself.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sellerid;
	
	private String sellerName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> prod_list = new ArrayList<>();

	public Seller() {
		super();
		
	}

	public Seller(Integer sellerid, String sellerName, List<Product> prod_list) {
		super();
		this.sellerid = sellerid;
		this.sellerName = sellerName;
		this.prod_list = prod_list;
	}

	public Integer getSellerid() {
		return sellerid;
	}

	public void setSellerid(Integer sellerid) {
		this.sellerid = sellerid;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public List<Product> getProd_list() {
		return prod_list;
	}

	public void setProd_list(List<Product> prod_list) {
		this.prod_list = prod_list;
	}
	
	

}
