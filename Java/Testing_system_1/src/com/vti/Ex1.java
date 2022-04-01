package com.vti;
import java.time.LocalDate;
import java.util.Date;


//1
public class Ex1 {
	public static class Department {
		public int id;
		public String name;
	}

//2
	public static class Position {
			public int id;
			public PositionName name;

			public enum PositionName {
				Dev, Test, Scrum_Master, PM
			}
		}
	

//3	
	public static class Account {
		public int AccountID;
		public String Email;
		public String Username;
		public String FullName;
		public Department DepartmentID;
		public Position PositionID;
		public LocalDate CreateDate;
		public Group[] Groups;
	}

//4	
	public static class Group {
		public int GroupID;
		public String GroupName;
		public int CreatorID;
		public Date CreateDate;
		public Account creator;
		public Account[] accounts;
	}

//5	
	public static class GroupAccount {
		public Group GroupID;
		public Account AccountID;
		public Date JoinDate;
	}

//6	
	public static class TypeQuestion {
		public int TypeID;
		public String TypeName;

		public enum TypeName {
			Essay, MultipleChoice
		}
	}

//7	
	public static class CategoryQuestion {
		public int CategoryID;
		public String CategoryName;

	}

//8
	public static class Question {
		public int QuestionID;
		public String QuestionContent;
		public CategoryQuestion CategoryID;
		public Account CreatorID;
		public TypeQuestion TypeID;
		public Date CreateDate;

	}
//9
	public static class Answer {
		public int AnswerID;
		public String AnswerContent;
		public Question QuestionID;
		public boolean isCorrect;

	}
//10	
	public static class Exam {
		public int ExamID;
		public String Code;
		public String Title;
		public CategoryQuestion CategoryID;
		public int Duration;
		public Account CreatorID;
		public Date CreateDate;

	}
	
//11	
	public static class ExamQuestion {
		public Exam ExamID;
		public Question QuestionID;
	}
}