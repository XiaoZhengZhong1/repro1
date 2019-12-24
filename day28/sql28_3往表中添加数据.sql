/*
###20数据表添加数据_1
	 * A: 语法：
		insert into 表 (列名1,列名2,列名3..) values  (值1,值2,值3..); -- 向表中插入某些列
		注意:
		列表,表名问题
		对应问题,列数个数和条件值的个数,列数的数据类型和值的数据类型都要一致.

注意在往表中添加数据时,除了数字之外,(数字要在类型的取值范围)所有内容都要加单引号''


*/
-- 先创建一个新的商品表product(提示两杠也可以注释)
CREATE TABLE product(
-- 商品id设为主键列,就是编号,让自动增长.
	id INT PRIMARY KEY AUTO_INCREMENT,
-- 商品名字,为字符串型,约束为非空
	pname VARCHAR(100) NOT NULL,
-- 商品的价格为duoble型
	price DOUBLE

);

INSERT INTO product (id,pname,price) VALUES (1,'笔记本',5555,99);
INSERT INTO product (id,pname,price) VALUES (2,'智能手机',999);

INSERT INTO product (id,pname,price) VALUES (3,'鞋子',99.99);
INSERT INTO product (id,pname,price) VALUES (4,'衣服',88);
INSERT INTO product (id,pname,price) VALUES (5,'洗衣机',3333.999);


/*
###21数据表添加数据_2
	 * A: 添加数据格式,不考虑主键(因为创建表的时候已经约束了,主键自动增长了)
		insert into 表名 (列名) values (值)
	 * 举例:
		INSERT INTO product (pname,price) VALUE('洗衣机',800);开发中常用此行代码格式.
*/

INSERT INTO product (pname,price) VALUES ('热水器',555);

/*
* B: 添加数据格式,所有值全给出
		格式
		insert into 表名 values (值1,值2,值3..); --向表中插入所有列
		INSERT INOT product VALUES (4,'微波炉',300.25)
*/


INSERT INTO product VALUES (7,'液晶电视',6666.999);

/*
 * C: 添加数据格式,批量写入
		格式:
		insert into 表名 (列名1,列名2,列名3) values (值1,值2,值3),(值1,值2,值3)
	 举例:
		INSERT INTO product (pname,price) VALUES
		('智能机器人',25999.22),
		('彩色电视',1250.36),
		('沙发',58899.02);
提示:在运行的表中,如果勾选了id编号前面的方框,单击右键是可以删除该行的,但是再添加的时候id号会跳过该行增长到下一行,如果想
补回删除的行数,可以重新添加带和该行相同的id号的数据
*/

INSERT INTO product (pname,price) VALUES ('智能机器人',25999.99),('彩电',1299.99),('沙发',888.99);
