package com.test.mart.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8026614420015337114L;
	private int id;
	private String name;
	private List<String> list = new ArrayList<String>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", list=");
		builder.append(list);
		builder.append("]");
		return builder.toString();
	}
	public Product(int id, String name, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}
	
	
	

}
