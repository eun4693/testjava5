package com.tech.trans;

public class Express extends Trans implements Start, End { //����,���� ���
	private int eDan;

	public Express(int cusCnt, int dis, int eDan) {
		super(cusCnt, dis); // �θ�Ŭ����_trans�� ����
		this.eDan = eDan; // �ڽ�Ŭ����_train���� ���� ��
	}

	@Override
	public int getCharge() {
		return cusCnt * dis * eDan;

	}

	@Override
	public String getStartStation() {
		// TODO Auto-generated method stub
		return "����";
	}

	@Override
	public String getEndStation() {
		// TODO Auto-generated method stub
		return "�λ�";
	}
}
