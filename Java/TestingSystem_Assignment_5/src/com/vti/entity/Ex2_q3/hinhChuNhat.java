package com.vti.entity.Ex2_q3;

public class hinhChuNhat {
	private int dai;
	private int rong;

	public int tinhChuVi(int dai, int rong) {
		return (dai + rong) * 2;
	};

	public int tinhDienTich(int dai, int rong) {
		return dai * rong;
	};

	public hinhChuNhat() {

	}

	public hinhChuNhat(int dai, int rong) {
		super();
		this.dai = dai;
		this.rong = rong;
	}

}
