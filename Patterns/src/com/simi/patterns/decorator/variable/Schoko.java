package com.simi.patterns.decorator.variable;

import com.simi.patterns.decorator.Getraenk;
import com.simi.patterns.decorator.ZutatenDekorierer;

public class Schoko extends ZutatenDekorierer {

	private Getraenk getraenk;

	public Schoko(Getraenk getraenk) {
		this.getraenk = getraenk;
	}	

	@Override
	public String getBeschreibung() {
		return getraenk.getBeschreibung() + ", Schoko";
	}

	@Override
	public double preis() {
		return .2 + getraenk.preis();
	}
}
