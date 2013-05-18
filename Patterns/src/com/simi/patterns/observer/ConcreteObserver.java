package com.simi.patterns.observer;

interface Observer {
	void notification();
}

public class ConcreteObserver implements Observer {

	@Override
	public void notification() {
		System.out.println("Observer notificated");
	}

}
