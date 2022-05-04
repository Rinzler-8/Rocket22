package com.vti.entity;

import com.vti.utils.ScannerUtils;

public class Position {
	private int posId;
	private PositionName posName;

	public enum PositionName {
		Dev, Test, Scrum_Master, PM
	}

	@Override
	public String toString() {
		return "Position [posId=" + posId + ", posName=" + posName + "]";
	}

	public Position() {
		super();
		System.out.println("Enter the position: ");
		while (true) {
			int choice = ScannerUtils.inputIntPositive();
			switch (choice) {
			case 1:
				this.posName = PositionName.Dev;
				break;
			case 2:
				this.posName = PositionName.Test;
				break;
			case 3:
				this.posName = PositionName.Scrum_Master;
				break;
			case 4:
				this.posName = PositionName.PM;
				break;
			default:
				System.out.println("Invalid. Try again");
				break;
			}
		}
	}
}
