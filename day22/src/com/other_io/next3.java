package com.other_io;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class next3 {
	/*###22.12_IO��(��������������Ͷ�д����)(�˽�)
	* A:�������������
		* RandomAccessFile����----��IO�����µ���.�����ʵ��֧�ֶ���������ļ��Ķ�ȡ��д�롣
		* RandomAccessFile�಻����������Object������ࡣ�����ں���InputStream��OutputStream�Ĺ��ܡ�
		* ֧�ֶ���������ļ��Ķ�ȡ��д�롣*/
	public static void main(String[] args) throws IOException {
		demo();
			
	}

	public static void demo() throws FileNotFoundException, IOException {
		RandomAccessFile raf = new RandomAccessFile("a.txt","rw");	/*����һ�����������.����ws.jpg."rw"��˼��
		���ļ�,�Է����ȡ��д��.������ļ�������,�ʹ���һ���ļ�*/
			int i = raf.read();		//��һ���ֽ�.
			System.out.println(i);	//�������ֽ�.
	
			raf.seek(6);   //����seekָ��.�ļ���дҲ����������Ҳ�Ǵ�0������ʼ.���б�ʾ�ӵ�6��������ʼ,��ȡ����д��.
			int i2 = raf.read();	//��ʾ��ȡ��6���������ֽ�.
			System.out.println(i2);	//�������ֽ�.
			
			raf.seek(9);			//��ʾ��ָ��������9����.
			raf.write(113);			//��9����д��113,�ļ���9�������� q �ַ���Ӧ�������113,����������д,�������ԭ�ļ�����.
			raf.close();
	}

}


