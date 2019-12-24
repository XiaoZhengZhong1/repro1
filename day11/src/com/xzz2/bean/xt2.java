/*
* 创建项目
* 创建包
* 创建类

B:如何去掉默认注释?
	* window -- Preferences -- Java -- Code Style -- Code Templates
	* 选择你不想要的内容，通过右边Edit编辑。
	* 注意：请只删除注释部分，不是注释部分的不要删除。
* C:行号的显示和隐藏
	* 显示：在代码区域的最左边的空白区域，右键 -- Show Line Numbers即可。
	* 隐藏：把上面的动作再做一次。
* D:字体大小及颜色
	* a:Java代码区域的字体大小和颜色：
		* window -- Preferences -- General -- Appearance -- Colors And Fonts --Java修改 -- Java Edit Text Font
	* b:控制台
		* window -- Preferences -- General -- Appearance -- Colors And Fonts -- Debug -- Console font
	* c:其他文件
		* window -- Preferences -- General -- Appearance -- Colors And Fonts -- Basic -- Text Font
* E:窗体给弄乱了，怎么办?
	* window -- Reset Perspective
* F:控制台找不到了，怎么办?
	* Window--Show View—Console
* G:取消悬浮提示
	* window -- Preferences -- Java--Editor--Hovers。右边将Combined Hover勾去掉。
	* 这样代码的悬浮框就不会自动出现了。如果想看提示，将光标悬浮在代码上，按F2即可。
 
###11.05_Java开发工具(Eclipse中内容辅助键的使用)(掌握)
* A:Alt+/ 起提示作用
* B:main+alt+/,syso+alt+/,给出其他提示
* C:补充输出语句,选中需要输出的部分,alt+/选择最后一项即可
* C:定义自己的alt + /
	* windows--perference-Java-Editor-Templates--New

*/
package com.xzz2.bean;

public class xt2 {
	private String name;
	private int age;
	public xt2() {
		super();
		
	}
	public xt2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
