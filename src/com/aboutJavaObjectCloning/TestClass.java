package com.aboutJavaObjectCloning;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product1 = new Product(101, "Mobile Phone", 89765.78);
		System.out.println(product1.getProduct());
		System.out.println(product1.hashCode());
		
		Product product2 = product1;
		product2.setProductPrice(67844.34);
		System.out.println(product2.getProduct());
		
		System.out.println(product1.getProduct());
		
		System.out.println(product2.hashCode());
		
		System.out.println(product2.getClass().getSimpleName());
	}

}
