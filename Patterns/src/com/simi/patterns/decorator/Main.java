package com.simi.patterns.decorator;

import com.simi.patterns.decorator.variable.Streusel;

import com.simi.patterns.decorator.variable.Schoko;

import com.simi.patterns.decorator.available.Espresso;

public class Main {

	public static void main(String[] args) {
		Getraenk getr = new Espresso();
		getr = new Schoko(getr);
		getr = new Streusel(getr);
		System.out.println(getr.getBeschreibung() + " kostet: " + getr.preis());
	}
	
}
