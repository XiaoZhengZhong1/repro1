-- 演示注入攻击 准备数据 
CREATE TABLE users(
id INT PRIMARY KEY AUTO_INCREMENT,
uname VARCHAR(10),
upassword VARCHAR(50)
);
INSERT INTO users VALUES(1,'肖磊','1');
SELECT * FROM users;

-- 上面创建了一个3列的表,增加了一条记录

-- 下面用数据库的条件查询,模拟登陆和登陆时注入攻击
SELECT * FROM users WHERE uname='肖磊' AND upassword='1'; -- 表示模拟正常登陆;姓名等于并且密码等于
-- 演示注入攻击 OR 1=1
SELECT * FROM users WHERE uname='bbbbb' AND upassword='12345' OR 1=1;-- 虽然姓名和密码都不对,但是后面加了or或者,再给了true
/*也就是说or前面的姓名并且密码是一个或者,后面的1=1是一个或者,有一个是true结果就是true,1=1永远都是true,所有不管密码姓名
对不对,只要or后面的条件是true就能登陆成功,这就是数据库的漏洞*/


-- 注入攻击的漏洞,我们需要在Eclipse中 Java中的方法防止攻击的接口preparedStatement预编储存接口