package com.demo.string;

import java.util.Scanner;

public class text1 {
/*��Ŀ:ģ���½,����ʾ���м̳л���,�û������붼��admin
	����:������Ҫ����¼��,��ʾ��Ҫforѭ��,������Ҫif�жϹ�ϵ
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		for(int a = 0;a < 3;a++){
			System.out.println("��������������:");
			String userName = sc.nextLine();
			System.out.println("��������������:");
			String passWord = sc.nextLine();
		
			if("admin".equals(userName) && "admin".equals(passWord)){
				System.out.println("��ӭ" + userName + "��½");
				break;
			}else{
				if(a == 2){
					System.out.println("���Ĵ�������ѵ�,���������.");
				}else{
					System.out.println("¼�����������" + (2-a) + "�λ���" );
				}
			
			}
		
		}
		sc.close();
		
		}

}
