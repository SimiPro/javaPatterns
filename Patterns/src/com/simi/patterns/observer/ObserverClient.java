package com.simi.patterns.observer;


public class ObserverClient {

	public static void main(String[] args) {
		Subjekt subjekt = new ConcreteSubjekt();
		subjekt.registerObserver(new ConcreteObserver());
		subjekt.registerObserver(new ConcreteObserver());
		subjekt.registerObserver(new ConcreteObserver());
		subjekt.notificateObservers();
	}

}
