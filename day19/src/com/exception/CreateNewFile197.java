package com.exception;

import java.io.File;
import java.io.IOException;

public class CreateNewFile197 {
	/*###19.15_File��(File��Ĵ�������)
	* A:��������
		* public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
		* public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
		* public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
	* B:������ʾ	�����ļ����ļ���,���صĶ���boolean����.
		* File��Ĵ�������*/ 
//�����ļ�,
	public static void main(String[] args) throws IOException {
			File f = new File("ccc.txt");		//��ʾ����һ���ļ�������.
			f.createNewFile();	//��ʾ����f������ļ���,����һ�����ļ���,(�����쳣����,Ctrl + 1�׳��쳣,������������)
	System.out.println(f.createNewFile());	//��������ļ��Ƿ񴴽��ɹ�,��Ϊ�ڵ�ǰ·��������,����Ҳ���ڵ�ǰ·��,f5ˢ��.
	//�ļ������ɹ�,�Ͳ��ٴ���,����false.
	
//�����ļ���mkdir,��������ļ���mkdirs.
			File f2 = new File("aaa");		//��ʾ����һ���ļ���,�ļ���һ�㶼��û�к�׺��,�Ӻ�׺Ҳ����. 
			System.out.println(f2.mkdir());  //��ʾ��f2�е����ݴ���һ���ļ���,����Ƿ񴴽��ɹ�,Ĭ�ϵ�ǰ·��.
			
			File f3 = new File("bbb\\ddd");	//��ʾ���������ļ���.\\ת���ʾ����.
			System.out.println(f3.mkdirs());//��ʾ��f3�е����ݴ�������ļ���.
	}

}
