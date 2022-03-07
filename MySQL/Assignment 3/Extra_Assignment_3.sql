USE fresher_management;

#Question 1:
INSERT INTO `fresher_management`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('1', 'mad1', '2001-01-02', 'male', '20', '10', '45', 'math', 'good');
INSERT INTO `fresher_management`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('2', 'mad2', '2001-01-03', 'female', '18', '15', '41', 'science', 'pass');
INSERT INTO `fresher_management`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('3', 'mad3', '2001-01-08', 'unknown', '15', '5', '21', 'physics', 'fail');
INSERT INTO `fresher_management`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('4', 'mad4', '2001-08-01', 'unknown', '20', '9', '46', 'PT', 'excellent');
INSERT INTO `fresher_management`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('5', 'mad5', '2020-01-25', 'female', '16', '8', '21', 'literature', 'fail');
INSERT INTO `fresher_management`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('7', 'mad16', '2001-05-02', 'male', '11', '17', '35', 'math', 'pass');
INSERT INTO `fresher_management`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('8', 'phucNguyn', '2001-04-02', 'unknown', '5', '16', '15', 'chemistry', 'pass');
INSERT INTO `fresher_management`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('9', 'mad235', '2001-08-20', 'female', '7', '20', '24', 'IT', 'pass');
INSERT INTO `fresher_management`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('10', 'mad7', '2001-11-12', 'male', '4', '19', '50', 'geo', 'fail');


#Question 2:
SELECT * 
FROM trainee
GROUP BY month(Birth_Date);

#Question 3:
SELECT TraineeID, 
Full_Name, 
(YEAR(current_timestamp) - YEAR(Birth_Date)) AS Age,
Gender 
FROM trainee
WHERE LENGTH(Full_Name) = (SELECT(MAX(LENGTH(Full_Name)))
FROM trainee);

#Question 4:
SELECT * 
FROM trainee 
WHERE (ET_IQ + ET_Gmath) >= 20
AND ET_IQ >= 8 
AND ET_Gmath >= 8
AND ET_English >= 18;

#Question 5
DELETE FROM trainee 
WHERE TraineeID = 3;

#Question 6
UPDATE trainee 
SET Training_Class = "2"
WHERE TraineeID = 5; 
