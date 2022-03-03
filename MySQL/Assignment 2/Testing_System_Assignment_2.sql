#Account
INSERT INTO `test_assignment_1`.`account` (`AccountID`, `Email`, `Username`, `Fullname`, `DepartmentID`, `PositionID`, `CreateDate`) VALUES 
('190', 'mad', 'phuc','magaming',15 ,14 ,'2001-2-20'),
('191', 'mad1', 'phuc1','magaming1',151 ,141 ,'2001-2-21'),
('192', 'mad2', 'phuc2','magaming2',152, 151,'2001-2-24'),
('193', 'mad3', 'phuc3','magaming3',166, 280,'2001-2-26'),
('194', 'mad4' , 'phuc4','magaming4',170, 214,'2001-2-25');

#Answer 
INSERT INTO answer (AnswerID, Content, QuestionID, isCorrect) VALUES 
(1, 'Câu 1', 11, true),
(2, "Câu 2", 12, false),
(3, "Câu 3", 13, true),
(4, "Câu 4", 14, false),
(5, "Câu 5", 15, true);
                                                                  
#CategoryQuestion                                                                     
INSERT INTO categoryquestion (CategoryID,CategoryName) VALUES    
(1, 'Embedded'), 
(2, 'Multimedia'),
(3, 'Database'),
(4, 'Software Engineer'),
(5, 'Meaningless');
#Department                                                                     
INSERT INTO department (DepartmentID,DepartmentName) VALUES     
 (1, 'Technology'),
 (2, 'Media'),
 (3, 'Healthcare'),
 (4, 'Military'),
 (5, 'Congress');
 #Exam                                                                            
INSERT INTO exam (ExamID,Code,Title,CategoryID,Duration,CreateDate) VALUES (1, '190A', "Math", 11, 60, '2022-8-25'),
                                       (2, '190B2', "Literature", 12, 60,  '2022-4-26'),
                                       (3, '190C7', "Science", 13, 60, '2022-4-27'),
                                       (4, '190D7', "Physics", 14, 60,  '2022-4-28'),
                                       (5, '190I10', "Chemistry", 15, 60,  '2022-8-29');              


#Group 
INSERT INTO `test_assignment_1`.`group` (`GroupID`, `GroupName`, `CreatorID`, `CreateDate`) VALUES ('1', 'SAS', '11', '2002-7-28');
INSERT INTO `test_assignment_1`.`group` (`GroupID`, `GroupName`, `CreatorID`, `CreateDate`) VALUES ('2', 'GIGN', '12', '2002-7-26');
INSERT INTO `test_assignment_1`.`group` (`GroupID`, `GroupName`, `CreatorID`, `CreateDate`) VALUES ('3', 'Navy SEAL', '13', '2002-7-21');
INSERT INTO `test_assignment_1`.`group` (`GroupID`, `GroupName`, `CreatorID`, `CreateDate`) VALUES ('4', 'Spetsnaz', '14', '2002-7-25');
INSERT INTO `test_assignment_1`.`group` (`GroupID`, `GroupName`, `CreatorID`, `CreateDate`) VALUES ('5', 'GIS', '15', '2002-7-23');

#GroupAccount  
INSERT INTO `test_assignment_1`.`groupaccount` (`GroupID`, `AccountID`, `JoinDate`) VALUES ('15', '11', '2008-8-1');
INSERT INTO `test_assignment_1`.`groupaccount` (`GroupID`, `AccountID`, `JoinDate`) VALUES ('245', '12', '2008-8-7');
INSERT INTO `test_assignment_1`.`groupaccount` (`GroupID`, `AccountID`, `JoinDate`) VALUES ('3312', '13', '2008-8-9');
INSERT INTO `test_assignment_1`.`groupaccount` (`GroupID`, `AccountID`, `JoinDate`) VALUES ('41', '14', '2008-8-8');
INSERT INTO `test_assignment_1`.`groupaccount` (`GroupID`, `AccountID`, `JoinDate`) VALUES ('55', '15', '2008-8-19');

