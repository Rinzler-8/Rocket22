create table Trainee (
	TraineeID int not null auto_increment,
    Full_Name varchar(50) not null,
    Birth_Date date,
    Gender enum("male", "female", "unknown"),
    ET_IQ tinyint unsigned not null,
    ET_Gmath tinyint unsigned not null,
    ET_English tinyint unsigned not null, 
    Training_Class varchar(50) not null,
    Evaluation_Notes varchar(50) not null,
    primary key(TraineeID)
)