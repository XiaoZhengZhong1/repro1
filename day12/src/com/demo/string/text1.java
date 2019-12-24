package com.demo.string;

import java.util.Scanner;

public class text1 {
/*题目:模拟登陆,并提示还有继承机会,用户和密码都是admin
	分析:输入想要键盘录入,提示需要for循环,输入需要if判断关系
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		for(int a = 0;a < 3;a++){
			System.out.println("请输入您的姓名:");
			String userName = sc.nextLine();
			System.out.println("请输入您的密码:");
			String passWord = sc.nextLine();
		
			if("admin".equals(userName) && "admin".equals(passWord)){
				System.out.println("欢迎" + userName + "登陆");
				break;
			}else{
				if(a == 2){
					System.out.println("您的错误次数已到,请改天再来.");
				}else{
					System.out.println("录入错误您还有" + (2-a) + "次机会" );
				}
			
			}
		
		}
		sc.close();
		
		}

}
