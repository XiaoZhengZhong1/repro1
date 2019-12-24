/*
###22更新数据
	* A: 用来修改指定条件的数据，将满足条件的记录指定列修改为指定值
		语法：
		update 表名 set 字段名=值,字段名=值;----没加添加回把所有同一字段的都改了
		update 表名 set 字段名=值,字段名=值 where 条件;------加了添加一般是指定唯一主键,比喻id=1,表示修改第一列
	* B: 注意：
			列名的类型与修改的值要一致.
			修改值得时候不能超过最大长度.
			值如果是字符串或者日期需要加’’.
*/


-- update更新的意思,演示更新第七行,的价格.
UPDATE product SET price=4888.99 WHERE id=7;

-- 更新第一行的名称和价格,字段直接用户逗号隔开
UPDATE product SET pname='笔记本电脑',price=6666.99 WHERE id=1;

/*
where 条件----其它写法(了解)
where id=3 or id=4;-------表示条件为id是3或者4
where id in (1,2,3,4);-----表示条件我包括1 2 3 4的id号
where id not in (1,2,3,4);------表示条件为不包括1 2 3 4 的id号
*/



/*
###23删除数据
	* A: 语法：
		delete from 表名 [where 条件];
		或者
		truncate table 表名;

	 * B: 面试题：
		删除表中所有记录使用delete from 表名; 还是用truncate table 表名;
		删除方式：delete 一条一条删除，不清空auto_increment记录数。
		truncate 直接将表删除，重新建表，auto_increment将置为零，从新开始。

	 * C: 例如：
		DELETE FROM sort WHERE sname='日用品';
		#表数据清空
		DELETE FROM sort;

*/
-- 演示删除商品表中的沙发.
DELETE FROM product WHERE id=10;/*如果后面不加条件.就会删除整个表*/


/*在cmd中查看表回出现中文字符乱码,是因为sqlyog配置的编码表是ut-8而cmd中是windows的gbk编码表.解决方法在cmd命令行
敲set names'gbk' 回车*/

