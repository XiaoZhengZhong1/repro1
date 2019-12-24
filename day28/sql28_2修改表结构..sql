CREATE TABLE u(
	uid INT PRIMARY KEY AUTO_INCREMENT,
	uname VARCHAR(20),
	uaddress VARCHAR(200)
);
/*
下面演示在表中,添加列 字段.格式:alter table 表名 add 列名 数据类型 约束,
###19修改表结构
	 * A: 修改表添加列
		alter table 表名 add 列名 类型(长度) 约束;	
*/

ALTER TABLE u ADD tel INT;	/*添加列*/



/*
修改列,在原有的列上修改,可修改列中 数据类型 和约束, 格式为alter table 表名 modify 列名 数据类型 约束
 B: 修改表修改列的类型长度及约束
		alter table 表名 modify 列名 类型(长度) 约束; 
	*/

ALTER TABLE u MODIFY tel VARCHAR(50);	/*修改表中列的类型把int 改为 varchar*/


/*
* C: 修改表修改列名
		alter table 表名 change 旧列名 新列名 类型(长度) 约束; 
*/

ALTER TABLE u CHANGE tel newtel DOUBLE;	/*修改列名*/

/*
D: 修改表删除列
		alter table 表名 drop 列名;	
*/

ALTER TABLE u DROP newtel;	/*删除列*/

/*
 E: 修改表名
		rename table 表名 to 新表名; 
*/
RENAME TABLE u TO newu;
RENAME TABLE newu TO u;	/*修改列名*/
