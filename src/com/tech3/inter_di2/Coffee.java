package com.tech3.inter_di2;

public class Coffee {

	private Americano americano;

	public Coffee(Americano americano) { //�ܺο��� ���Թ��� ������
		this.americano = americano;
	}

	public void coffeeType() {
		System.out.println(americano.getName());
	}

}