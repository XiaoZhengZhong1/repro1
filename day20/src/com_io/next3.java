package com_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class next3 {
/*###20.18_IO��(¼�����ݿ������ļ�)
* ������¼������ݿ�������ǰ��Ŀ�µ�text.txt�ļ���,����¼�����ݵ�����quitʱ���˳�*/
	public static void main(String[] args) throws IOException {
		demo();
	}

	public static void demo() throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������:");
		FileOutputStream fos = new FileOutputStream("nnn.txt");	//��Ϊ�Ǽ���¼��,�����ٴ���������.
		while(true){
			String s = sc.nextLine();
			if("quit".equals(s)){
				break;
			}
			fos.write(s.getBytes());//��ʾ��¼����ַ���ת���ֽ�����,String��������getBytes()����.���ַ���ת��Ϊ�ֽ�����
			fos.write("\r\n".getBytes());	//��ʾд��һ������,����ÿѭ��д��һ���ֽ�,��д��һ������.
		}
		sc.close();
		fos.close();
	}

}
