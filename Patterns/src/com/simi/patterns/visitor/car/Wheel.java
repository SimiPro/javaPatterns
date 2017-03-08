package com.simi.patterns.visitor.car;

import com.simi.patterns.visitor.CarElement;
import com.simi.patterns.visitor.ICarElement;
import com.simi.patterns.visitor.ICarElementVisitor;

public class Wheel  extends CarElement {
	final String name;
	
	public Wheel(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
}
