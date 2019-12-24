package com_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStream204 {
	public static void main(String[] args) throws IOException{
/*###20.11_IO��(BufferedInputStream��BufferOutputStream����)
* A:����˼��
	* �ֽ���һ�ζ�дһ��������ٶ����Ա�һ�ζ�дһ���ֽڵ��ٶȿ�ܶ࣬
	* ���Ǽ��������������Ļ�����Ч����java��������Ƶ�ʱ��
	* Ҳ���ǵ������������˼��(װ�����ģʽ���潲��)�������ṩ���ֽڻ�������
* B.BufferedInputStream
	* BufferedInputStream������һ��������(����)
	* ��BufferedInputStream�ж�ȡһ���ֽ�ʱ
	* BufferedInputStream��һ���Դ��ļ��ж�ȡ8192��, ���ڻ�������, ���ظ�����һ��
	* �����ٴζ�ȡʱ, �Ͳ������ļ���, ֱ�Ӵӻ������л�ȡ
	* ֱ�������������еĶ���ʹ�ù�, �����´��ļ��ж�ȡ8192��
* C.BufferedOutputStream
	* BufferedOutputStreamҲ������һ��������(����)
	* ����������д���ֽ�ʱ, ����ֱ��д���ļ�, ��д����������
	* ֱ��������д��, BufferedOutputStream�Ż�ѻ������е�����һ����д���ļ���
* D.�����Ĵ��� 	*/

//Buffered��������������,�Ƕ��ļ��������������а�װ,��װ���ڴ���,����Ӳ���ж�д�ٶȿ�,Ч�ʸ�.	
	demo();
	}

	public static void demo() throws FileNotFoundException, IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("qqq.txt"));
		/*��ʾ��������������������,Buffered������.������ԭ���������и�����,����Ϊ8192���ֽ�,��С����[1024*8]����һ��.������ʾ����
		 �����ļ�����������,*/
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("cop2.qqq"));
		/*��ʾ�������������������,���������ԭ����Ҳ�����鳤��Ϊ8192���ֽ�.������ʾ��������������ļ�����*/
		int len;	//����������ն����ֽ�.
		while((len = bis.read()) != -1){	//��ʾ�����Ļ������ֽڸ�ֵ��len,ֻ�ж����Ĳ���-1,��ѭ��.(������һ�ζ�ȡ8192���ֽ�)
			bos.write(len);	//��ʾ������������ֽ�д�뻺�������������cop2.qqq��.(һ��д��8192���ֽ�)
		}
		bis.close();	//�ر�������,��������װ���ļ�������.�رջ������͹ر�������һ��.
		bos.close();	//�ر������.
	}
}
//ע��,BufferedInputStream(����������)��new byte[1024*8](С���鿽��),��ʵ���ڹ���������.��������ʹ��.
/* E.С����Ķ�д�ʹ�Buffered�Ķ�ȡ�ĸ�����?
		* ����С���������8192���ֽڴ�С��Buffered�ȽϵĻ�
		* ����С�������ʤһ��,��Ϊ����д��������ͬһ������
		* ��Buffered����������������*/



/*###20.12_IO��(flush��close����������)
* flush()����
	* ����ˢ�»�������,ˢ�º�����ٴ�д�� ,����ѭ����,����һ��д��һ��ˢ��.���õ�д��8192���ֽ���һ������ļ� .(������ſ���,ˢ���˷�ʱ��)
* close()����
	* �����ر����ͷ���Դ�ĵ�,����Ǵ����������������close()����,������ر���,�����ٹر���֮ǰˢ�»�����,�رպ�����д�� 
*/



/*###20.13_IO��(�ֽ�����д����) 
* �ֽ�����ȡ���ĵ�����
	* �ֽ����ڶ����ĵ�ʱ���п��ܻ�����������,������� 
* �ֽ���д�����ĵ�����
	* �ֽ���ֱ�Ӳ������ֽ�,����д�����ı��뽫�ַ���ת�����ֽ����� 
	* д���س����� write("\r\n".getBytes());*/

