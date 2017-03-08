package com.simi.patterns.visitor.car;

import com.simi.patterns.visitor.CarElement;
import com.simi.patterns.visitor.ICarElement;
import com.simi.patterns.visitor.ICarElementVisitor;

public class Car  extends CarElement {
	ICarElement[] elements;
	
	public Car() {
		this.elements = new ICarElement[] {
			new Wheel("front left"), new Wheel("front right")
			, new Wheel("tail left"), new Wheel("tail right")
			, new Body(), new Engine()
		};
	}

	@Override
	public void accept(ICarElementVisitor visitor) {
		for (ICarElement elem : elements) {
			elem.accept(visitor);
		}
		visitor.visit(this);
	}

}
