package cn.itcast.gjp.app;

import cn.itcast.gjp.view.MainView;

//主程序类,作用,开启软件程序
public class MainApp {

	public static void main(String[] args) {
		new MainView().run();//表示用系统提供的空参构造new一个匿名对象,调用类中的run方法,用来开启用户操作界面
		
	}

}
