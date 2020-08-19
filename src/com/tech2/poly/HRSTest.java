package com.tech2.poly;//328p

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman �޿�= �⺻�� + �Ǹ� ����");
	}

	public void calcBonus() {
		System.out.println("Salesman ���ʽ� = �⺻�� * 12 * 4");
	}

}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant �޿� = �⺻�� + ������ Ư�� ����");
	}

	public void calcBonus() {
		System.out.println("Consultant ���ʽ� = �⺻�� * 12 * 2");
	}
}

abstract class Manager extends Employee {
	public void calcSalary() {
		System.out.println("Manager �޿� = �⺻�� + �� ���� ����");

	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director ���ʽ� = �⺻�� * 12 * 6");
	}

}

public class HRSTest {
	public static void calTax(Employee s) {
		// System.out.println("�ҵ漼�� ����մϴ�.");
		System.out.println("Salesman �� : "+(s instanceof Salesman));
		if (s instanceof Salesman) {
			System.out.println("Salesman�Դϴ�");
		} else if (s instanceof Director) {
			System.out.println("Director�Դϴ�");
		} else if (s instanceof Consultant) {
			System.out.println("Consultant�Դϴ�");
		}
	}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		Employee arr[] = new Employee[3]; // �迭����

		arr[0] = s;
		arr[1] = c;
		arr[2] = d;

		// calTax(arr[0]);
		// calTax(arr[1]);
		// calTax(arr[2]);
		calTax(c);
//		for (Employee object : arr) { // arr���� 1���� �̾� object�� �����Ƿ�
//			calTax(object); // calTax(object)�� �����ϸ� ��
//		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// s.calcBonus();
		// c.calcBonus();
		// d.calcBonus();
		// System.out.println(s.toString());
		// System.out.println(c.toString());
		// System.out.println(d.toString());
		// Salesman s2 = s;
		//
		// calTax(s);
		// calTax(c);
		// calTax(d);
	}
}