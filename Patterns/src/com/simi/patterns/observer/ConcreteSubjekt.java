package com.simi.patterns.observer;

import java.util.ArrayList;


	interface Subjekt {
		void registerObserver(Observer beob);
		void removeObserver(Observer beob);
		void notificateObservers();
	}
	
	public class ConcreteSubjekt  implements Subjekt {
		
		
		public final ArrayList<Observer> observer = new ArrayList<>();
		
		@Override
		public void registerObserver(Observer beob) {
				observer.add(beob);
		}
	
		@Override
		public void removeObserver(Observer beob) {
			observer.remove(beob);
		}
	
		@Override
		public void notificateObservers() {
			for (Observer obs : observer) {
				obs.notification();
			}
		}
	}
