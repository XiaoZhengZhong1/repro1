package com.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class next2 {
/*###17.07_���Ͽ��(��ϰ)
* ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�*/
	public static void main(String[] args) {
/*1:����Scanner���󲢵���.
 *2:ȥ�ظ���Ҫ���ַ���ת�����ַ�����,�ٽ��б���,�ٴ洢��HashSet������.
 *3:ȥ���ظ�,��Ҫ����HashSet����
 *4:��ӡ����ͬ���ַ�,���Ǳ�������,
  */
	Scanner sc = new Scanner(System.in);	
		System.out.println("������һ���ظ����ַ���");
		HashSet<Character> hs = new HashSet<>();	//��������.
		String s = sc.nextLine(); 		//����¼���ַ���.
		char[] c = s.toCharArray();		//���ַ���ת�����ַ�����.
		sc.close();						//��������¼��
	for (char d : c) {					//�����ַ�����.
		hs.add(d);						//dϵͳ���Զ���װ�ɶ���.
	}
	for (char d : hs) {					//dϵͳ���Զ���װ�ɶ���.
		System.out.println(d);			//�������ظ�����Ԫ��
	}
	}
	
}
