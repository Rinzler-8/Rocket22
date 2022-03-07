use test_assignment_1;
#Question2
SELECT * FROM Department;

#Question3
SELECT DepartmentID FROM Department WHERE DepartmentName = "Sale";

#Question4
SELECT * FROM Account 
ORDER BY length(FullName) DESC
LIMIT 1
;

#Question5
SELECT * FROM Account 
WHERE DepartmentID = 3
ORDER BY length(FullName) DESC
LIMIT 1
;

#Question6
SELECT GroupName 
FROM `Group` 
WHERE CreateDate < "2019/12/20";

#Question7
SELECT DepartmentID FROM Department WHERE DepartmentName = "Sale";

#Question8
SELECT ExamID 
FROM Exam 
WHERE Duration >= 60
AND CreateDate < "2019-12-20"
;

#Question11
SELECT *
FROM Account
WHERE(SUBSTRING_INDEX(FullName, " ", -1))	LIKE "K%"
;

#Question9
SELECT * 
FROM `Group` 
ORDER BY CreateDate DESC
LIMIT 5
;

#Question10
SELECT COUNT(AccountID) 
FROM Account 
WHERE DepartmentID = 2;

#Question12
DELETE FROM Account WHERE CreateDate < "2019-12-20";

#Question13
DELETE FROM Question
WHERE Content LIKE "Câu hỏi%";

#Question14
UPDATE Account
SET FullName = "Nguyễn Bá Lộc", Email = "loc.nguyenba@vti.com.vn"
WHERE AccountID = 5;

#Question15
UPDATE GroupAccount
SET GroupID = 4
WHERE AccountID = 5;


