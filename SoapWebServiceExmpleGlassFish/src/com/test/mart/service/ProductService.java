package com.test.mart.service;

import java.util.ArrayList;
import java.util.List;

import com.test.mart.beans.Product;

public class ProductService {

	
	public List<String> productList()
	{
	
		List<String> products = new ArrayList<>();
		products.add("Tea");
		products.add("coffee");
		products.add("milk");
		
		return products;
		
	}
	
	
	public int add(int a , int b)
	{
		return a+b;
		
	}
	
	
	
	public int mul(int a , int b)
	{
		return a*b;
		
	}
	
	
	public String getProductName(String productName)
	
	{
		return productName;
		
	}
	
	
	/*public Product  addProduct(Product product)
	
	{
		List<String> bottles = new ArrayList<>();
		bottles.add("Plastic");
		bottles.add("Glass");
	   return product = new Product(1, "Bottle", bottles);
		
		return product;
	}*/
}
