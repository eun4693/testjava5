package com.tech3.inter_di2;

public class CoffeeTest {
	public static void main(String[] args) {
		
		HotAmericano hot = new HotAmericano(); //HotAmericano의 객체 생성
		IceAmericano ice = new IceAmericano(); //IceAmericano의 객체 생성
		Coffee coffee = new Coffee(ice); //Coffee의 객체 생성
		//컨트롤 박스!! 제어방식이 inter_di1보다 훨씬 간결
		//di1은 현장에서 바꿔서 출력
		//di2는 출력하는 곳에서 수정할 수 있게 됨
		
		coffee.coffeeType(); 
	}

}
