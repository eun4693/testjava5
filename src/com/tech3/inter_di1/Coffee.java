package com.tech3.inter_di1;

public class Coffee {
	private HotAmericano ame; // ame ��ü ����_null�� �ʱ�ȭ ��
	// private IceAmericano ame;

	public Coffee() { // CoffeeŬ������ ������
		// System.out.println("���� ȣ������?");
		ame = new HotAmericano(); // ��ü�� �����ϰ� �������
		// ame = new IceAmericano();

		// System.out.println(ame);
	}

	public void coffeeType() {
		System.out.println(ame.getName());
	}

}
