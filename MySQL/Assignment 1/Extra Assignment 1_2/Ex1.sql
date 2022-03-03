create table Trainee (
    TraineeID int not null auto_increment,
    Full_Name varchar(50) not null,
    Birth_Date date,
    Gender enum("male", "female", "unknown"),
    ET_IQ   int check(ET_IQ between 0 and  20) not null,
    ET_Gmath int check(ET_Gmath between 0 and  20) not null, 
    ET_English  int check(ET_English between 0 and  50) not null, 
    Training_Class varchar(50) not null,
    Evaluation_Notes varchar(50) not null,
    primary key(TraineeID)
)
