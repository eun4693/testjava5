package com.tech.trans;

public class Train extends Trans {

	private int tDan;

	public Train(int cusCnt, int dis, int tDan) {
		super(cusCnt, dis); //�θ�Ŭ����_trans�� ����
		this.tDan=tDan; //�ڽ�Ŭ����_train���� ���� ��
	}

	
	@Override
	public int getCharge() {
		return cusCnt*dis*tDan; 
		// super class�� �������� �� ������ ���� ���� : private���� �����Ǿ� �ֱ� ����
		// cusCnt,dis�� ���������ڸ� default,protected �� �ϳ��� ��� ��
		// protected�� ���� ��Ű�� �ȿ��� ��� ����
	}

}
