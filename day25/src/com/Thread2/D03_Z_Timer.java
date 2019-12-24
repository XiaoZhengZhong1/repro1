package com.Thread2;


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class D03_Z_Timer {
	/*###25.03_多线程(Timer)---计时器类类中所有的方法都是针对任务的叫TimerTask(也是java util包下的抽象类)(掌握)
	* Timer类:计时器(在API中显示搜索.第三行.是java util包下的)schedule方法,是工作计划,日程安排.定时的方法.
	*我们用的类是针对任务的,所以继承的是TimerTask抽象类(该类实现了Runnable线程接口.重写了run()方法)
	* 类中有schedule(TimerTask task, Date time) 方法,   安排在指定的时间执行指定的任务。参数表示(计时器计时任务.计时时间长度)
    * 因为要用到设置时间长度,要用到时间类Date(也是java util包下的),设置当前年月日时分秒,Date;类中提示年要减1900,月要减1
	* */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {//注意我们继承TimerTast,是因为Timer类中scheduble方法定时需要工作任务对象
		Timer t = new Timer();	//因为TimerTask抽象类只有一个空参构造方法,和一个Run方法,一个取消方法和返回方法.没有定时方法.
			t.schedule(new naozhong(), new Date(119, 7, 29, 9, 35, 10),3000);/*表示给下面的闹钟任务设置时间,
			到时间就执行.第一参数是指定任务,第二参数是指定时间,第三参数是指定间隔3秒时间,表示间隔3秒再执行闹钟.(间隔参数可要可不要)*/	
			while(true){	//为了看到明显的闹钟效果,写个无限循环的.
				Thread.sleep(1000);	//表示每隔一秒钟.
				System.out.println(new Date());	//打印当前时间
			}
	}

}
//创建一个类,类中有 任务需要定时执行.就继承任务计时抽象类.抽象抽象方法.
class naozhong extends TimerTask{	//继承任务计时类,Ctrl+1生成重写抽象方法.run()

	@Override
	public void run() {
	System.out.println("该起床了");
	}
	
}
/*知识点:如果是给任务定时,需要继承TimerTast抽象来.重写run()抽象方法.还需要创建Timer计时器对象.才有计时方法调用.而schedule()任务
 * 计时方法,参数中.要有指定任务对象,指定时间对象,指定间隔时间(new任务,new Date,毫秒)*/
 