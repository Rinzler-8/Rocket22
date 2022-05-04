/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/

DROP DATABASE IF EXISTS finaltest;
CREATE DATABASE finaltest;
USE finaltest;

/*============================== CREATE TABLE =======================================*/
/*======================================================================================*/

-- create table 1: Department  id, FullName, Email, Password
CREATE TABLE `User` (
    UserID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    FullName VARCHAR(50) NOT NULL,
    Email VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password` VARCHAR(50) NOT NULL CHECK (LENGTH(`Password`) >= 6),
	`Role`		ENUM('Employee', 'Manager'),
    ExpInYear TINYINT UNSIGNED,
    ProSkill VARCHAR(50),
    ProjectId INT
);


/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/

INSERT INTO `User`  (FullName,				Email,						`Password`,			ExpInYear ,			ProSkill	,	ProjectId	,`Role`		) 
VALUES		                                                                                                     
					(N'Jackson Bridge',	  	'Bridge123@gmail.com', 		'Bridging123',		null		,		'dev'	, 		1245	,	'Employee'		),
					(N'Duy Pham',			'duy0321@gmail.com', 		'agsdwweq'	,		5			,	    'sql'	,		1245	,	'Manager'	),
                    (N'Kano',				'K213@gmail.com', 			'onmyway12412',		7			,		'test'	,		52489	,	'Manager'	),
                    (N'Johnny Cage',		'Johnnyyy88@gmail.com', 	'letsgooo'	,		null		,		'java' ,		52489	,	'Employee'	),
                    (N'21 savage',			'21ForLife@gmail.com', 		'alotftjcole',		8			,		'java' , 		1245  	,	'Manager'	),
                    (N'Lil Wave',			'23ForLife@gmail.com', 		'alotftjcole',		8			,		'sql' , 		1245  	,	'Employee'	);
                    
                    
                    