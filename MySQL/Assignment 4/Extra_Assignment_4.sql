CREATE DATABASE IF NOT EXISTS Extra_Assignment_3;
USE Extra_Assignment_3;

DROP TABLE IF EXISTS Employee_Skill_Table;
#Question 1
CREATE TABLE Department (
	Department_Number INT NOT NULL AUTO_INCREMENT,
    Department_Name VARCHAR(150) NOT NULL UNIQUE,
    PRIMARY KEY(Department_Number)
);

CREATE TABLE Employee_Table(
	Employee_Number INT NOT NULL AUTO_INCREMENT,
    Employee_Name VARCHAR(150) NOT NULL,
    Department_Number INT NOT NULL,
    PRIMARY KEY(Employee_Number),
    FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number)
);

CREATE TABLE Employee_Skill_Table (
	Employee_Number INT NOT NULL,
    Skill_Code VARCHAR(150) NOT NULL,
    Date_Registered DATETIME,
    FOREIGN KEY (Employee_Number) REFERENCES Employee_Table(Employee_Number)
);

#Question 2
#Department 
INSERT INTO `extra_assignment_3`.`department` (`Department_Number`, `Department_Name`) VALUES ('1', 'IT');
INSERT INTO `extra_assignment_3`.`department` (`Department_Number`, `Department_Name`) VALUES ('2', 'Marketing');
INSERT INTO `extra_assignment_3`.`department` (`Department_Number`, `Department_Name`) VALUES ('3', 'Finance');
INSERT INTO `extra_assignment_3`.`department` (`Department_Number`, `Department_Name`) VALUES ('4', 'Sales');
INSERT INTO `extra_assignment_3`.`department` (`Department_Number`, `Department_Name`) VALUES ('5', 'Human Resource');
INSERT INTO `extra_assignment_3`.`department` (`Department_Number`, `Department_Name`) VALUES ('6', 'Purchase');
INSERT INTO `extra_assignment_3`.`department` (`Department_Number`, `Department_Name`) VALUES ('7', 'Operations');
INSERT INTO `extra_assignment_3`.`department` (`Department_Number`, `Department_Name`) VALUES ('8', 'Accounting');
INSERT INTO `extra_assignment_3`.`department` (`Department_Number`, `Department_Name`) VALUES ('9', 'Treasury');
INSERT INTO `extra_assignment_3`.`department` (`Department_Number`, `Department_Name`) VALUES ('10', 'Administration');

#Employee
INSERT INTO `extra_assignment_3`.`employee_table` (`Employee_Number`, `Employee_Name`, `Department_Number`) VALUES ('1', 'phuc15', '1');
INSERT INTO `extra_assignment_3`.`employee_table` (`Employee_Number`, `Employee_Name`, `Department_Number`) VALUES ('2', 'phuc12', '3');
INSERT INTO `extra_assignment_3`.`employee_table` (`Employee_Number`, `Employee_Name`, `Department_Number`) VALUES ('3', 'phucnguyen12', '5');
INSERT INTO `extra_assignment_3`.`employee_table` (`Employee_Number`, `Employee_Name`, `Department_Number`) VALUES ('4', 'phuc17', '8');
INSERT INTO `extra_assignment_3`.`employee_table` (`Employee_Number`, `Employee_Name`, `Department_Number`) VALUES ('5', 'phuc8', '1');
INSERT INTO `extra_assignment_3`.`employee_table` (`Employee_Number`, `Employee_Name`, `Department_Number`) VALUES ('8', 'PhucSAD123', '9');

#EmployeeSkill
INSERT INTO `extra_assignment_3`.`employee_skill_table` (`Employee_Number`, `Skill_Code`, `Date_Registered`) VALUES ('1', 'Python', '2002-8-1');
INSERT INTO `extra_assignment_3`.`employee_skill_table` (`Employee_Number`, `Skill_Code`, `Date_Registered`) VALUES ('2', 'Java ', '2020-5-15');
INSERT INTO `extra_assignment_3`.`employee_skill_table` (`Employee_Number`, `Skill_Code`, `Date_Registered`) VALUES ('8', 'Java', '2020-5-16');
INSERT INTO `extra_assignment_3`.`employee_skill_table` (`Employee_Number`, `Skill_Code`, `Date_Registered`) VALUES ('3', 'NodeJS', '2020-5-17');
INSERT INTO `extra_assignment_3`.`employee_skill_table` (`Employee_Number`, `Skill_Code`, `Date_Registered`) VALUES ('4', 'HTML', '2020-10-15');
INSERT INTO `extra_assignment_3`.`employee_skill_table` (`Employee_Number`, `Skill_Code`, `Date_Registered`) VALUES ('1', 'SQL', '2002-5-15');

#Question 3
SELECT et.Employee_Number FROM employee_table et
UNION DISTINCT
SELECT est.Employee_Number FROM employee_skill_table est 
WHERE Skill_Code = "Java";

#Question 4
SELECT de.Department_Number, de.Department_Name, COUNT(et.Employee_Number) FROM department de
INNER JOIN Employee_table et ON de.Department_Number = et.Department_Number
GROUP BY et.Department_Number
HAVING COUNT(et.Employee_Number) > 3
; 

#Question 5
SELECT et.Department_Number, de.Department_Name, et.Employee_Number, et.Employee_Name  FROM employee_table et 
LEFT JOIN department de ON et.Department_Number = de.Department_Number
GROUP BY et.Employee_Number;

#Question 6
SELECT et.Employee_Number, et.Employee_Name FROM employee_table et
LEFT JOIN employee_skill_table est ON et.Employee_Number = est.Employee_Number
HAVING COUNT(Skill_Code) > 2;