#Position
INSERT INTO `test_assignment_1`.`position` (`PositionID`, `PositionName`) VALUES ('21', 'Dev');
INSERT INTO `test_assignment_1`.`position` (`PositionID`, `PositionName`) VALUES ('251', 'Test');
INSERT INTO `test_assignment_1`.`position` (`PositionID`, `PositionName`) VALUES ('355', 'Scrum Master');
INSERT INTO `test_assignment_1`.`position` (`PositionID`, `PositionName`) VALUES ('44', 'PM');
INSERT INTO `test_assignment_1`.`position` (`PositionID`, `PositionName`) VALUES ('55', 'Dev');

#Question
INSERT INTO `test_assignment_1`.`question` (`QuestionID`, `Content`, `CategoryID`, `TypeID`, `CreatorID`, `CreateDate`) VALUES ('1', 'What’s your favorite way to spend a day off?', '11', '57', '83', '2001-5-7');
INSERT INTO `test_assignment_1`.`question` (`QuestionID`, `Content`, `CategoryID`, `TypeID`, `CreatorID`, `CreateDate`) VALUES ('2', ' What type of music?', '12', '894', '5', '2001-5-8');
INSERT INTO `test_assignment_1`.`question` (`QuestionID`, `Content`, `CategoryID`, `TypeID`, `CreatorID`, `CreateDate`) VALUES ('3', 'What was the best?', '123', '321', '5', '2001-5-17');
INSERT INTO `test_assignment_1`.`question` (`QuestionID`, `Content`, `CategoryID`, `TypeID`, `CreatorID`, `CreateDate`) VALUES ('15', 'Where’s the next', '11', '57', '1', '2001-5-9');
INSERT INTO `test_assignment_1`.`question` (`QuestionID`, `Content`, `CategoryID`, `TypeID`, `CreatorID`, `CreateDate`) VALUES ('16', 'What are your hobbies', '12', '894', '5', '2001-5-15');


#Trainee
INSERT INTO `test_assignment_1`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('6545', 'Phuc Nguyen', '2001-8-1', 'male ', '150', '9', '1', 'math', 'good');
INSERT INTO `test_assignment_1`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('3212', 'Trang Nguyen', '2001-12-31', 'female ', '150', '9', '2', 'scienc ', 'good');
INSERT INTO `test_assignment_1`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('33212', 'Ha Do', '2001-8-8', 'female', '150', '8', '4', 'sadfasdfasdf', 'good ');
INSERT INTO `test_assignment_1`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('425', 'Yen Nguyen ', '2001-2-21', 'female', '155', '9', '5', 'dfnasdfsdf', 'good ');
INSERT INTO `test_assignment_1`.`trainee` (`TraineeID`, `Full_Name`, `Birth_Date`, `Gender`, `ET_IQ`, `ET_Gmath`, `ET_English`, `Training_Class`, `Evaluation_Notes`) VALUES ('583', 'Quan Du', '2001-11-12', 'unknown', '180', '9', '6', 'niga', 'bad');
INSERT INTO `test_assignment_1`.`trainee` (`Full_Name`) VALUES ('');

#TypeQuestion                                                                         
INSERT INTO `test_assignment_1`.`typequestion` (`TypeID`, `TypeName`) VALUES ('145', 'Closed ');
INSERT INTO `test_assignment_1`.`typequestion` (`TypeID`, `TypeName`) VALUES ('2312', 'Open ');
INSERT INTO `test_assignment_1`.`typequestion` (`TypeID`, `TypeName`) VALUES ('321', 'Leading ');
INSERT INTO `test_assignment_1`.`typequestion` (`TypeID`, `TypeName`) VALUES ('45', 'Probing ');
INSERT INTO `test_assignment_1`.`typequestion` (`TypeID`, `TypeName`) VALUES ('54', 'Probing ');
                                                                           
                                                                           