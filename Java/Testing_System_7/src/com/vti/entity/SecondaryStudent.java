package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class SecondaryStudent extends Student {
	public static int seCount;

	public SecondaryStudent() {
		super();
		seCount++;
	}
}
