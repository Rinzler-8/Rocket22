USE test_assignment_1;

#Question 1
CREATE VIEW SaleView AS
SELECT acc.*, de.DepartmentName FROM Account acc 
INNER JOIN Department de ON acc.DepartmentID = de.DepartmentID 
WHERE de.DepartmentName = "Sale";

SELECT * FROM SaleView;

#Question 2

CREATE VIEW AccountList AS SELECT acc.*, COUNT(ga.AccountID) FROM groupaccount ga 
INNER JOIN Account acc ON ga.AccountID = acc.AccountID
GROUP BY ga.AccountID
HAVING COUNT(ga.AccountID) =
(SELECT MAX(CountAcc) FROM
(SELECT COUNT(ga2.AccountID) AS CountAcc FROM GroupAccount ga2 GROUP BY ga2.AccountID) AS HighestCount);
SELECT * FROM AccountList;

#Question 3
DROP VIEW IF EXISTS ContentQuaDai;
CREATE VIEW ContentQuaDai AS 
SELECT * FROM Question
WHERE LENGTH(Content) > 300;

SELECT * FROM ContentQuaDai;

#Question 4 

CREATE VIEW DepartmentView AS 
SELECT de.*, COUNT(ac.DepartmentID) FROM Department de
INNER JOIN Account ac ON ac.DepartmentID = de.DepartmentID 
GROUP BY ac.DepartmentID
HAVING COUNT(ac.DepartmentID) =
(SELECT MAX(CountAcc) FROM
(SELECT COUNT(ac2.DepartmentID) AS CountAcc FROM Account ac2 GROUP BY ac2.DepartmentID) AS HighestCount);

#Question 5 
CREATE VIEW NguyenView AS 
SELECT q.QuestionID, q.Content, acc.FullName FROM Question q
INNER JOIN account acc ON acc.AccountID = q.CreatorID
WHERE SUBSTRING_INDEX(acc.FullName, " ", 1) = "Nguyễn";

SELECT * FROM NguyenView; 