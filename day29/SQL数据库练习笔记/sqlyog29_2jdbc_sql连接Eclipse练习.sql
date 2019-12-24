-- ###03准备数据(数据库连接练习)
-- 创建数据库
CREATE DATABASE mybase3;
-- 使用数据库
USE mybase3;
-- 创建分类表
CREATE TABLE sort(
sid INT PRIMARY KEY AUTO_INCREMENT,
sname VARCHAR(100),
sprice DOUBLE,
sdesc VARCHAR(500)
);
			
-- b: 向表中插入数据
-- 初始化数据
INSERT INTO sort(sname,sprice,sdesc) VALUES('家电',2000, '优惠的促销');
INSERT INTO sort(sname,sprice,sdesc) VALUES('家具',8900, '家具价格上调,原材料涨价');
INSERT INTO sort(sname,sprice,sdesc) VALUES('儿童玩具',290, '赚家长的钱');
INSERT INTO sort(sname,sprice,sdesc) VALUES('儿童玩具',290, '赚家长的钱');
INSERT INTO sort(sname,sprice,sdesc) VALUES('服装',24000, '换季销售');
INSERT INTO sort(sname,sprice,sdesc) VALUES('洗涤',50, '洗发水促销');	