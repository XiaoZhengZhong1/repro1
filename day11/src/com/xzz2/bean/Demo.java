/*
##11.11_Java开发工具(Eclipse中如何删除项目和导入项目)(掌握)
* A:删除项目
	* 选中项目 – 右键 – 删除
		* 从项目区域中删除
		* 从硬盘上删除
* B:导入项目
	* 在项目区域右键找到import
	* 找到General，展开，并找到
	* Existing Projects into Workspace
	* 点击next,然后选择你要导入的项目
	* 注意：这里选择的是项目名称

###11.18_常见对象(Object类的toString()方法)(掌握)

#11.20_常见对象(==号和equals方法的区别)(掌握)
* ==是一个比较运算符号,既可以比较基本数据类型,也可以比较引用数据类型,基本数据类型比较的是值,引用数据类型比较的是地址值
* equals方法是一个方法,只能比较引用数据类型,所有的对象都会继承Object类中的方法,如果没有重写Object类中的equals方法,
 equals方法和==号比较引用数据类型无区别,重写后的equals方法比较的是对象中的属性.
*/
package com.xzz2.bean;

import com.ainmals.cat;

public class Demo {

	public static void main(String[] args) {
		cat c =new cat();
		c.eat();
		c.sleep();
	
	}

}
