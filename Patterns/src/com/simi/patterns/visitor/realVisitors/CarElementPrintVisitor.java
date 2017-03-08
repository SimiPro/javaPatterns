package com.simi.patterns.visitor.realVisitors;

import com.simi.patterns.visitor.CarElement;
import com.simi.patterns.visitor.ICarElementVisitor;
import com.simi.patterns.visitor.car.Body;
import com.simi.patterns.visitor.car.Car;
import com.simi.patterns.visitor.car.Engine;
import com.simi.patterns.visitor.car.Wheel;

public class CarElementPrintVisitor implements ICarElementVisitor {

	@Override
	public void visit(Body body) {
		System.out.println("Visiting Body");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Visiting Engine");
		
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Visiting Wheel");
		
	}

	@Override
	public void visit(Car car) {
		System.out.println("Visiting Car");
		
	}

	@Override
	public void visit(CarElement carElement) {
		System.out.println(carElement.getClass() + ": Has no visitor instance");
	}

}
