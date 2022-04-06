package tut2;

import java.time.LocalDate;

import org.w3c.dom.ls.LSOutput;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;

public class Ex1 {
	static Account acc2 = new Account();
	static Account acc1 = new Account();
	static Account acc3 = new Account();

	static Department dep1 = new Department();
	static Department dep2 = new Department();
	static Department dep3 = new Department();

	static Position pos1 = new Position();
	static Position pos2 = new Position();
	static Position pos3 = new Position();

	static Group group1 = new Group();
	static Group group2 = new Group();
	static Group group3 = new Group();

	void q1() {
		System.out.println("---------Question 1 Check acc2:---------");
		if (acc2.accDepartment == null) {
			System.out.println("This account doesn't have department.");
		} else {
			System.out.println("This account's department is: " + acc2.accDepartment.departmentName);
		}
	}

	private static void q3() {
		System.out.println("---------Question 3: ternary to do Question1---------");

		System.out.println(acc2.accDepartment == null ? "This account doesn't have department."
				: "This account's department is: " + acc2.accDepartment.departmentName);
	}

	private static void q4() {
		System.out.println("---------Question 4: ternary to find Position---------");

		System.out.println(acc1.accPosition.name.toString() == "Dev" ? "This is a Dev." : "This is not a Dev ");
	}

	private static void q5() {
		System.out.println("---------Question 5: switch case to find acc num in group 1---------");
		if (group1.accounts == null) {
			System.out.println("No accounts in this group");
		} else {
			int countAcc = group1.accounts.length;
			switch (countAcc) {
			case 1:
				System.out.println("Group has 1 account");
				break;
			case 2:
				System.out.println("Group has 2 accounts");
				break;
			case 3:
				System.out.println("Group has 3 accounts");
				break;
			default:
				System.out.println("Group has 4 accounts");
				break;
			}

		}
	}

	private static void q7() {
		System.out.println("---------Question 7: switch case to do question 4---------");
		String positionName = acc1.accPosition.name.toString();
		switch (positionName) {
		case ("Dev"):
			System.out.println("This is a dev");
			break;
		default:
			System.out.println("This is not a dev");
			break;
		}
	}

	// for-each
	private static void q8() {
		System.out.println("---------Question 8: switch case to do question 4---------");
		Account[] accArr = { acc1, acc2, acc3 };
		for (Account account : accArr) {
			System.out.println("AccountID: " + account.id + " Email: " + account.email + " Full name: "
					+ account.fullName + " Account department: " + account.accDepartment.departmentName);
		}
	}

	// for
	private static void q10() {
		System.out.println("---------Question 10: switch case to do question 4---------");
		Account[] accArr1 = { acc1, acc2, acc3 };
		for (int i = 0; i < accArr1.length; i++) {
			System.out.println("Account no " + (i + 1) + " :");

			System.out.println("- Email: " + accArr1[i].email + "gmail.com");
			System.out.println("- Full name: " + accArr1[i].fullName);
			System.out.println("- Department: " + accArr1[i].accDepartment.departmentName);

		}
	}

	private static void q13() {
	System.out.println(

			"----------Question 13:In ra thông tin tất cả các account ngoại trừ account thứ 2: ------------");
			Account[] accArr2 = { acc1, acc2, acc3 };
			for (int i = 0; i < accArr2.length; i++) {
			if (accArr2[i]!= acc2) {
			System.out.println("Thông tin account thứ " + (i + 1) + " :");

			System.out.println("Email: " + accArr2[i].email);
			System.out.println("Full name: " + accArr2[i].fullName);

			System.out.println("Phòng ban: " + accArr2[i].accDepartment.departmentName);

			}
			}}

	public static void main(String[] args) {

		Object object = new Object();
		object.toString();
		// Create 3 Positions
		pos1.id = 1;
		pos1.name = PositionName.Dev;

		pos2.id = 2;
		pos2.name = PositionName.PM;

		pos3.id = 3;
		pos3.name = PositionName.Scrum_Master;

		// Create 3 Departments
		dep1.id = 1;
		dep1.departmentName = "Marketing";
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.departmentName = "Sale";
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.departmentName = "CTO";

		// Create 3 Groups

		group1.groupID = 1;
		group1.groupName = "Testing System";
		Group group2 = new Group();
		group2.groupID = 2;
		group2.groupName = "Development";
		Group group3 = new Group();
		group3.groupID = 3;
		group3.groupName = "Sale";

		// Create 3 Accounts
		acc1.id = 1;
		acc1.email = "daonq1";
		acc1.username = "daonq1";
		acc1.fullName = "Dao Nguyen 1";
		acc1.accDepartment = dep1;
		acc1.accPosition = pos1;
		acc1.createDate = LocalDate.now();
		Group[] gracc1 = { group1, group2 };
		acc1.Groups = gracc1;

		acc2.id = 2;
		acc2.email = "daonq2";
		acc2.username = "daonq2";
		acc2.fullName = "Dao Nguyen 2";
		acc2.accDepartment = dep2;
		acc2.accPosition = pos2;
		acc2.createDate = LocalDate.of(2021, 03, 17);
		acc2.Groups = new Group[] { group3, group2 };

		acc3.id = 3;
		acc3.email = "daonq3";
		acc3.username = "daonq3";
		acc3.fullName = "Dao Nguyen 3";
		acc3.accDepartment = dep3;
		acc3.accPosition = pos3;
		acc3.createDate = LocalDate.now();

		// add Group Account
		group1.accounts = new Account[] { acc1 };
		group2.accounts = new Account[] { acc1, acc2 };
		group3.accounts = new Account[] { acc3 };

		Ex1 exer1 = new Ex1();
		exer1.q1();
		exer1.q3();
		exer1.q5();
		exer1.q8();
		exer1.q10();
		exer1.q13();
	}
}
