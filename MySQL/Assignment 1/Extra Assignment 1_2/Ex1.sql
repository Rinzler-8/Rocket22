CREATE DATABASE fresher_management;
USE fresher_management;

CREATE TABLE Trainee (
    TraineeID INT NOT NULL AUTO_INCREMENT,
    Full_Name VARCHAR(50) NOT NULL,
    Birth_Date date,
    Gender enum("male", "female", "unknown"),
    ET_IQ   INT check(ET_IQ BETWEEN 0 AND  20) NOT NULL,
    ET_Gmath INT check(ET_Gmath BETWEEN 0 AND  20) NOT NULL, 
    ET_English  INT check(ET_English BETWEEN 0 AND  50) NOT NULL, 
    Training_Class VARCHAR(50) NOT NULL,
    Evaluation_Notes VARCHAR(50) NOT NULL,
    PRIMARY KEY(TraineeID)
)
