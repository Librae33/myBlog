
    create table `mydb`.`user`(
        `userID` INT not null auto_increment,
       `userName` VARCHAR(20),
       `password` VARCHAR(20),
       `age` INT,
       `sex` VARCHAR(10),
        primary key (`userID`)
    );

    create unique index `PRIMARY` on `mydb`.`user`(`userID`);