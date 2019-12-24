package com.HashSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.xzz.bean_1.student;

public class next4 {
	/*###17.19_集合框架(键盘录入学生信息按照总分排序后输出在控制台)
	* A:案例演示
		* 需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。
		*1:需要创建一个显示类,里面封装有,姓名,语文成绩,数学成绩,英语成绩,还有总和. 
		*2:总和是根据其它三门成绩算出来的.所以在有参构造里面加行求和的代码,和是求出来的,不算参数,在下面提供一个单独获取和的get方法
		*3:重写toString方法.格式可以按自定义的来,姓名,语文成绩,数学成绩,英语成绩,总和.
		*4:在另一个类中创建scanner,再来个提示,请输入姓名,语文成绩,数学成绩.英语蔡
		*5:创建一个TreeSet集合,在参数中传一个比较器new comparator(),重写比较方法compare();
		*6:while()循环判断录入长度.只需要5个.<5
		*7:因为录入的有姓名和成绩,所以先同一录入到String s = sc.nextLine();
		*8:因为要比较的是成绩是int数,还得把录入的字符串给切开,并转成int数,在存到集合中比较.第一个姓名不用转.
		*9:遍历集合.
		*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("请输入学生:姓名,语文成绩,数学成绩,英语成绩");
				
			TreeSet<student> ts = new TreeSet<>(new Comparator<student>() {

				@Override
				public int compare(student s1, student s2) {
					int num = s2.getSum() - s1.getSum();	/*s2-s1返回的是负数,倒过来牌,从总分数高到低.(因为s1是
					每次新进来的,s2是上次比完最小的,每次用最小的减新进的,负数居多.)*/
					return num == 0 ? 1 : num;
				}
			});
	
			while(ts.size() < 5){
				String s = sc.nextLine();
					
				String[] arr = s.split(",");		//表示把录入的内容按","切割成字符串.
				int chinese = Integer.parseInt(arr[1]);		//把成绩转换成int数字并封装从对象.才能存到集合.
				int math = Integer.parseInt(arr[2]);
				int english = Integer.parseInt(arr[3]);
				
				ts.add(new student(arr[0],chinese,math,english));	//表示添加每个学生姓名arr[0],和成绩.
			}
			sc.close();	//结束键盘录入.
			
			for (student sdt : ts) {	//遍历集合.
				System.out.println(sdt);
			}
	
	}

}
