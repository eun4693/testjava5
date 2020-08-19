package com.tech.trans;

public class TransTest {

	public static void printCharge(Trans tran) { //main���� ���� ����Ǳ� ���ؼ� static ����
		System.out.println("================");
		System.out.println(tran.toString()); //Trans�� toString ���� ������, toString�� ��������_�ؽ��ڵ�
		System.out.println("================");
		System.out.println("���ұݾ� : "+tran.getCharge());
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
		
//		for (Trans tran : trans) { //for-each��_trans���� ���빰�� ���� ������ ���� ��?
//			printCharge(tran);
//		}
		
		for (int i = 0; i < trans.length; i++) { //for��
			printCharge(trans[i]);
		}
		
		Express ex=new Express(1,10,500);
		System.out.println(ex.getStartStation());
		System.out.println(ex.getEndStation());
		
	}
}
