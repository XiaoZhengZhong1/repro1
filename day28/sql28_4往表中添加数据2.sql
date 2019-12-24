/*
###20数据表添加数据_1
	 * A: 语法：
		insert into 表 (列名1,列名2,列名3..) values  (值1,值2,值3..); -- 向表中插入某些列
*/

INSERT INTO u (uid,uname,uaddress) VALUES (1,'xzz','施畈村8组');


/*
###21数据表添加数据_2
	 * A: 添加数据格式,不考虑主键------(因为创建表的时候已经给主键约束了唯一性,不能为空,自动增加)
		insert into 表名 (列名) values (值)
*/

INSERT INTO u (uname,uaddress) VALUES ('肖海','施畈村8组');


/*
 * B: 添加数据格式,所有值全给出
		格式
		insert into 表名 values (值1,值2,值3..); --向表中插入所有列
*/

INSERT INTO u VALUES (3,'肖磊','施畈村8组');


/*
* C: 添加数据格式,批量写入
		格式:
		insert into 表名 (列名1,列名2,列名3) values (值1,值2,值3),(值1,值2,值3)
*/

INSERT INTO u (uid,uname,uaddress) VALUES (4,'李霞','施畈村'),(5,'xzs','施畈村'),(6,'zgh','施畈村'),(7,'xmg','施畈村');
