package com.other_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class next2 {
/*##22.11_IO��(���ַ�ʽʵ�ּ���¼��)(�˽�)
* A:BufferedReader��readLine������
	* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
* B:Scanner*/
	
	public static void main(String[] args) throws IOException {
		demo();		//�������Ǽ���¼��,����4�д���.demo()ֻ��¼���ַ�.��demo2()���ܸ���ǿ��,��¼���������.
		demo2();
	}

public static void demo2() {
	Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(line);
		sc.close();
}

public static void demo() throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));/*����һ�������������ַ�����
	��.�ڲ����д�������(�ֽ�ת�ַ�������,�����������д���(��׼����������))�ѱ�׼����¼��ת�����ַ�������*/
			String s = br.readLine();	//�����Ѿ�������һ���ַ�¼����.����¼���Ϳ������ж�ȡ��.
			System.out.println(s);		//�Ѷ���������.
			br.close();					//����.
}
	

}
