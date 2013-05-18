package com.simi.patterns.decorator.available;

import com.simi.patterns.decorator.Getraenk;

public class Hausmischung extends Getraenk {
	
	public Hausmischung() {
		beschreibung = "Hausmischung";
	}
	@Override
	public double preis() {
		return 2.5;
	}
}
