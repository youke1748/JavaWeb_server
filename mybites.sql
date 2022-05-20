CREATE TABLE s_school (
id int(32) PRIMARY KEY AUTO_INCREMENT,
schoolname varchar(40)
);
INSERT INTO s_school VALUES (1, '计算机学院');
INSERT INTO s_school VALUES (2, '外国语学院');
CREATE TABLE s_course (
id int(32) PRIMARY KEY AUTO_INCREMENT,
name varchar(40),
hours int,
sid int(32) NOT NULL,
FOREIGN KEY(sid) REFERENCES s_school(id)
);
INSERT INTO s_student VALUES (1, 'C语⾔程序设计', 70,1);
INSERT INTO s_student VALUES (2, 'Python程序设计', 70,1);
INSERT INTO s_student VALUES (3, '大学英语', 96,2);
INSERT INTO s_student VALUES (4, '高级Web技术', 32,1);