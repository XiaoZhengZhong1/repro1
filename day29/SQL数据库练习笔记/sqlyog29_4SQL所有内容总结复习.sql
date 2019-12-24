-- 复习SQL所有类容
CREATE DATABASE d926;-- 1 建库
USE d926;-- 2 使用库.
CREATE TABLE text2(-- 3创建表
tid INT PRIMARY KEY AUTO_INCREMENT,
tname VARCHAR(10),
weight DOUBLE
);
SHOW TABLES;-- 4查询库中所有的表
DESC text2;-- 5:查询指定表详细结构信息


INSERT INTO text2(tid,tname,weight)VALUES(1,'海',135);-- 增 insert into 表名(列名)values(值)
INSERT INTO text2(tname,weight)VALUE('磊',32);	      -- 增  省略主键tid
INSERT INTO text2 VALUES(3,'霞',110),(4,'肖肖',120),(5,'爸',120),(6,'妈',110);-- 增 省略列,批量添加


DELETE FROM text2 WHERE tid=1;-- 删  从表中删除指定条件的记录信息
TRUNCATE TABLE text2;-- 删  删除表中所有记录.
DROP TABLE text2;-- 删 删除表


ALTER TABLE text2 ADD age INT;-- 改 alter 条件列和类型
ALTER TABLE text2 MODIFY age DOUBLE;-- 改   改指定列的类型
ALTER TABLE text2 CHANGE age height INT;-- 改  改指定列的类名和类型.
RENAME TABLE text2 TO test2;-- 改  改表名


SELECT * FROM test2;-- 查 select  查询表中所有记录
SELECT tid FROM test2;-- 查  查询指定列的记录
SELECT DISTINCT weight FROM test2;-- 查 查询指定列去除重复后的记录,从表中查询.
SELECT * FROM test2 WHERE tid=4;-- 查 条件查询 
SELECT * FROM test2 WHERE weight>100 AND weight<150;
SELECT * FROM test2 WHERE weight>110 OR weight<130;
SELECT * FROM test2 WHERE weight IN(120);
SELECT * FROM test2 WHERE NOT(weight=120);
SELECT * FROM test2 WHERE weight BETWEEN 110 AND 130;
SELECT * FROM test2 WHERE tname LIKE '%肖%';-- 查 条件查询 like 大概查询 %替换符,代表多个字符
SELECT * FROM test2 WHERE tname LIKE '__';-- 查                          _下划线代表一个字符
SELECT * FROM test2 WHERE tname IS NULL;
SELECT * FROM test2 WHERE NOT(tname IS NULL);
SELECT * FROM test2 ORDER BY weight;-- 查 按指定列排序order by,默认升序ASC
SELECT * FROM test2 ORDER BY weight DESC;-- 查          指定降序desc;
SELECT COUNT(tname) FROM test2;-- 查  聚合函数查询 count()计数查询 查询指定列的记录行数
SELECT SUM(weight) FROM test2;--  查               sum()求和查询   查询指定列的记录数值的和
SELECT AVG(weight) FROM test2;-- 查                avg()求平均数   查询指定列的记录数值的平均数
SELECT tname,SUM(weight) FROM test2 GROUP BY tname;-- 查 分组查询group by 但是分组必须在跟随聚合函数后面
SELECT tname,SUM(weight)AS 'getsum' FROM test2  GROUP BY tname ORDER BY getsum;-- 查询显示名称体重求和别名,名称分组求和排序



UPDATE test2 SET weight=138 WHERE tid=1;-- 更新   更新表 设置列的值,条件是主键tid,指更新具体哪一行的改列值.