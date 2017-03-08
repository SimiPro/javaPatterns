package com.simi.patterns.visitor.main;

import com.simi.patterns.visitor.ICarElement;
import com.simi.patterns.visitor.car.Car;
import com.simi.patterns.visitor.realVisitors.CarElementDoVisitor;
import com.simi.patterns.visitor.realVisitors.CarElementPrintVisitor;

public class Main {

	public static void main(String[] args) {
		final ICarElement car = new Car();
		
		car.accept(new CarElementDoVisitor());
		car.accept(new CarElementPrintVisitor());
	}
}
