package com.test.mart;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.test.mart.beans.Product;
import com.test.mart.service.ProductService;


@WebService
public class ProductCatalog {
	
	ProductService productService = new ProductService();
	
	
	public List<String> productList()
	{
	
		return productService.productList();
	}

	
	public int add(int a , int b)
	{
		return productService.add(a, b);
		
	}
	
	public int multiply(int a , int b)
	{
		return productService.mul(a, b);
		
	}
	
	public String getName(String name)
	{
		return productService.getProductName(name);
	}
	
	
	/*public Product addProcuct (Product p)
	{
		return p;
		
	}*/
}
