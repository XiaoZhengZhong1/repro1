package com.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_FileWriter212 {

	public static void main(String[] args) throws IOException {
		demo();	//������ʾ�Զ����ַ�����,�����ַ��ļ�.
		demo2();//
	}

	public static void demo2() throws FileNotFoundException, IOException {
/*###21.07_IO��(��������ַ���) 
* BufferedReader��read()������ȡ�ַ�ʱ��һ�ζ�ȡ�����ַ���������, Ȼ��������ظ�����, ���Ͷ�ȡ�ļ��Ĵ���, ���Ч��
* BufferedWriter��write()����д���ַ�ʱ����д��������, ������д��ʱ�Ż�д���ļ�, ����д�ļ��Ĵ���, ���Ч��*/
		BufferedReader br = new BufferedReader(new FileReader("sss.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("ggg2.tet"));
			int len2;
		while((len2 = br.read()) != -1){
			bw.write(len2);
		}
		br.close();
		bw.close();
	}

	public static void demo() throws FileNotFoundException, IOException {
		//###21.06_IO��(�Զ����ַ�����Ŀ���)
			FileReader fr = new FileReader("sss.txt"); 
			FileWriter fw = new FileWriter("ggg.txt");
			char[] arr = new char[1024];  //����һ������Ϊ1024���ַ�����.
			int len;
			while((len = fr.read(arr)) != -1){	//��ʾ��fr�ļ�����arr������.ע��һ��Ҫ�����ַ�������.
				fw.write(arr , 0 , len);  //��ʾ�������д�0������ʼдlen����fw��,ע��()�еĲ�����arr 0 len
			}
			fr.close();
			fw.close();
	}

}
