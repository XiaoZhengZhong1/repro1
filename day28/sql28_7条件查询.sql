/*
###27数据的条件查询_1
	 * A:条件查询
			where语句表条件过滤。满足条件操作，不满足不操作，多用于数据的查询与修改。
		
	 * B : 格式 :
			select * from 表名  where 条件;	
*/

SELECT * FROM zhangwu WHERE zname='吃饭支出';	-- 查询表中所有条件中名称为'吃饭支出'的数据信息 


/*
* C: while条件的种类如下：
		比较运算符	
			>  <  <=   >=   =  <>	---------- 大于、小于、大于(小于)等于、不等于
			BETWEEN  ...AND...      -----------	显示在某一区间的值(含头含尾)
			IN(set) 	            -----------显示在in列表中的值，例：in(100,200)
			LIKE 通配符	   			-----------模糊查询，Like语句中有两个通配符：
												% 用来匹配多个字符；例first_name like ‘a%’;
												_ 用来匹配一个字符。例first_name like ‘a_’;
			IS NULL 	判断是否为空
									------------is null; 判断为空
												is not null; 判断不为空
	 * D 逻辑运算符	
			and	                    ------------ 多个条件同时成立
			or						------------ 多个条件任一成立
			not						------------ 不成立，例：where not(salary>100);
*/


-- 查询表中所有金额大于1000的
SELECT * FROM zhangwu WHERE money>1000;

-- 查询出金额在2000-5000之间的账务信息
		SELECT * FROM zhangwu WHERE money >=2000 AND money <=5000;
		-- 或 用betweeen and 意思是在谁和谁之间.
		SELECT * FROM zhangwu WHERE money BETWEEN 2000 AND 5000;


-- 查询出金额是1000或5000或3500的商品信息
		SELECT * FROM zhangwu WHERE money =1000 OR money =5000 OR money =3500;
		-- 或 优化成
		SELECT * FROM zhangwu WHERE money IN(1000,5000,3500);

-- ###28-28数据的条件查询_2
	 -- A 模糊查询  like关键字 通配符的最常用法'%xxx%'表示只要包含有xxx的就符合
		-- 查询出账务名称包含”支出”的账务信息。
		SELECT * FROM zhangwu WHERE zname LIKE '%支出%'; -- 表示查询表中所有名称中,只要有,支出,两字的数据信息
		
-- C 查询出账务名称不为null账务信息
		SELECT * FROM zhangwu WHERE zname IS NOT NULL; -- is是 not不 null空
		SELECT * FROM zhangwu WHERE NOT (zname IS NULL); -- not不 is是 null空		
		
		