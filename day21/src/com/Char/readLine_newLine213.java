package com.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*###21.08_IO��(readLine()��newLine()����)	
* BufferedReader��readLine()�������Զ�ȡһ���ַ�(���������з���)
* BufferedWriter��newLine()�������һ����ƽ̨�Ļ��з���,��˼�ǻ���.д���ǻ���.�ڱ�Ĳ���ϵͳҲ���Ի���.
* ��"\r\n"ֻ֧��windowsϵͳ
* readLine��BufferedReader�еķ���.
* newLine��BufferedWriter�еķ���.
* 
* */
public class readLine_newLine213 {

	public static void main(String[] args) throws IOException {
		
	}
//demo2();��ʾ���ж�ȡ�Ϳ���
	public static void demo2() throws FileNotFoundException, IOException {
		BufferedReader br2 = new BufferedReader(new FileReader("hhh.txt"));
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("hhh2.txt"));
			String s2;
			while((s2 = br2.readLine()) != null){
				bw2.write(s2);
			}
			br2.close();
			bw2.close();
	}
	//demo();---������ʾreadLine���ж�ȡ�ķ�������.
	public static void demo() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("hhh.txt"));
				String s;
			while((s = br.readLine()) != null){	/*��ΪreadLine�����ж�ȡ��,���ص����ַ���String,����ԭ���������-1
			ת����null,����,���ܱ�String����.���ж�ȡ��������\r\n����ת����������һ�е�.*/
				System.out.println(s);
			}
			br.close();
	}

}


















