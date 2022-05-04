package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class PrimaryStudent extends Student {
	public static int prCount = 0;

	public PrimaryStudent() {
		super();
		prCount++;
	}

}
