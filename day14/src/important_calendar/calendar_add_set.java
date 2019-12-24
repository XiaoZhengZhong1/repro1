package important_calendar;

import java.util.Calendar;

public class calendar_add_set {
/*###14.20_常见对象(Calendar类的add()和set()方法)(掌握)
* A:成员方法
	* public void add(int field,int amount)//field字段的意思,类名.调用,amount数量的意思,表示添加多少或者剪掉多少
	* public final void set(int year,int month,int date)
* B:案例演示
	* Calendar类的成员方法使用*/
public static void main(String[] args) {
	Calendar a = Calendar.getInstance();//类名调用方法,并导包.因为是抽象类,不能实例化,也相当于是父类引用指向子类对象.
	
	a.add(Calendar.YEAR, 1);//Calendar类的add()成员方法,获取字段内容还是要类名.调用的1代表加1年,-1代表减1年.月,日字段一样
	System.out.println(a.get(Calendar.YEAR));//注意要获取,不能输出a,输出a结果将会是系统默认的日历格式,因为Calendar是抽象的
	
	a.set(Calendar.YEAR, 2088);//Calendar类的set()方法,表示获取字段,并设置年月日......
	System.out.println(a.get(Calendar.YEAR));
	
	a.set(1988, 2, 17);//设置年月日.注意输出时要get()获取.
	System.out.println(a.get(Calendar.YEAR) + "年"+ a.get(Calendar.MONTH) + "月" + a.get(Calendar.DAY_OF_MONTH));
	}

}
