package com.tech3.inter_di2;

public class Coffee {

	private Americano americano;

	public Coffee(Americano americano) { //외부에서 주입받은 생성자
		this.americano = americano;
	}

	public void coffeeType() {
		System.out.println(americano.getName());
	}

}
