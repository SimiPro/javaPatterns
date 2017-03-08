package com.simi.patterns.visitor;

public interface ICarElement {
	void accept(final ICarElementVisitor visitor);
}

