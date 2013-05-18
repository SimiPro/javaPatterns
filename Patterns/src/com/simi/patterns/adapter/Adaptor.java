package com.simi.patterns.adapter;

class Adaptor {
	public static void main(String[] args) {
		Quakabel quaki = new Ente();
		Quakabel gans = new EntenAdapter(new Gans());
		quaki.quak();
		gans.quak();
	}
}

interface Quakabel {
	void quak();
}

class Ente implements Quakabel {
	@Override
	public void quak() {
		System.out.println("Ent quak");
	}
}

class Gans {
	void knurr() {
		System.out.println("Gans knurr");
	}
}

class EntenAdapter implements Quakabel {
	
	private Gans gans;

	public EntenAdapter(Gans gans) {
		this.gans = gans;
	}
	
	@Override
	public void quak() {
		gans.knurr();
	}
}