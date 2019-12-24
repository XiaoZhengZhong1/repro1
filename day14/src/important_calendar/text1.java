package important_calendar;


import java.util.Calendar;
import java.util.Scanner;

public class text1 {
/*###14.21_常见对象(如何获取任意年份是平年还是闰年)(掌握)
* A:案例演示
	* 需求：键盘录入任意一个年份，判断该年是闰年还是平年*/
	public static void main(String[] args) {
/*题目分析:
 * 1:键盘录入年份.导Scanner包.
 * 2:需要日历类Calendar c = Calendar.getInstance();
 * 3:因为要用2月是28天还是29天,判断平年和闰年.需要 一个获取年的方法.返回结果是判断是否是28或29天,返回一个boolean值 
 * 4:方法中用set方法设置时间为3月1日,再减一天,就能得出2月多少天了
 * 5:返回一个判断语句,判断2月是否为28天或29天
 * */	
	Scanner sc = new Scanner(System.in);
		System.out.println("请输入打印的年份");
			String a = sc.nextLine(); 
			int year = Integer.parseInt(a);
			boolean b = getYear(year);	//调用下面方法,下面方法返回的是Boolean值,所有获取的是true或者false
			System.out.println(b);
			sc.close();   //结束键盘录入.
	}
	
public static boolean getYear(int year) {
	Calendar c = Calendar.getInstance();	//获取日历格式并导包
		c.set(year, 2, 1);					//调用Calendar类的设置方法,设置年月日,年是键盘录入上面的年.
	c.add(Calendar.DAY_OF_MONTH,-1);		//修改c中年月日中的日,设置中2月其实是3月,3月1日减1天,就是2月了
	System.out.println(c.get(Calendar.DAY_OF_MONTH));//打印上面修改后的日,键盘录入2019,这里打印结果是28
	return c.get(Calendar.DAY_OF_MONTH) == 29;	//判断修改后的2月天数是否等于29,等于就返回true上面是闰年,否则反之.
	 
	}
	
}
