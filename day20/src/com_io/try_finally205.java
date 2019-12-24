package com_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class try_finally205 {
/*###20.14_IO��(���ı�׼�����쳣����1.6�汾������ǰ)
* try finallyǶ��
*/

	public static void main(String[] args) throws IOException {
//###20.15_IO��(���ı�׼�����쳣����1.7�汾)----try(������){��дѭ��}���治��д�ر���,ϵͳҲ���Զ��ر�.�����в���ô��.
	try(
	FileInputStream fis2 = new FileInputStream("qqq.txt");
	FileOutputStream fos = new FileOutputStream("zzz.txt");
		){
			int len2;
		while((len2 = fis2.read()) != -1){
			fos.write(len2);
		}//��Ϊjdk1.7�汾������������ʵ����AutoCloseable�ӿ�,(�����Զ��ر� )������д��jdk1.6�汾��IO��finallyǶ�׹ر�.
//��try()�д��������������ʵ����AutoCloseable����ӿ�,���ʵ����,��try�����{}(��д����)ִ�к�ͻ��Զ�����,�������close���������ص� 	
	}
		
		
//������ʾjdk1.6�汾,IO���ı�׼�쳣�������.		
		demo();
	}

public static void demo() throws FileNotFoundException, IOException {
	FileInputStream fis = null;		//��ʾ�ֲ�����ʹ��ǰ���븳ֵ.
	FileOutputStream fos = null;	
try{
	fis = new FileInputStream("qqq.txt");	//�������Ҳ����ļ�������-----�쳣.
	fos = new FileOutputStream("zzz.txt");	//�������޷������ļ������----�쳣.
	int len;								//��������.
	while((len = fis.read()) != -1){		//�������ڶ����ļ��ֽڳ���.ֻҪ������-1��ִ�������.
		fos.write(len);						//д��ÿ�ζ������ֽ�.
	}
	
}finally{								//��ʾ����ִ�е����
	try{
	if(fis != null)				//����ʾֻҪ���������ǿ�,֤�����ļ�����,֤��������������.
		fis.close();		//�ر�������.��finally��Ƕ��try finally�ǲ���������,�ܹ�һ���͹�һ��.��ʡ��Դ,���Ч��.
	}finally{
		if(fos != null){
			fos.close();
		}
	}
}
}

}
