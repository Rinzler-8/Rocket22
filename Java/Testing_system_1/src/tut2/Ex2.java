package tut2;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		dep1.departmentName = "Marketing";
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.departmentName = "Sale";
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.departmentName = "CTO";

		// Create 3 Groups
		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "Testing System";
		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "Development";
		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "Sale";

		// Create 3 Accounts
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "daonq1";
		acc1.username = "daonq1";
		acc1.fullName = "Dao Nguyen 1";
		acc1.accDepartment = dep1;
		acc1.accPosition = pos1;
		acc1.createDate = LocalDate.now();
		Group[] groupAcc1 = { group1, group2 };
		acc1.Groups = groupAcc1;

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "daonq2";
		acc2.username = "daonq2";
		acc2.fullName = "Dao Nguyen 2";
		acc2.accDepartment = dep2;
		acc2.accPosition = pos2;
		acc2.createDate = LocalDate.of(2021, 03, 17);
		acc2.Groups = new Group[] { group3, group2 };

		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "daonq3";
		acc3.username = "daonq3";
		acc3.fullName = "Dao Nguyen 3";
		acc3.accDepartment = dep3;
		acc3.accPosition = pos3;
		acc3.createDate = LocalDate.now();

		System.out.println("---------Question 1 Check acc2:---------");
		if (acc2.accDepartment == null) {
			System.out.println("This account doesn't have department.");
		} else {
			System.out.println("This account's department is: " + acc2.accDepartment.departmentName);
		}
	}
}
