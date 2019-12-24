-- 第28章内容.数据库,数据表,增删改查.巩固练习.
-- 一创建库,使用库,创建表,查询表,库,
CREATE DATABASE day919;		-- create database 1建库,不能用系统的库.
USE day919;	-- use 2使用库,
CREATE TABLE tset(	-- create table 3创建表.
id INT PRIMARY KEY AUTO_INCREMENT,	-- int primary key auto_increment 4添加主键约束,自动递增.
tname VARCHAR(10),	-- varchar() 5添加姓名为可变字符串类型.长度为10个字符.
age INT);
DESC tset;	-- desc 6查询表结构.
SHOW TABLES;	-- show tables 7显示库中所有的表.
DROP TABLE tset; -- drop table 8删除表.

-- 二,改 修改表 alter table add添加列,类型. modify修改表中指定列的类型.change修改指定表中指定列和类型.drop删除表中指定列
ALTER TABLE tset ADD weight DOUBLE;	-- alter table 修改表,add 添加列,类型. 

ALTER TABLE tset MODIFY weight INT;	-- alter table 修改表,modify 修改列的类型.

ALTER TABLE tset CHANGE weight hetght DOUBLE; -- alter table 修改表.change修改列和类型.

RENAME TABLE tset TO test;	-- rename table 修改表名.旧名 to 新名

ALTER TABLE tset DROP hetght;	-- alter table 修改表,drop删除列.

-- 三 增 insert into 表名 values(值1,值2,值3);

INSERT INTO test(id,tname,age) VALUES (3,'李霞',24);	-- 添加前面声明列后面声明值

INSERT INTO test(tname,age) VALUES ('肖洒',27);		-- 省略了主键.因为它有自动递增的功能.

INSERT INTO test VALUES(3,'肖海',31);	-- 省去了列名,给出所有的值,

INSERT INTO test VALUES (5,'肖玲',30),(6,'zgh',58),(7,'xmg',57),(8,'肖玲',30),(9,'zgh',58),(10,'xmg',57),
(11,'肖玲',30),(12,'zgh',58),(13,'xmg',57);/*批量添加,每添加一个就给出所有列的值,每个值和括号之间的每列值,都要用括号隔开*/

-- 更新 update 表名 set 列1=值1,列2=值2,列3=值3;  指更新设置指定记录的各列值.

UPDATE test SET id=14 WHERE id=3;	-- 更新表,把id设置成14,条件是更新设置id等于3的
UPDATE test SET id=3 WHERE id=14;	-- 表示重新改回去


-- 四 删,delete 一条一条记录删除.truncate直接将整个表所有记录删除.
DELETE FROM test WHERE id=13;	-- delete删除,从表中删除,条件是id等于13

TRUNCATE TABLE test;	-- truncate table 直接删除表中所有记录.

-- 五 查 select 查询.
SELECT *FROM test;	-- select查询,from在表中,没有指定就是查询所有记录.
SELECT tname FROM test;	-- select查询指定名称列,from从表中.
SELECT DISTINCT tname FROM test;	-- select distinct tname查询重复指定字段.from从表中

-- 条件查询where 条件.在...条件下
SELECT * FROM test WHERE tname='xmg'; 	-- 条件查询
SELECT * FROM test WHERE age = 58;	-- 查询表中条件是年龄等于58的
SELECT * FROM test WHERE age > 0 AND age < 80;	-- and 查询表中条件是年龄大于0 and 并且年龄小于80的
SELECT * FROM test WHERE age > 0 OR age < 80;	--  or 查询表中条件是年龄大于0 or 或者年龄小于80的
SELECT * FROM test WHERE age BETWEEN 0 AND 80;	-- between and(在xxx和xxx之间) 查询表中条件是年龄between在0and到80之间
SELECT * FROM test WHERE age IN (57,58);	-- in 查询表中条件是年龄 in 在57和58的
SELECT * FROM test WHERE  NOT (age=58);		-- not 查询表中条件是 not 不是 年龄等于58的
-- like模糊,放条件查询中叫模糊查询,大概查询
SELECT * FROM test WHERE tname LIKE '%肖%';	-- %通配符,代表多个字符,查询表中条件是名称中大概包含 肖 的
SELECT * FROM test WHERE tname LIKE '___';	-- -一杠代表一个字符,表示查询表中条件是名称中包含3个字符的
SELECT * FROM test WHERE tname IS NULL ;	-- is 是 表示查询表中名称名称是空的
SELECT * FROM test WHERE NOT (tname IS NULL);	-- 查询名称不是空的

-- 排序查询 order by 按顺序(默认升序就是从小到大) asc 升序 desc降序(注意排序应该在代码的最后面)
SELECT * FROM test ORDER BY age;	-- 查询表,按年龄排序.
SELECT * FROM test ORDER BY age DESC ;	-- 查询表,按年龄排降序.

-- 聚合函数查询计算
-- count(*) 计数,*代表所有是列,也可以在括号中填具体的列如name,指列在的实体数据数量
-- sum(列) 求和 求列中值是数字的和,不能求字符和
-- avg(列名)求平均数,求列中所有实体数据的平均数.如果值为null自动忽视
-- max(列名) 求列中最大值.
-- min(列名) 求列中最小值.
SELECT COUNT(*) FROM test;	-- count 计数 查询表中所有实体数据条数.
SELECT COUNT(tname) FROM test;	-- count 查询名称列的实体数据条数
SELECT SUM(age) FROM test;	-- sum 求和,查询表中年龄列的实体数据年龄和.
SELECT AVG(age) FROM test;	-- avg 求平均数.查询表中年龄列的平均年龄.


-- 分组查询 
-- group by 分组(注意分组必须跟随在上面聚合函数的后面,表示是计算后重新分组)
SELECT tname,SUM(age) FROM test GROUP BY tname;/*注意如果select后面不加tname查询显示.将只会出现一列年龄求和的数据,虽然
已经按名称分组了,但是并没有查询显示.所以前面加tname是显示作用*/

-- 要求对年龄进行求和分组,并且只要名称中带肖的,把求和的年龄按降序排序?
SELECT tname,SUM(age) AS 'getsum' FROM test WHERE tname LIKE '%肖%' GROUP BY tname ORDER BY getsum DESC;  
-- 注意tname后面一定要用,逗号隔开as是别名关键字,用于显示区分避免sum重复.还要注意where必须在分组和排序的前面.而排序必须最后

-- having 持有 关键字.用于结果集再次进行刷选.
SELECT*FROM test WHERE tname LIKE '%肖%' HAVING AVG(age);  
-- 表示先进行条件模糊查找后.再次进行求平均值刷选和排序.