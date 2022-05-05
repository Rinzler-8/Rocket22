/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/

DROP DATABASE IF EXISTS UserManager;
CREATE DATABASE UserManager;
USE UserManager;

/*============================== CREATE TABLE =======================================*/
/*======================================================================================*/

-- create table 1: Department  id, FullName, Email, Password
CREATE TABLE `User`(
	UserID 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName 	VARCHAR(50) NOT NULL,
    Email 		VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password`	VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    `Role`		ENUM('Employee', 'Admin'),
    ExpInYear	TINYINT UNSIGNED,
    ProSkill	VARCHAR(50) 
);


/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/

INSERT INTO `User`  (FullName, 				Email,				 		`Password`,			ExpInYear		,		ProSkill	,	`Role`			) 
VALUES		                                                                                                     
					(N'Nguyễn Thị Mỵ',		'mynt2407@gmail.com', 		'Mynguyen123',			null		,		'dev'		,	'Employee'		),
					(N'Nguyễn Ngọc Duy',	'duynn03@gmail.com', 		'duyNguyen',			5			,		'sql'			,	'Admin'			),
                    (N'Nguyễn Hùng Mạnh',	'hungmanh@gmail.com', 		'hunGmanh1',			null		,		'test'		,	'Employee'		),
                    (N'Tống Thị Nhung',		'nhung@gmail.com', 			'nhungtOng',			null		,		'java'		,	'Employee'		),
                    (N'Trần Thị Kim Anh',	'kimoanh.tran@gmail.com', 	'tran.kim',				null		,		'java'		,	'Employee'		);
                    
                    
                    