/*
day28作业

一.创建一个数据库,day28

二.创建一个Test表,并使用

三.测试修改表的结构


四.按一下要求,完成以下操作   
1.创建一个学生表 id 主键  name age score  classroom(班级) 
2.给学生表中添加10条数据,逐渐自动增长
3.删除一条数据
4.修改一条数据
5.按照程序将序查询
6.统计所有的总成绩和平均成绩
7.统计不同班级的总成绩和平均成绩

*/


-- 一.创建一个数据库,day28

CREATE DATABASE day28;
USE day28; -- 使用库.


-- 二.创建一个Test表,并使用
CREATE TABLE test(
id INT PRIMARY KEY AUTO_INCREMENT, -- 表示id为主键约束,自动递增.
iname VARCHAR(5),
age DOUBLE
);


-- 三.测试修改表的结构
-- 修改表添加(add关键字)列,字段.weight体重
ALTER TABLE test ADD  weight DOUBLE;

-- 修改表,调整(modify关键字)列的类型.
ALTER TABLE test MODIFY age INT;

-- 修改表,变换(change关键字)列名.
ALTER TABLE test CHANGE weight height DOUBLE;

-- 修改表,删除(drop关键字)列
ALTER TABLE test DROP height;



-- 1.创建一个学生表 id 主键  name age score  classroom(班级) 
CREATE TABLE student(
sid INT PRIMARY KEY AUTO_INCREMENT, 
sname VARCHAR(10),
age INT,
score DOUBLE,
classroom INT
);
-- 2.给学生表中添加10条数据,逐渐自动增长
INSERT INTO student(sid,sname,age,score,classroom) VALUES (1,'肖海',31,300,8),(2,'李霞',24,200,7),(3,'肖磊',2,0,0);
INSERT INTO student(sid,sname,age,score,classroom) VALUES (4,'肖洒',27,500,15),(5,'肖玲',30,530,15),(6,'zgh',58,100,6);
INSERT INTO student(sid,sname,age,score,classroom) VALUES (7,'xmg',57,180,7),(8,'xdq',83,80,5),(9,'lcd',76,50,3);
INSERT INTO student(sid,sname,age,score,classroom) VALUES (10,'xms',48,70,6);
-- 3.删除一条数据
DELETE FROM student WHERE sid=10;
-- 4.修改一条数据
UPDATE student SET sname='李春娣',age=77,score=55,classroom=4 WHERE sid=9;
-- 5.按照程序将序查询
SELECT * FROM student ORDER BY sid DESC;
-- 6.统计所有的总成绩和平均成绩
SELECT  SUM(score) AS 'getsum' FROM student; -- 总成绩
SELECT  AVG(score) FROM student; -- 平均成绩 

-- 7.统计不同班级的总成绩和平均成绩
SELECT classroom,SUM(score)AS 'getsum' FROM student GROUP BY classroom; -- 统计不同班级的总成绩
SELECT classroom ,AVG(score) FROM student GROUP BY classroom; -- 统计不同班级平均成绩
