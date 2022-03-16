USE test_assignment_1;
#Question 1
DROP PROCEDURE IF EXISTS AccFromDep;
DELIMITER $$
CREATE PROCEDURE AccFromDep (IN pa_DepartName VARCHAR(150))
BEGIN
SELECT acc.AccountID, acc.FullName, de.DepartmentName FROM account acc
INNER JOIN department de ON de.DepartmentID = acc.DepartmentID
WHERE de.DepartmentName = pa_DepartName;
END$$
DELIMITER ;
CALL AccFromDep('Military');

#Question 2
DROP PROCEDURE IF EXISTS NoAccInGroup;
DELIMITER $$
CREATE PROCEDURE NoAccInGroup(IN p_GroupName VARCHAR(150)) 
BEGIN 
SELECT gr.GroupID ,gr.GroupName, COUNT(gracc.AccountID) FROM `group` gr 
INNER JOIN GroupAccount gracc ON gr.GroupID = gracc.GroupID
WHERE gr.GroupName = p_GroupName;
END$$
DELIMITER ;
CALL NoAccInGroup("Spetsnaz");

#Question 3
DROP PROCEDURE IF EXISTS NoTypeInMonth
DELIMITER $$
CREATE PROCEDURE NoTypeInMonth () 
BEGIN 
SELECT tq.TypeID, tq.TypeName, COUNT(q.TypeID) FROM typequestion tq
INNER JOIN question q ON tq.TypeID = q.TypeID 
WHERE month(q.CreateDate) = (month(now()) AND year(now()) = year(q.CreateDate))
GROUP BY q.TypeID;
END $$
DELIMITER ;
CALL NoTypeInMonth();

#Question 4
DROP PROCEDURE IF EXISTS HighestNoType
DELIMITER $$
CREATE PROCEDURE HighestNoType () 
BEGIN 
SELECT q.TypeID, COUNT(q.TypeID) FROM typequestion tq
INNER JOIN question q ON tq.TypeID = q.TypeID 
GROUP BY q.TypeID
HAVING COUNT(q.TypeID) =
(SELECT MAX(CountType) FROM 
(SELECT COUNT(q2.TypeID) AS CountType FROM question q2 GROUP BY q2.TypeID) AS Highest);
END $$
DELIMITER ;
CALL HighestNoType();

#Question 5
DROP PROCEDURE IF EXISTS NoTypeInMonth
DELIMITER $$
CREATE PROCEDURE NoTypeInMonth () 
BEGIN 
SELECT tq.TypeID, tq.TypeName, COUNT(q.TypeID) FROM typequestion tq
INNER JOIN question q ON tq.TypeID = q.TypeID 
WHERE month(q.CreateDate) = (month(now()) AND year(now()) = year(q.CreateDate))
GROUP BY q.TypeID;
END $$
DELIMITER ;
CALL NoTypeInMonth();

#Question 6
DROP PROCEDURE IF EXISTS NoTypeInMonth
DELIMITER $$
CREATE PROCEDURE NoTypeInMonth () 
BEGIN 
SELECT tq.TypeID, tq.TypeName, COUNT(q.TypeID) FROM typequestion tq
INNER JOIN question q ON tq.TypeID = q.TypeID 
WHERE month(q.CreateDate) = (month(now()) AND year(now()) = year(q.CreateDate))
GROUP BY q.TypeID;
END $$
DELIMITER ;
CALL NoTypeInMonth();

#Question 7
DROP PROCEDURE IF EXISTS NoTypeInMonth
DELIMITER $$
CREATE PROCEDURE NoTypeInMonth () 
BEGIN 
SELECT tq.TypeID, tq.TypeName, COUNT(q.TypeID) FROM typequestion tq
INNER JOIN question q ON tq.TypeID = q.TypeID 
WHERE month(q.CreateDate) = (month(now()) AND year(now()) = year(q.CreateDate))
GROUP BY q.TypeID;
END $$
DELIMITER ;
CALL NoTypeInMonth();
