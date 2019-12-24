package com.Thread2;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class D08GUI {

	public static void main(String[] args) {
	/*	###25.13_GUI(如何创建一个窗口并显示)
		* Graphical User Interface(图形用户接口)。
		* */
				Frame  f = new Frame("我的第一个窗口");//创建一个窗口(窗口默认是最小状态,是不可见的.Frame中有设置可见方法)
			//	      //设置布局管理器
				f.setSize(500,400);//设置窗体大小
				f.setLocation(300,200);//设置窗体出现在屏幕的位置
	//	f.setIconImage(Toolkit.getDefaultToolkit().createImage("ws.jpg"));//设置自定义图标,(弄不了)
				Button b = new Button("按钮1");//给窗口设置按钮
				Button b2 = new Button("按钮2");//给窗口设置按钮
				f.add(b);					 //把设置的按钮添加到窗口
				f.add(b2);					 //把设置的按钮添加到窗口
				b2.addActionListener(new ActionListener() {	//在b2窗口中添加一个动作监听器的类.重写关闭方法.
					
					@Override
					public void actionPerformed(ActionEvent e) {	//方法默认b2窗口关闭键是空格键和鼠标左键.
					System.exit(0);		//方法中关闭虚拟机.
					}
				});
				f.setLayout(new FlowLayout());//设置布局管理器,"按键1"的位置(有 东 西 南 北 4个位置)
			//	f.addWindowListener(new abc());//添加一个有关闭窗口方法的对象.(鼠标监听鼠标左键单击可关闭)
				f.setVisible(true);	//设置窗口可见.
	}

}
class abc extends WindowAdapter{	//继承WindowAdapter类,重写里面关闭窗口的方法.
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);		//在方法中输出关闭虚拟机.当创建对象时就会自动调用该方法.
		
	}
}
/*###25.14_GUI(布局管理器)
* FlowLayout（流式布局管理器）
	* 从左到右的顺序排列。
	* Panel默认的布局管理器。
* BorderLayout（边界布局管理器）
	* 东，南，西，北，中
	* Frame默认的布局管理器。
* GridLayout（网格布局管理器）
	* 规则的矩阵
* CardLayout（卡片布局管理器）
	* 选项卡
* GridBagLayout（网格包布局管理器）
	* 非规则的矩阵
###25.15_GUI(窗体监听)
	Frame f = new Frame("我的窗体");
	//事件源是窗体,把监听器注册到事件源上
	//事件对象传递给监听器
	f.addWindowListener(new WindowAdapter() {
	          public void windowClosing(WindowEvent e) {
	                     //退出虚拟机,关闭窗口
			System.exit(0);
		}
	});

###25.16_GUI(鼠标监听)
###25.17_GUI(键盘监听和键盘事件)
###25.18_GUI(动作监听)*/