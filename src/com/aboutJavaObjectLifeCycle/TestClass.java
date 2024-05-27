package com.aboutJavaObjectLifeCycle;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product(101, "Mobile Phone", 89765.78);
		System.out.println(product.getProduct());

		product = null;
		
		System.gc();
		
	}

}
