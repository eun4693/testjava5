package com.tech.trans;

public class Train extends Trans {

	private int tDan;

	public Train(int cusCnt, int dis, int tDan) {
		super(cusCnt, dis); //부모클래스_trans의 내용
		this.tDan=tDan; //자식클래스_train만이 가진 값
	}

	
	@Override
	public int getCharge() {
		return cusCnt*dis*tDan; 
		// super class꺼 가져왔을 때 오류가 나는 이유 : private으로 설정되어 있기 때문
		// cusCnt,dis의 접근제한자를 default,protected 중 하나를 써야 함
		// protected는 같은 패키지 안에서 사용 가능
	}

}
