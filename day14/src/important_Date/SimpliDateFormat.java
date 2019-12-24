package important_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpliDateFormat {
	/*###14.17_常见对象(SimpleDateFormat类实现日期和字符串的相互转换)(掌握)
	* A:DateFormat类的概述
		* DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。是抽象类，所以使用其子类SimpleDateFormat
	* B:SimpleDateFormat构造方法
		* public SimpleDateFormat()
		* public SimpleDateFormat(String pattern)
	* C:成员方法
		* public final String format(Date date)
		* public Date parse(String source)*/

	
	public static void main(String[] args) throws ParseException {
//以下演示将日期对象a:Fri Aug 02 16:33:00 CST 2019转换成字符串2019年08月02日16时33分07秒
		Date a = new Date();	//创建当前时间对象.
		SimpleDateFormat a1 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");	//创建日期格式对象.并自定义时间格式
			System.out.println(a1.format(a));//调用格式方法,用自定义的时间格式定义a当前时间.

//以下演示将时间字符串,转换成日期对象.			
	String b = "2019年08月02日16时33分07秒";
	SimpleDateFormat b1 = new SimpleDateFormat("yyy年MM月dd日HH时mm分ss秒");
		//Date b3 = b1.parse(b);	//表示将时间字符串转换成日期对象.-------b1.parse下面会出现波浪线异常,ctrl+1抛出异常即可
		System.out.println(b1.parse(b));//Fri Aug 02 16:33:07 CST 2019

	}

}
