package com.tech2.poly;//328p

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {
	int annual_sales;
	public void calcSalary() {
		System.out.println("Salesman 급여= 기본급 + 판매 수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}

}

class Consultant extends Employee {
	int num_project;
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

abstract class Manager extends Employee {
	int num_team;
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");

	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}

}

public class HRSTest {
	public static void calTax(Employee e) {
		// System.out.println("소득세를 계산합니다.");
		System.out.println("Salesman 비교 : "+(e instanceof Salesman));
		if (e instanceof Salesman) {
			Salesman s=(Salesman)e;
			s.annual_sales=6500000;
			System.out.println("Salesman 입니다"+s.annual_sales);
		} else if (e instanceof Manager) {
			Manager m=(Manager)e;
			m.num_team=5;
			System.out.println("Manager 입니다"+m.num_team);
		} else if (e instanceof Consultant) {
			Consultant c=(Consultant)e;
			c.num_project=35;
			System.out.println("Consultant입니다"+c.num_project);
		}
	}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		Employee arr[] = new Employee[3]; // 배열선언

		arr[0] = s;
		arr[1] = c;
		arr[2] = d;

		// calTax(arr[0]);
		// calTax(arr[1]);
		// calTax(arr[2]);
		calTax(c);
//		for (Employee object : arr) { // arr에서 1개씩 뽑아 object로 보내므로
//			calTax(object); // calTax(object)로 기입하면 됨
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