package com.vti.entity;

public class HinhTron extends HinhHoc {
	public HinhTron(Float a, Float b) throws Exception {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Float tinhChuVI(Float a, Float b) {
		return 2 * a * (Configs.PI);
	}

	@Override
	public Float tinhDienTich(Float a, Float b) {
		return (float) (Configs.PI * (Math.pow(a, 2)));
	}
}
