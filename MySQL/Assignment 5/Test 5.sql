USE test_assignment_1;
#Câu 1: Liệt kê những tài khoản đã thi 2 lần sử dụng IN và EXISTS 
SELECT * FROM Account acc WHERE AccountID in
(SELECT CreatorID FROM Exam GROUP BY CreatorID 
HAVING COUNT(CreatorID) > 1);

SELECT * FROM Account acc WHERE EXISTS
(SELECT CreatorID FROM Exam b WHERE acc.AccountID = b.CreatorID
GROUP BY CreatorID 
HAVING COUNT(CreatorID) > 1);

#Câu 2: Chọn ra bài thi có thời gian lớn hơn thời gian trung bình
SELECT * FROM exam ex 
WHERE Duration > (SELECT(AVG(Duration)));

SELECT * FROM Exam ex WHERE Duration <> (SELECT AVG(Duration) FROM Exam);

#Câu 3
SELECT AccountID,Email,ExamID FROM Account acc 
INNER JOIN Exam ex 
ON acc.AccountID = ex.CreatorID;

-- WITH CTE_Name (col1,col2) AS (CTE_Query)
-- SELECT/INSERT/DELETE/UPDATE/CREATE VIEW...
-- FROM CTE_Name;
-- WHERE condition

CREATE VIEW ExamView AS 
SELECT ExamID, Duration 
FROM Exam 
WHERE Exam.ExamID = 3;

WITH CTE_ExamView AS 
(SELECT AccountID,Email, Title, Code FROM Account 
INNER JOIN Exam ex 
ON Account.AccountID = ex.CreatorID)
DELETE FROM CTE_ExamView WHERE CTE_ExamView.AccountID = 1;
SELECT * FROM CTE_ExamView;

SET SQL_SAFE_UPDATES = 0;
DELETE from `account` where account.AccountID IN ( WITH CTE_lamnhungoc AS 
( Select AccountID,Email, FullName, Code,Title,exam.CreateDate from `account` 
inner join exam 
on `account`.AccountID = exam.CreatorID and `account`.AccountID > 5 ) 
Select AccountID from CTE_lamnhungoc
);

-- UPDATE account set Email="An@gmail.com" where AccountID IN (
--  WITH CTE_lamnhungoc AS ( 
--  Select AccountID,Email, FullName, Code,Title,exam.CreateDate from `account` inner join exam on `account`.AccountID = exam.CreatorID 
-- )
-- select AccountID from CTE_lamnhungoc
-- )

