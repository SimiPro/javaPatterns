package com.simi.patterns.factory;

public  class FactoryClient {
	
	public static void main(String[] args) {
		AProductFactory productFactory = new ConcreteProductFactory();
		IProduct product = productFactory.createProduct();
	}
}
