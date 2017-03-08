package com.simi.patterns.visitor;

import com.simi.patterns.visitor.car.Body;
import com.simi.patterns.visitor.car.Car;
import com.simi.patterns.visitor.car.Engine;
import com.simi.patterns.visitor.car.Wheel;

public interface ICarElementVisitor {
	void visit(Body body);
	void visit(Engine engine);
	void visit(Wheel wheel);
	void visit(Car car);
	void visit(CarElement carElement);

}
