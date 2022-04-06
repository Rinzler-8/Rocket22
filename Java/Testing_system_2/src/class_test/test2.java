package class_test;

import java.time.LocalDate;

import com.vti.Ex1.Account;
import com.vti.Ex1.Group;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "daonq2";
		acc2.username = "daonq2";
		acc2.fullName = "Dao Nguyen 2";
		acc2.departmentID = dep2;
		acc2.positionID = pos2;
		acc2.createDate = LocalDate.of(2021, 03, 17);
		acc2.Groups = new Group[] { group3, group2 };
	}

}
