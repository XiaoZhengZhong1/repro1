package DataSource;

public class Demo1 {
/*###18连接池介绍
	* A: 连接池介绍
		* a: 连接池介绍
			* 实际上就是存放连接的池子(容器)
			* 在开发中“获得连接”或“释放资源”是非常消耗系统资源的两个过程
			* 为了解决此类性能问题，通常情况我们采用连接池技术，来共享连接Connection。
			* 这样我们就不需要每次都创建连接、释放连接了，这些操作都交给了连接池			
		
###19连接池概念规范和DataSource接口
	* A: 连接池概念规范和DataSource接口	
		* a: 连接池概念规范
			* 用池来管理Connection，这样可以重复使用Connection。
			* 不用自己来创建Connection，而是通过池来获取Connection对象
			* 使用完Connection后，调用Connection的close()方法也不会真的关闭Connection，而是把Connection“归还”给池
			* 连接池技术可以完成Connection对象的再次利用
		* b: DataSource接口
			* Java为数据库连接池提供了公共的接口：javax.sql.DataSource
			* 各个厂商需要让自己的连接池实现这个接口。这样应用程序可以方便的切换不同厂商的连接池
			* 常见的连接池：DBCP、C3P0
###20DBCP连接池介绍
	* A: DBCP连接池介绍
		* a: DBCP连接池介绍
			* DBCP也是一个开源的连接池，是Apache Common成员之一，在企业开发中也比较常见，tomcat内置的连接池
		* tomcat服务器简单介绍	

###21导入jar包
	* A: 导入jar包
		* a: jar包介绍	
			* mysql-connector-java-5.1.37-bin.jar：数据库驱动
			* commons-dbutils-1.6.jar：提供QueryRunner类方便进行增删改查操作
			* commons-dbcp-1.4.jar：
			* commons-pool-1.5.6.jar：提供高效的数据库连接池技术
		* b: 导入jar包
			* 在项目根路径下建立文件夹lib
			* 拷贝以上jar包，选定拷贝的jar包/右键/Build Path/Add to Build Path
			*/
}
