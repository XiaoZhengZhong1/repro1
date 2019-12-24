-- 数据库 增 删 改 查 更新,复习练习
CREATE TABLE day21(	-- 创建表
did INT PRIMARY KEY AUTO_INCREMENT,
dname VARCHAR(10),
dprice DOUBLE
);
SELECT * FROM  day21;	-- 查询显示表中所以内容.

ALTER TABLE day21 ADD dsce VARCHAR(100); -- 增 alter add 和 insert into
INSERT INTO day21 VALUES (1,'土豆',1.1,'十块八斤'),(2,'萝卜',1.3,'5块3斤'),(3,'土豆',1.1,'十块八斤'),(4,'萝卜',1.3,'5块3斤');

DELETE FROM day21 WHERE did=1;	-- 删 delete

ALTER TABLE day21 MODIFY dprice DOUBLE;  -- 改 改指定列的类型  alter
ALTER TABLE day21 CHANGE dsce ddsce VARCHAR(100);	-- 改 旧列 新列 类型 
RENAME TABLE day21 TO day0921;	-- 改  表名

SELECT * FROM day0921; -- 查 表显示所有内容 select
SELECT  ddsce FROM day0921;	-- 查 指定列从表中
SELECT DISTINCT ddsce FROM day0921;	-- 查 重复记录,指定列,从表中.
SELECT * FROM day0921 WHERE ddsce='十块八斤';	-- 查 条件查询  查询表中所有内容,条件是降价列值等于十块八斤的,记录
SELECT * FROM day0921 WHERE dprice>0 AND dprice<2;	-- 查 条件查询  条件是 价格大于0 并且 价格小于2,记录
SELECT * FROM day0921 WHERE dprice>0 OR dprice<2;	-- 查 条件查询  条件是 价格大于0 或者 价格小于2,记录
SELECT * FROM day0921 WHERE dprice IN(1.3);		-- 查 条件查询  条件是 价格在1.3的,记录
SELECT * FROM day0921 WHERE  NOT(dprice=1.3);		-- 查 条件查询  条件是 价格不是1.3的,记录
SELECT * FROM day0921 WHERE dprice BETWEEN 1 AND 2;	-- 查 条件查询  条件是 价格在 1 和 2 之间的记录

SELECT * FROM day0921 WHERE ddsce LIKE '%块%';	-- 查 条件查询,模糊查询 查询表中条件是,降价列中大概带有 块 字符的记录
SELECT * FROM day0921 WHERE ddsce LIKE '___';	-- 查 条件查询,模糊查询 查询表中条件是,降价列中大概是 三个字符的记录
SELECT * FROM day0921 WHERE ddsce IS NULL;	-- 查 条件查询 条件是降价列值是空的
SELECT * FROM day0921 WHERE NOT(ddsce IS NULL);	-- 查 条件查询 条件是降价列值不是空的.

SELECT * FROM day0921 ORDER BY dprice;		-- 查 排序查询 价格排序(默认升序,从低到高)
SELECT * FROM day0921 ORDER BY dprice DESC;	-- 查 排序查询 价格列排降序.

SELECT COUNT(dname) FROM day0921;		-- 查 聚合函数查询 查询名称列的记录条数.
SELECT SUM(dprice) FROM day0921;		-- 查 聚合函数查询 查询价格列的和
SELECT AVG(dprice) FROM day0921;		-- 查 聚合函数查询 查询价格列的平均数.

SELECT dname,SUM(dprice)AS 'getsum' FROM day0921 WHERE dname LIKE '%卜%' GROUP BY dname ORDER BY getsum DESC;
					    -- 查  分组查询 必须跟随聚合函数后面.如果有where,必须在分组前面,有排序要在最后
					    
SELECT * FROM day0921 WHERE did=3 HAVING AVG(dprice);
					    -- 查 再次刷选 where 条件后,再次刷选.
				
UPDATE day0921 SET dprice=2 WHERE did= 1;	-- 更 update 更新表设置指定价格列的值,条件是id等于1的记录