#table 1 
create table Department (
	DepartmentID int not null auto_increment,
    DepartmentName varchar(50),
    Primary key(DepartmentID)
);

#table 2
create table `Position` (
	PositionID int not null auto_increment,
    PositionName enum("Dev", "Test", "Scrum Master", "PM" )  not null,
    Primary key(PositionID)
);

#table 3
create table Account (
	AccountID int not null auto_increment,
    Email varchar(50) not null,
    Username varchar(50)  not null,
    FullName varchar(50) not null,
    DepartmentID int not null,
    PositionID int not null,
    CreateDate timestamp default current_timestamp(),
    Primary key(AccountID)
);

#table 4
create table `Group` (
	GroupID int not null auto_increment,
    GroupName varchar(50) not null,
    CreatorID int not null,
    CreateDate timestamp default current_timestamp(),
    Primary key(GroupID)
);

#table 5
create table GroupAccount (
	GroupID int not null auto_increment,
    AccountID int not null,
    JoinDate timestamp default current_timestamp(),
    Primary key(GroupID)
);

#table 6
create table TypeQuestion (
	TypeID int not null auto_increment,
    TypeName varchar(50) not null,
    Primary key(TypeID)
);

#table 7
create table CategoryQuestion (
	CategoryID int not null auto_increment,
    CategoryName varchar(50) not null,
    Primary key(CategoryID)
);

#table 8
create table Question  (
	QuestionID int not null auto_increment,
    Content varchar(50) not null,
    CategoryID int not null,
    TypeID int not null,
    CreatorID int  not null,
    CreateDate timestamp default current_timestamp(),
    Primary key(QuestionID)
);

#table 9
create table Answer (
	AnswerID int not null auto_increment,
    Content varchar(50) not null,
    QuestionID int not null,
    isCorrect bool not null,
    Primary key(AnswerID)
);

#table 10
create table Exam (
	ExamID int not null auto_increment,
    Code varchar(50) not null,
    Title varchar(50)  not null,
    CategoryID int not null,
    Duration datetime,
	CreateDate timestamp default current_timestamp(),
    Primary key(ExamID)
);

#table 11
create table ExamQuestion (
	ExamID int not null auto_increment,
    QuestionID int not null,
    constraint Primary key(ExamID)
);



