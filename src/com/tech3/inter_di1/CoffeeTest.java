package com.tech3.inter_di1;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee coffee = new Coffee(); // Coffee의 "new ~" 생성자 호출
		coffee.coffeeType(); // HotAmericano or IceAmericano,Coffee 두곳을 들려서 여기서 출력
	}

}
