package com.tech.trans;

public class TransTest {

	public static void printCharge(Trans tran) { //main보다 먼저 실행되기 위해서 static 기입
		System.out.println("================");
		System.out.println(tran.toString()); //Trans의 toString 값을 가져옴, toString은 생략가능_해시코드
		System.out.println("================");
		System.out.println("지불금액 : "+tran.getCharge());
		System.out.println("================");
	}

	public static void main(String[] args) {
		Trans[] trans = new Trans[4];
		trans[0]=new Train(5,100,200);
		trans[1]=new Express(10, 100, 100);
		trans[2]=new Taxi(2, 10, 500);
		trans[3]=new Train(1, 100, 200);
		printCharge(trans[0]);
		printCharge(trans[1]);
		printCharge(trans[2]);
		printCharge(trans[3]);
		
//		for (Trans tran : trans) { //for-each문_trans안의 내용물이 없을 때까지 도는 것?
//			printCharge(tran);
//		}
		
		for (int i = 0; i < trans.length; i++) { //for문
			printCharge(trans[i]);
		}
		
		Express ex=new Express(1,10,500);
		System.out.println(ex.getStartStation());
		System.out.println(ex.getEndStation());
		
	}
}
