package com.GJP1;
/*今日内容介绍
1、管家婆项目

###01项目训练目标
	* A: 项目训练目标
		* a: 项目目标
			* 综合运用前面所学习的知识点
			* 熟练View层、Service层、Dao层之间的方法相互调用操作、
			* 熟练dbutils操作数据库表完成增删改查
			* 了解公司项目开发的流程，充分的掌握项目需求分析、设计与功能的代码实现。提高同学们独立分析需求与功能实现的能力。	
			* ###02项目中的功能模块
	* A: 项目中的功能模块	
		* a: 五大模块
			* 查询账务
			* 多条件组合查询账务
			* 添加账务
			* 编辑账务
			* 删除账务
			
###03技术的选择和相关jar包
	* A: 技术的选择和相关jar包
		* a: apache的commons组件：
			* commons-dbutils-1.4.jar：封装并简化了JDBC；
			* commons-dbcp-1.4.jar：apache commons提供的数据库连接池组件，命名为DBCP；
		* b: commons.pool-1.3.jar：DBCP连接池依赖该jar包；
			* mysql-connector-java-5.1.28-bin.jar：MySQL的JDBC驱动包，用JDBC连接MySQL数据库必须使用该JAR包。


###04项目中的工具类
	* A: 项目中的工具类
		* a: 工具类的介绍	
			* 每个项目中都会有很多个工具类，不要求每个工具类对能独立写出来，但是要会使用工具类
			* JDBCUtils：用来创建数据库连接池对象

###05数据表的设计
	* A: 数据表的设计
		* a: 数据表的设计(详见：day34_source/表关系.JPG)
			* 表与表之间是有关系的
			* 主表和从表的关系
			* 主表中的主键作为从表中的外键
	###07项目中的分层设计
	* A: 项目中的分层设计
		* a: 各层功能介绍
			* view层作用: 视图层,即项目中的界面
			* controller层作用: 控制层, 获取界面上的数据,为界面设置数据; 将要实现的功能交给业务层处理
			* service层作用: 业务层, 功能的实现, 与controller控制层和数据访问层DAO交互, 将对数据库的操作交给DAO数据访问层来处理
			* dao层作用: 数据访问层, 用来操作数据库表的数据
			* db数据库: 这里指MySQL
			* domain 实体包: 存放JavaBean
			* tools工具包:存放项目中使用到的工具类
			* test 测试包: 存放项目功能测试的代码


						
###08创建项目_分层_导入jar包
	* A: 创建项目_分层_导入jar包
		* a: 创建工程包
			* cn.itcast.gjp.app: 存放main方法类；
			* cn.itcast.gjp.domain: 存放JavaBean；
			* cn.itcast.gjp.view: 存放界面，及表现层类；
			* cn.itcast.gjp.service: 存放业务层类；
			* cn.itcast.gjp.dao: 存放数据访问层类;
			* cn.itcast.gjp.tools:存放工具类
		* b: 导入jar包
			* 在项目根路径下建立文件夹lib
			* 导入以下jar包
				* mysql-connector-java-5.1.37-bin.jar：数据库驱动
				* commons-dbutils-1.6.jar：提供QueryRunner类方便进行增删改查操作
				* commons-dbcp-1.4.jar：
				* commons-pool-1.5.6.jar：提供高效的数据库连接池技术				
			* 拷贝以上jar包，选定拷贝的jar包/右键/Build Path/Add to Build Path

 */
public class demo1 {

}
