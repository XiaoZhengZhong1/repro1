package com_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;




public class outputStream202 {

	public static void main(String[] args) throws IOException {
		demo2();	//�����������ķ���.
	FileOutputStream fos = new FileOutputStream("zzz.txt",true);//��true��ʾ�ڸ��ļ�����д,API��ʾ��ӵ���boolean
					fos.write(100);
					fos.write(101);
					fos.write(102);
					fos.close();
					//���:abcdef
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("zzz.txt");	/*ע������������ȴ����ļ�,��Ϊ��ȡ����Ҫ���ļ�����
		�������,������ǻ��Զ������ļ�,�����Ƚ���,��Ϊ��������������������.*/
		fos.write(97);	//����д����int����4���ֽ�,�����ʱ����bye����1���ֽ�,��ȥ��ǰ��3���ֽ�.
		fos.write(98);
		fos.write(99);
		fos.close();			//�ر�������ͷ���Դ.	
	//������ʱϵͳ���Զ��ڵ�ǰ·������,"zzz.txt"�ļ��������ļ���д�� abc .
	
/*FileOutputStream������ڴ�������(�����ļ�������)��ʱ��,���û�и��ļ��ʹ���һ��,����оͻ����ԭ���ļ�,������д��,�������ԭ��
 * ���ļ�������д����,���ڴ���ԭ���ļ�������ʱ,�ں����ture��("zzz.txt",ture)*/
	}
	
}
