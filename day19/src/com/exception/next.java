package com.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class next {
/*###19.13_异常(练习)
* 键盘录入一个int类型的整数,对其求二进制表现形式
	 * 如果录入的整数过大,给予提示,录入的整数过大请重新录入一个整数BigInteger
	 * 如果录入的是小数,给予提示,录入的是小数,请重新录入一个整数
	 * 如果录入的是其他字符,给予提示,录入的是非法字符,请重新录入一个整数*/

//以下演示try catch中嵌套try catch,排除各种录入异常,温馨提示异常原因. Ctrl + shift + z (自动生成tryqiant)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
			
			
			while(true){		//因为要有一个结果,录入错了得重新录入,就来个无限循环.录入成功就跳出循环.
				String line = sc.nextLine();
				sc.close();	//结束录入,注意运行时不能结束,否则只能录入一次.
				try{
				int num = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));/*表示检测如果录入的内容能转换成int,就将num转换
				toBinaryString(num)二进制(整数转二进制方法,Integer类中的),并输出.*/
				break;		//表示如果上面录入,并且转二进制成功.就跳出循环
				}catch(Exception e){	//表示如果上面try有问题,录入就进这里来了.
					try{
						new BigInteger(line);	//检测看是否能转换成一个过大的整数,如果能,就提示录入整数过大,请重新录入.
						System.out.println("录入整数过大,请重新录入.");
					}catch(Exception e2){		//如果不是上面的原因,就进这里了.
						try{			
							new BigDecimal(line);	//继续检测,录入内容是否能转换成一个小数.如果能,就提示.
						System.out.println("录入的是小数,请重新录入一个整数.");
						}catch(Exception e3){		//如果以打都不符合,那就提示.
							System.out.println("录入非法字符,请重新录入");
						}
					}
					
					
				}
			}
	
	}

}
