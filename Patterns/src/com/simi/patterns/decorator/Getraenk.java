package com.simi.patterns.decorator;
public abstract class Getraenk  {
	protected String beschreibung = "Unbekanntes Getraenk";
	
	public String getBeschreibung() {
		return beschreibung;
	}
	
	public abstract double preis();
}


