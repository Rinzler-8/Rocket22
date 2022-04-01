package com.vti;

import java.time.LocalDate;

import com.vti.Ex1.Account;
import com.vti.Ex1.Department;
import com.vti.Ex1.Group;
import com.vti.Ex1.Position;
import com.vti.Ex1.Position.PositionName;

public class Ex2 {

	public static void main(String[] args) {

		// Create 3 Positions
		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.Dev;
		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.PM;
		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.Scrum_Master;

		// Create 3 Departments
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Marketing";
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Sale";
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "CTO";

		// Create 3 Groups
		Group group1 = new Group();
		group1.GroupID = 1;
		group1.GroupName = "Testing System";
		Group group2 = new Group();
		group2.GroupID = 2;
		group2.GroupName = "Development";
		Group group3 = new Group();
		group3.GroupID = 3;
		group3.GroupName = "Sale";
		// Create 3 Accounts
		Account acc1 = new Account();
		acc1.AccountID = 1;
		acc1.Email = "daonq1";
		acc1.Username = "daonq1";
		acc1.FullName = "Dao Nguyen 1";
		acc1.DepartmentID = dep1;
		acc1.PositionID = pos1;
		acc1.CreateDate = LocalDate.now();
		Group[] groupAcc1 = { group1, group2 };
		acc1.Groups = groupAcc1;

		Account acc2 = new Account();
		acc2.AccountID = 2;
		acc2.Email = "daonq2";
		acc2.Username = "daonq2";
		acc2.FullName = "Dao Nguyen 2";
		acc2.DepartmentID = dep2;
		acc2.PositionID = pos2;
		acc2.CreateDate = LocalDate.of(2021, 03, 17);
		acc2.Groups = new Group[] { group3, group2 };

		Account acc3 = new Account();
		acc3.AccountID = 3;
		acc3.Email = "daonq3";
		acc3.Username = "daonq3";
		acc3.FullName = "Dao Nguyen 3";
		acc3.DepartmentID = dep3;
		acc3.PositionID = pos3;
		acc3.CreateDate = LocalDate.now();

		System.out.println("Account 3: AccountID : " + acc3.AccountID + " Email: " + acc3.Email + " Username: "
				+ acc3.Username + " FullName: " + acc3.FullName + " Department: " + acc3.DepartmentID.name
				+ " Position: " + acc3.PositionID.name + " Group: " + "CreateDate: " + acc3.CreateDate);
	}

}
