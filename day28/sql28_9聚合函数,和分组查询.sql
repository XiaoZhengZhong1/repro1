/*
###30聚合函数
		* A: 聚合函数		
		* B: 函数介绍
			* 之前我们做的查询都是横向查询，它们都是根据条件一行一行的进行判断，而使用聚合函数查询是纵向查询，
				它是对一列的值进行计算，然后返回一个单一的值；另外聚合函数会忽略空值。
			* count：统计指定列不为NULL的记录行数；
			* sum：计算指定列的数值和，如果指定列不是数值类型，那么计算结果为0排0序运算
			* max：计算指定列的最大值，如果指定列是字符串类型，那么使用字符串排序运算；
			* min：计算指定列的最小值，如果指定列是字符串类型，那么使用字符串排序运算；
			* avg：计算指定列的平均值，如果指定列类型不是数值类型，那么计算结果为0；

*/


-- 查询账务统计表中一共有多少条数据.-----开发最常用
--  count：统计指定列不为NULL的记录行数；count()计数,关键字,* 代表所有的列
SELECT COUNT(*) FROM zhangwu;	-- 表示查询所有的列有多少条数据.输出7,因为有三列.每列都有七条数据.


-- sum(列名)求和,对一列中的数据进行求和计算.
-- 要求,对账务表查询,对所有金额进行就和计算.
SELECT SUM(money) FROM zhangwu;


-- max 函数,对某列数据,获取最大值 max(),min()------用得较少,
SELECT MAX(money) FROM zhangwu;


-- avg 函数,计算一个列所有数据的平均数avg(列名)
SELECT AVG(money)FROM zhangwu;

-- 开发中用count() sum() avg() 用得比较多.





/*
###31分组查询
用格式
 分组查询是指使用group by字句对查询信息进行分组,例如：我们要统计出zhanguw表中所有分类账务的总数量,这时就需要使用group by
 来对zhangwu表中的账务信息根据parent进行分组操作。
* SELECT 字段1,字段2… FROM 表名 GROUP BY 字段 HAVING 条件;
			* 分组操作中的having子语句，是用于在分组后对数据进行过滤的，作用类似于where条件。
*/


-- 分组查询 group by 被分组的列名(必须跟随聚合函数的后面,因为只要聚合中进行求和之类的运算才需要分组)
-- select查询的时候,被分组的列,必须出现在select选择列的后面.这样才能显示出聚合分组的对象.

-- 要求1,对账务中所有内容按名称进行分组求和.
SELECT zname,SUM(money) FROM zhangwu GROUP BY zname;
-- 意思是选择查询名称(起显示作用,显示名称对应的金额),对金额列求和从账务中按名称分组求和,(注意group by分组和聚合是相对的)

-- 要求2,对名称中的金额进行分组求和,并且只要支出金额
SELECT zname,SUM(money) FROM zhangwu WHERE zname LIKE '%支出%' GROUP BY zname;


-- 要求3,对名称中的金额进行分组求和,并且只要支出金额还要按降序进行排序
SELECT zname,SUM(money)AS'getsum' FROM zhangwu WHERE zname LIKE '%支出%' GROUP  BY zname ORDER BY getsum DESC;
-- 注意用as别名关键字是因为避免前面求和的money和后面排序的money重名不方便操作.还有需要注意的是,排序应该在条件where的后面.
-- 并且排序要放在最后面,where和group by的后面,order by放前面就会报错

-- 要求4 金额分组,求和,支出显示后,只显示金额5000以上的
-- 结果集是分组查询后再次进行刷选的,不能用where.得用having关键字

SELECT zname,SUM(money)AS'getsum' FROM zhangwu WHERE zname LIKE '%支出%' GROUP  BY zname HAVING getsum>=5000;


/*
* b: having与where的区别
			* having是在分组后对数据进行过滤.
			* where是在分组前对数据进行过滤
			* having前面可以使用分组函数(统计函数)
			* where前面不可以使用分组函数。

*/
