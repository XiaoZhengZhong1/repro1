package com_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class next2 {
/*###20.17_IO��(�����ļ�)
* �ڿ���̨¼���ļ���·��,���ļ���������ǰ��Ŀ��
* ����:1��¼���ʱ����ܻ����,��ʽ����.����¼������ļ���,���Զ���һ������,�ӷ����л�ȡ�ļ�.������������¼��,���ж��ų���ʽ��������.
* 2:���������л�ȡ���涨��ķ����л�ȡ�ļ���.����һ��������.�����д����ȡ�ļ���.����������д�����ļ�������.getname().
* 
* */
	public static void main(String[] args) throws IOException {
		demo();
	}
public static void demo() throws FileNotFoundException, IOException {
	File fi = getfile();
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fi)); 
	BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream(fi.getName()));
		int len;
		while((len = bis.read()) != -1){
			bos.write(len);
		}
		bis.close();
		bos.close();
}
	public static File getfile(){
		Scanner sc = new Scanner(System.in);
			System.out.println("������һ���ļ���");
			
			while(true){
				String f = sc.nextLine();
				File f2 = new File(f);
				if(!f2.exists()){
					System.out.println("������Ĳ���һ���ļ�����ʽ,����������");
				if(f2.isDirectory()){
					System.out.println("���������һ���ļ���,�������ļ���.");
				}
				
				
				sc.close();
				}
				return f2;
			}
		
		
	}
}
