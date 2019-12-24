/*
###12创建数据库操作
	* A: 创建数据库
		格式:
			* create database 数据库名;
			* create database 数据库名 character set 字符集;



1:创建数据库格式:create database 数据库名;

(选中数据库代码,点击左上第3第3个播放键运行,再点击root@localhost再按f5或者第3行第6个图标
刷新键.root@localhost下面会多出一个自己刚建好的数据库.)注意不能动在原始页面root@cocalhost里面4个原始数据库.要玩数据库得自己新键.
*/

/*1*/CREATE DATABASE mybase2;

/*
2:使用数据库.格式:use 自建的数据库名:
(选中执行)
*/

/*2*/USE mybase2;

/*
3创建数据表格式
	* A:格式：
		create table 表名(
		   列名1 数据类型 约束,
		   列名1 数据类型 约束,
		   列名1 数据类型 约束
		);
创建数据表的步骤.a用户表, b用户编号,c姓名,d用户地址, 
*/

/*3,注意参数用逗号隔开,最后一个参数不用逗号 varchar字符串型要指定字符长度 数据管理工具中没有大括号,只有中括号和小括号*/
CREATE TABLE users(     		/*表示用户表名为a---users*/
	uid INT,			/*表示表中的第一列是用户首字母加id表示用户编号b---int(编号为int类型)*/
	uname VARCHAR(20),	/*表示表中的第二列是用户姓名u代表用户c-----varchar(20)表示姓名是字符串型长度不小于20个字符*/
	uaddress VARCHAR(200)	/*表示表中的第三列是用户地址u代表用户d----varchar(200)表示地址也是字符串类型长度不小于200*/

);
/*上面4行代码表示创建了一个名为users的数据表,表中有3列3竖列,从左往右第一列是id,第二列是name,第三列是address地址,可在自己
创建的数据库中的tables中看到users可右键打开表,能在运行窗口显示*/



/*
###14约束
	* A: 约束的作用:
		create table 表名(
			   列名 类型(长度) 约束,
			   列名 类型(长度) 约束
			);
			限制每一列能写什么数据,不能写什么数据。
		
	* B: 哪些约束:
			主键约束
			非空约束
			唯一约束
			外键约束


###17主键约束
	* A: 主键是用于标识当前记录的字段。它的特点是非空，唯一。
		在开发中一般情况下主键是不具备任何含义，只是用于标识当前记录。
	* B: 格式：
		1.在创建表时创建主键，在字段后面加上  primary key.
		create table tablename(	
		id int primary key,
		.......
		)
		
		2. 在创建表时创建主键，在表创建的最后来指定主键	
		create table tablename(						
		id int，
		.......，
		primary key(id)
		)
		
		3.删除主键：alter table 表名 drop primary key;
		alter table sort drop primary key;
		
		4.主键自动增长：一般主键是自增长的字段，不需要指定。
		实现添加自增长语句,主键字段后加auto_increment(只适用MySQL)



*/

DESC users;	/*查看表的结构*/
SHOW TABLES;
DROP TABLE users;	/*删除表users*/

/*上面已经把刚才创建的users表给删除了,下面重写创建一个带主键约束的表*/
/*要求,创建表,有用户编号,有用户姓名,有用户地址,   并把用户编号列设置为主键约束,保证列的唯一性和非空性,让主键列数据实现
自动增长,在后面加上AUTO_INCREMENT.就是软件给出的最前面的编号,会随着添加而1234....增加*/
CREATE TABLE users(
	uid INT PRIMARY KEY AUTO_INCREMENT,
	uname VARCHAR(20),
	uaddress VARCHAR(200)
);
