package com.gts;

public class MyOwnFirstClass {
	
	public void myOwnFirstMethod() {
		System.out.println("My very own first output by method calling");
	}

	public static void main(String[] args) {
	
		System.out.println("My very own first output");
		
		MyOwnFirstClass objName = new MyOwnFirstClass();
		objName.myOwnFirstMethod();
		
	}
}
