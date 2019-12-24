package important_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class text1 {
/*###14.18_常见对象(你来到这个世界多少天案例)(掌握)
* A:案例演示
	* 需求：算一下你来到这个世界多少天?*/
	public static void main(String[] args) throws ParseException {
/*题目分析:算出来世界多少天,1:要有两个时间,当前时间和出生时间.是字符串形式的.2:定义日期格式,因为我们要将自己输入的出生和当前时间,转换
成计算机能读懂的日期对象.3:将字符串时间转换成日期对象.4:用当前的日期对象以毫秒的形式减去出生的毫秒形式的日期对象,因为毫秒格式	计算机才能	
进行计算,5:用得到的毫秒差除以1000毫秒除以60秒除以60分除以24小时,就得出天了
	*/
	String birthday = "1988/02/07";
	String today = "2019/08/02";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date c = sdf.parse(birthday);
		Date c1 = sdf.parse(today);
		long c3 = c1.getTime() - c.getTime();
		System.out.println(c3/1000/60/60/24/365);
	}

}
