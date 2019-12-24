package com_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy203 {
	/*###20.06_IO��(����ͼƬ)
	* FileInputStream��ȡ
	* FileOutputStreamд��*/
/*����ͼƬ,����һ���ļ�����ͼƬ,newһ��������,��ͼƬ�ļ������������,�����read�ļ�.newһ�������,����һ�����ļ���,��ʾҪwriteд
 *һ���ļ�,����һ��int ����,��������read�������ֽ�,whileѭ��read��ͼƬ�ļ�,��ѭ����������������writeд����,��ѭ���ı���
 *д���������,ѭ�������ر�����������. */	
	public static void main(String[] args) throws IOException {
		demo1();
		demo2();

/*###20.09_IO��(����С����)
* write(byte[] b)
* write(byte[] b, int off, int len)д����Ч���ֽڸ���	
* IO����������3:��������.
* qqq.txt = abc													*/	
	demo3();	
//������ȡ��demo3������,ֻ�ж�������,û��д�����.���¶���һ��������.
	
	
	
System.out.println("----------------------------------------------------");	
	demo3_3();	//�˸�ʽ���ǹ����п������õĿ�����ʽ.���鳤��һ���Զ���Ϊ[1024*8]����8k,�պ�1024��2��10�η�.��1kb
	}
public static void demo3_3() throws FileNotFoundException, IOException {
		FileInputStream fis4 = new FileInputStream("qqq.txt");
		FileOutputStream fos4 = new FileOutputStream("cop.qqq");
			byte[] b3 = new byte[2];	/*����һ������lengthΪ2���ֽ�����,���鳤�ȿ����Զ��幤����һ�㶨��Ϊ[1024*8]*/
			int len;	
			while((len = fis4.read(b3)) != -1){	/*��ʾlen��ֵ����fis4�ļ���ȡ��ֵ��b3�����ֵ,b3�����鳤����2,���ж�ȡ��ֻ��
			С�ڵ���2,fis4�ļ�����abc3���ֽ�,���л�ѭ������,��һ�ζ�ȡ2��.�ڶ��ζ�ȡһ��.�������ļ�û���ֽ���,����-1*/
					fos4.write(b3, 0, len);	/*��ʾд��b3������,��0��ʼ,дlen��.��һ����2��,�ڶ�����1��.����ֱ��дb3�������
					�ڶ���ѭ��ʱ,������һ��c,���ǵ�һ�ε�0����a,�����о���cb,��һ��ѭ����ab,��󿽱����ļ����ݾ���abcb*/
				}
			fis4.close();
			fos4.close();
System.out.println("--------------------------------------------------------");
}

	
	
	public static void demo3() throws FileNotFoundException, IOException {
		FileInputStream fis3 = new FileInputStream("qqq.txt");	//����������.
			byte[] b2 = new byte[2];	//����һ��2��Ԫ������������.
			int i = fis3.read(b2);	//inputStreat������read()�����鷽��.���ص���һ��int��.��ʾ��fis3�ļ�������ݶ���b2����
		System.out.println(i);		//��� 2.��ʾ��fis3�ļ���������a��b��b2����.
		for (byte c : b2) {			
			System.out.println(c);	//���97 98	��ʾb2������������Ԫ��a��b.��a bת���ֽ���.
		}
		System.out.println("--------------------------");
		
		int b3 = fis3.read(b2);	//��ʾ�ٶ�һ��fis3�ļ�,����b2������.
		System.out.println(b3);	//��� 1 ��ʾfis3�ж���1���ֽ�,c��b2������.��ʾ��������Ч�ֽ��ļ�,�ļ���abc.��һ�ζ���ab,
		for (byte c2 : b2) {	//��ѭ����b2����.
			System.out.println(c2);	//���  99 98.��ʾ������c������ԭ����a.��Ϊ���鳤���ǲ��ɱ��,��������Ԫ��,
		}
		fis3.close();
	}
/*

###20.08_IO��(�ֽ����鿽��֮available()����)
* A:������ʾ
	* int read(byte[] b):һ�ζ�ȡһ���ֽ�����
	* write(byte[] b):һ��д��һ���ֽ�����
	* available()��ȡ�����ļ����е��ֽڸ���
* �׶�:�п��ܻ��ڴ���� 
*/
//IO����������2:available()�����ȡ�����ļ�,�����Ӱ֮��ļ�G�ڴ�,�ᵼ���ڴ�����,Ҳ���Ƽ�ʹ��.	
	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis2 = new FileInputStream("ws.jpg");
		FileOutputStream fos2 = new FileOutputStream("copy2.jpg");
				fis2.available();	//available()��InputStream��������ķ���,��ʾ��ȡ�ļ��������ֽڸ���.����int
				byte[] arr = new byte[fis2.available()];	//��ʾ����һ�����ļ��ֽ�һ�����ȵ��ֽ�����.		
					fis2.read(arr);		//���������.
					fos2.write(arr);	//д�������.
					fis2.close();
					fos2.close();
	}
/*
###20.07_IO��(������Ƶ�ļ���ԭ��ͼ)
* A:������ʾ
	* �ֽ���һ�ζ�дһ���ֽڸ�����Ƶ
* �׶�:Ч��̫��
*/
//IO��������ʽ1:ע���������д������IO������Ҫ��ʽ,�ͺ��Ĵ���.(��һ��дһ��,�ļ����������ֽ�,һһ��дЧ��̫��)���Ƽ�ʹ�ø÷���.
	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("ws.jpg");	//��ʾ�¼�һ��������,������ͼƬ.����ԭͼƬһ��Ҫ����.
		FileOutputStream fos = new FileOutputStream("copy.jpg");	//����һ�������,����дͼƬ.��������ͼƬ.
				int b;		//����һ������,�������ն�����ÿ���ֽ�.
				while((b = fis.read()) != -1){	//��ʾ����ͼƬ��������.ֱ��=-1,�������.
					fos.write(b);	//��ʾ��ÿ��ѭ�����ַ�д���������.
				}
				fis.close();		//�ر�������,�ͷ���Դ
				fos.close();		//�ر������,�ͷ���Դ.
	}

}
