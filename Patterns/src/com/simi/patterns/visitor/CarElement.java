package com.simi.patterns.visitor;

import com.simi.patterns.visitor.car.Body;
import com.simi.patterns.visitor.car.Car;
import com.simi.patterns.visitor.car.Engine;
import com.simi.patterns.visitor.car.Wheel;

public abstract class CarElement implements ICarElement{

	
	@Override
	public void accept(ICarElementVisitor visitor) {
		if (this instanceof Body) {
			visitor.visit((Body)this);
		} else if (this instanceof Car) {
			visitor.visit((Car)this);
		} else if (this instanceof Wheel) {
			visitor.visit((Wheel)this);
		} else if (this instanceof Engine) {
			visitor.visit((Engine)this);
		} else {
			visitor.visit(this);	
		}
		
		
	}
}
