package com.simi.patterns.decorator.variable;

import com.simi.patterns.decorator.Getraenk;
import com.simi.patterns.decorator.ZutatenDekorierer;

public class Streusel extends ZutatenDekorierer {

	private Getraenk getraenk;

	public Streusel(Getraenk getraenk) {
		this.getraenk = getraenk;
	}

	@Override
	public String getBeschreibung() {
		return getraenk.getBeschreibung() + ", Streusel";
	}

	@Override
	public double preis() {
		return .5 + getraenk.preis();
	}
}
