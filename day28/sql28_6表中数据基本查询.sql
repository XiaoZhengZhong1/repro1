###25数据表和测试数据准备
	/* A: 查询语句，在开发中使用的次数最多，此处使用“zhangwu” 账务表。
		创建账务表：*/
		CREATE TABLE zhangwu (
		  id INT PRIMARY KEY AUTO_INCREMENT, -- 账务ID
		  zzname VARCHAR(200), -- 账务名称
		  money DOUBLE -- 金额
		);
	-- B: 插入表记录：
		INSERT  INTO zhangwu(id,zname,money) VALUES (1,'吃饭支出',247);
		INSERT  INTO zhangwu(id,zname,money) VALUES (2,'工资收入',12345);
		INSERT  INTO zhangwu(id,zname,money) VALUES (3,'服装支出',1000);
		INSERT  INTO zhangwu(id,zname,money) VALUES (4,'吃饭支出',325);
		INSERT  INTO zhangwu(id,zname,money) VALUES (5,'股票收入',8000);
		INSERT  INTO zhangwu(id,zname,money) VALUES (6,'打麻将支出',8000);
		INSERT  INTO zhangwu(id,zname,money) VALUES (7,NULL,5000);


/*

###26数据的基本查询
		* A: 查询指定字段信息
			select 字段1,字段2,...from 表名;
			例如：
			select id,zname from zhangwu;
*/
-- 查询指定列数据
SELECT id FROM zhangwu; -- 查询id数据
SELECT zname FROM zhangwu; -- 查询名称数据
SELECT zname,money FROM zhangwu; -- 查询名称和开销数据


/*
* B: 查询表中所有字段
			select * from 表名; 
*/

SELECT * FROM zhangwu; 



/*
* C: distinct用于去除重复记录----只在查询中显示去除,表中依然存在
			select distinct 字段 from 表名;			
			例如：
			select distinct money from zhangwu;
*/

SELECT DISTINCT money FROM zhangwu;	-- 表示选择去除消费字段中的重复
SELECT DISTINCT zname FROM zhangwu;	-- 表示选择去除名称字段中的重复

/*
* D: 别名查询，使用的as关键字，as可以省略的.
			别名可以给表中的字段，表设置别名。 当查询语句复杂时，使用别名可以极大的简便操作。
			表别名格式: 
			select * from 表名 as 别名;
			或
			select * from 表名 别名;
			列别名格式：
			select 字段名 as 别名 from 表名;
			或
			select 字段名 别名 from 表名;
			例如
			表别名：
				select * from zhangwu as zw;
			列别名：
				select money as m from zhangwu;
				或
				select money m from zhangwu;
	
			我们在sql语句的操作中，可以直接对列进行运算。
			例如：将所有账务的金额+10000元进行显示.
			select pname,price+10000 from product;

*/
