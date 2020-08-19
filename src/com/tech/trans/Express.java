package com.tech.trans;

public class Express extends Trans implements Start, End { //복합,다중 상속
	private int eDan;

	public Express(int cusCnt, int dis, int eDan) {
		super(cusCnt, dis); // 부모클래스_trans의 내용
		this.eDan = eDan; // 자식클래스_train만이 가진 값
	}

	@Override
	public int getCharge() {
		return cusCnt * dis * eDan;

	}

	@Override
	public String getStartStation() {
		// TODO Auto-generated method stub
		return "서울";
	}

	@Override
	public String getEndStation() {
		// TODO Auto-generated method stub
		return "부산";
	}
}
