package com.vti.entity;

import com.vti.entity.Position.PositionName;

public class Position {
	public int id;
	public PositionName name;

	public enum PositionName {
		Dev, Test, Scrum_Master, PM
	}
}