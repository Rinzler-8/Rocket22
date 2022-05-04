package com.vti.entity.Ex2_q3;

public class hinhVuong extends hinhChuNhat {
	private int canh;

	public hinhVuong(int canh) {
		super();
		this.canh = canh;
	}

	
	public int tinhChuVi() {
		// TODO Auto-generated method stub
		return super.tinhChuVi(canh, canh);
	}

	
	public int tinhDienTich() {
		// TODO Auto-generated method stub
		return super.tinhDienTich(canh, canh);
	}

}
