package com.simi.patterns.decorator.available;

import com.simi.patterns.decorator.Getraenk;

public class Espresso extends Getraenk{
	public Espresso() {
		beschreibung = "Espresso";
	}
	@Override
	public double preis() {
		return 1.99;
	}
}
