package com.tech3.inter_di2;

public class CoffeeTest {
	public static void main(String[] args) {
		
		HotAmericano hot = new HotAmericano(); //HotAmericano�� ��ü ����
		IceAmericano ice = new IceAmericano(); //IceAmericano�� ��ü ����
		Coffee coffee = new Coffee(ice); //Coffee�� ��ü ����
		//��Ʈ�� �ڽ�!! �������� inter_di1���� �ξ� ����
		//di1�� ���忡�� �ٲ㼭 ���
		//di2�� ����ϴ� ������ ������ �� �ְ� ��
		
		coffee.coffeeType(); 
	}

}
