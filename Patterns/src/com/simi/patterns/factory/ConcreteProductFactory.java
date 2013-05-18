package com.simi.patterns.factory;


class ConcreteProductFactory extends AProductFactory {
	
	
	@Override
	IProduct createProduct() {
		return new ReallyProduct();
	}
	
}