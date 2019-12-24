/*###29排序查询 order by 按顺序
	* SELECT * FROM 表名 ORDER BY 字段ASC;
				* ASC 升序 (默认)可以不写
				* DESC 降序
*/	
-- 查询账务表,价格进行升序
SELECT * FROM zhangwu ORDER BY money; -- 升序 (默认)可以不写		
-- 查询账务表,价格进行降序
SELECT * FROM zhangwu ORDER BY money DESC; -- 降序			
			
-- 查询账务表,查询所有的支出,对金额降序排列
			-- 先过滤条件 where 查询的结果再排序			
SELECT * FROM zhangwu WHERE zname LIKE '%支出%' ORDER BY money DESC;