package important_calendar;

import java.util.Calendar;

public class calender_get {
/*###14.19_常见对象(Calendar类的概述和获取日期的方法)(掌握)
* A:Calendar类的概述
	* Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法，
	* 并为操作日历字段（例如获得下星期的日期）提供了一些方法。
* B:成员方法
	* public static Calendar getInstance()
	* public int get(int field)
*/
//:Calendar类的概述,是一个日历类.替代了date类中的很多过时的方法.	
	public static void main(String[] args) {
//因为Calender是抽象类,无法被实例化,所有不能new对象,可以用类名调用里面的,日历默认时区方法,默认当前时间	
		Calendar c = Calendar.getInstance();//获取默认的当前时间,里面包括所有如年,月,日,时,分,秒,毫秒...但格式表示我们希望的
		//System.out.println(c);
//java.util.GregorianCalendar[time=1564794541823,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=7,WEEK_OF_YEAR=31,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=215,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=9,SECOND=1,MILLISECOND=823,ZONE_OFFSET=28800000,DST_OFFSET=0]	
//上行代码是Calender类中的getInstance方法获取的默认当前时间,我们需要把它转换成我们习惯的年,月,日,时,分,星期.格式.	
/* public int get(int field)获取方法,通过API中Calender类中字段获取.就是通过YEAR字段获取年,通过MONTH获取月......
因为年月日.....字段在Calender类中是静态常量,可以用类名点调用*/
//		System.out.println(c.get(Calendar.YEAR));	//* 用Calender类中的的get(int field)方法获取年,
//		System.out.println(c.get(Calendar.MONTH)+1);	//获取月,因为系统是从0月开始计算的,所有现实中的月就要加一个月
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));	//获取月中的日,
//		System.out.println(getWeek(c.get(Calendar.DAY_OF_WEEK)));	//*获取一星期中,当前星期,但是系统1索引代表星期日,2代表星期一
//由于系统1索引代表星期日,2代表星期一,所有我们需要做一个查表方法,来规范输出结果.注意,当方法调用后,c.get(Calendar.DAY_OF_WEEK)
//整个获取当前星期的代码,都是参数,会拿到方法中进行规范*/	
	
//上面四行可以放在一个输出语句里面	
	System.out.println(c.get(Calendar.YEAR) + "年" + getNum(c.get(Calendar.MONTH)+1) + "月" + 
	getNum(c.get(Calendar.DAY_OF_MONTH))	+ "日" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}	//输出结果:2019年08月03日星期六
	//做一个查表方法,由于系统1索引代表星期日,2代表星期一
	//1:返回值类型返回星期几,是一个字符串.String型.2:方法名getWeek.3:参数int week.4:return String week.
	
	public static String getWeek(int week){
		String[] c1 = { "","星期日","星期一","星期二","星期三","星期四","星期五","星期六",};
			return c1[week];
	}
	//把日期长度格式规范成一致的,如2019年08月03日星期六
	//1:返回值类型,String,2:方法名getNum.3:参数,int num,4:return String num
	public static String getNum(int num){
		return  num > 9 ? "" + num : "0" + num;	//表示如果日期时间大于9就不需要改动,加个空窜.如果不大于9,就加个0
				
	}

/*上面讲的内容有两个知识点.
1:Calendar c = Calendar.getInstance();导Calendar类包.
2;c.get((Calendar.MONTH)+1)调用Calendar类中的get()方法,类名.字段,获取日历内容.注意括号要把+1的结果括起来才是我们需要的结果.
3:String getWeek(int week)用查表方法,规范星期.得出我们想要的正常星期
4:String getNum(int num).用个位和两位数,数字方法.结合三元运算得出我们想要的日期长度一样的格式
*/
}
