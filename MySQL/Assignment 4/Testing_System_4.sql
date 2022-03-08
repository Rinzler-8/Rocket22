USE test_assignment_1;
#Question 1
SELECT * FROM Account 
INNER JOIN Department 
ON Account.DepartmentID = Department.DepartmentID;

#Question 2
SELECT * FROM Account ac
WHERE CreateDate > "2010-12-20";

#Question 3
SELECT * FROM Account ac 
INNER JOIN Position p 
ON ac.PositionID = p.PositionID
WHERE p.PositionName = "Dev";

#Question 4 
SELECT dp.DepartmentID, dp.DepartmentName FROM Department dp
INNER JOIN account ac
ON dp.DepartmentID = ac.DepartmentID
GROUP BY dp.DepartmentID HAVING COUNT(ac.DepartmentID) >= 3
;

#Question 5
SELECT Question.QuestionID, Question.Content FROM Question -- Tạo 1 bảng hoàn chỉnh cùng số lớn nhất vừa tìm được
INNER JOIN examquestion ex
ON Question.QuestionID = ex.QuestionID
GROUP BY ex.QuestionID
HAVING COUNT(ex.questionID) =
(SELECT MAX(CountQues) FROM -- Lấy kết quả vừa tìm dc, chọn ra số lớn nhất 
(SELECT COUNT(QuestionID) AS CountQues FROM examquestion GROUP BY examquestion.QuestionID) AS HighestNo); -- Đếm số lần xuất hiện của 1 QuestionID

#Question 6 
SELECT cat.CategoryID, cat.CategoryName, COUNT(Question.CategoryID) FROM categoryquestion cat
LEFT JOIN question 
ON cat.CategoryID = question.CategoryID
GROUP BY cat.CategoryID
;

#Question 7
SELECT 	q.QuestionID, q.Content, COUNT(exq.ExamID) FROM examquestion exq
RIGHT JOIN question q
ON q.QuestionID = exq.QuestionID
GROUP BY q.QuestionID;

#Question 8
SELECT q.QuestionID, q.Content FROM Question q
INNER JOIN Answer a ON a.QuestionID = q.QuestionID -- join
GROUP BY q.QuestionID -- sap xep 
HAVING COUNT(a.QuestionID) = -- so lon nhat
(SELECT MAX(CountAns) FROM -- tim so lon nhat 
(SELECT COUNT(QuestionID) AS CountAns FROM Answer group by Answer.QuestionID) AS HighestNO) ; -- tim so lan 

#Question 9
SELECT `group`.GroupID, `group`.GroupName, COUNT(GroupAccount.AccountID) AS NoOfAccounts FROM `Group`
LEFT JOIN GroupAccount ON `Group`.GroupID = GroupAccount.GroupID
GROUP BY GroupAccount.GroupID;

#Question 10
SELECT Pos.PositionID, Pos.PositionName, COUNT(Acc.PositionID) FROM Position Pos
LEFT JOIN Account acc ON Pos.PositionID = acc.PositionID
GROUP BY acc.PositionID
HAVING COUNT(acc.PositionID) = 
(SELECT MIN(CountPos) FROM
(SELECT COUNT(acc2.PositionID) AS CountPos FROM Account acc2 GROUP BY acc2.PositionID) AS LeastPos); 

#Question 11
SELECT de.DepartmentID, de.DepartmentName, pos.PositionName, COUNT(acc.PositionID) FROM Account acc
INNER JOIN department de ON de.DepartmentID = acc.DepartmentID
INNER JOIN Position pos ON pos.PositionID = acc.PositionID
GROUP BY pos.PositionID, de.DepartmentID
ORDER BY de.DepartmentID;

#Question 12
SELECT q.QuestionID, q.Content, tq.TypeName ,acc.FullName, a.Content as Answer  FROM Question q 
INNER JOIN Answer a ON q.QuestionID = a.QuestionID
INNER JOIN TypeQuestion tq ON tq.TypeID = q.TypeID
INNER JOIN Account acc ON acc.AccountID = q.CreatorID
INNER JOIN categoryquestion cat ON cat.CategoryID = q.CategoryID
ORDER BY q.QuestionID ASC
;

#Question 13
SELECT tq.TypeID, tq.TypeName, COUNT(TQ.TypeID) FROM TypeQuestion AS tq
LEFT JOIN Question q ON TQ.TypeID = q.TypeID
GROUP BY TQ.TypeID;


#Question 14 + #Question 15
SELECT * FROM `group` 
WHERE GroupID NOT IN (SELECT GroupID FROM GroupAccount);

#Question 16
SELECT q.QuestionID, q.Content FROM question q
WHERE QuestionID NOT IN (SELECT QuestionID FROM Answer); 

#Question 17
-- a) 
SELECT acc.AccountID, acc.Email, acc.UserName, acc.FullName FROM Account acc 
INNER JOIN GroupAccount gracc ON acc.AccountID = gracc.AccountID 
WHERE GroupID = 1;

-- b)
SELECT acc.AccountID, acc.Email, acc.UserName, acc.FullName FROM Account acc 
INNER JOIN GroupAccount gracc ON acc.AccountID = gracc.AccountID 
WHERE GroupID = 2;

-- c)
SELECT acc.AccountID, acc.Email, acc.UserName, acc.FullName FROM Account acc 
INNER JOIN GroupAccount gracc ON acc.AccountID = gracc.AccountID 
WHERE GroupID = 1
UNION
SELECT acc.AccountID, acc.Email, acc.UserName, acc.FullName FROM Account acc 
INNER JOIN GroupAccount gracc ON acc.AccountID = gracc.AccountID 
WHERE GroupID = 2;

#Question 18
-- a)
SELECT gr.GroupID, gr.GroupName, COUNT(gracc.GroupID) AS AccCount FROM `Group` gr
INNER JOIN GroupAccount gracc ON gr.GroupID = gracc.GroupID
GROUP BY gr.GroupID
HAVING COUNT(gracc.GroupID) > 5;

-- b)
SELECT gr.GroupID, gr.GroupName, COUNT(gracc.GroupID) AS AccCount FROM `Group` gr
INNER JOIN GroupAccount gracc ON gr.GroupID = gracc.GroupID
GROUP BY gr.GroupID
HAVING COUNT(gracc.GroupID) < 7;

-- c)
SELECT gr.GroupID, gr.GroupName, COUNT(gracc.GroupID) AS AccCount FROM `Group` gr
INNER JOIN GroupAccount gracc ON gr.GroupID = gracc.GroupID
GROUP BY gr.GroupID
HAVING COUNT(gracc.GroupID) > 5
UNION
SELECT gr.GroupID, gr.GroupName, COUNT(gracc.GroupID) AS AccCount FROM `Group` gr
INNER JOIN GroupAccount gracc ON gr.GroupID = gracc.GroupID
GROUP BY gr.GroupID
HAVING COUNT(gracc.GroupID) < 7;
