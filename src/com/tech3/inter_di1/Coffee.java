package com.tech3.inter_di1;

public class Coffee {
	private HotAmericano ame; // ame 객체 생성_null로 초기화 됨
	// private IceAmericano ame;

	public Coffee() { // Coffee클래스의 생성자
		// System.out.println("나를 호출했으?");
		ame = new HotAmericano(); // 객체를 온전하게 만들어줌
		// ame = new IceAmericano();

		// System.out.println(ame);
	}

	public void coffeeType() {
		System.out.println(ame.getName());
	}

}
