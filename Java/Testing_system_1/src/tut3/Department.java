package tut3;

import java.util.Comparator;
import java.time.LocalDate;

import org.w3c.dom.ls.LSOutput;

import com.vti.entity.Account;

import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;

public class Department implements Comparator<Department> {
	int id;
	String name;

	@Override
	public String toString() {
		return "Department{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

	@Override // ghi đè phương thức compare của Interface Comparator
	public int compare(Department o1, Department o2) {
		return o1.name.compareTo(o2.name);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		Department department = (Department) o;
		if (name.equals(department.name)) {
			return true;
		}
		return false;
	}


Department[] departments = new Department[5];
Department department1 = new Department();
department1.setId(1);
department1.setDepartmentName("Sale");
Department department2 = new Department();
department2.id = 2;
department2.departmentName = "Marketing";
Department department3 = new Department();
department3.id = 3;
department3.departmentName = "Boss of director";
Department department4 = new Department();
department4.id = 4;
department4.departmentName = "Waiting room";
Department department5 = new Department();
department5.id = 5;
department5.departmentName = "Accounting";
departments[0] = department1;
departments[1] = department2;
departments[2] = department3;
departments[3] = department4;
departments[4] = department5;
}