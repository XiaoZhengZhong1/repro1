package com.other_io;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Z_ByteArrayOutputStream222 {
/*###22.03_IO��(�ڴ������*****)(����)
* 1.ʲô���ڴ������
	* ��������������ڴ���д����, ���ڴ浱��һ��������, д��֮�����һ���Ի�ȡ����������
* 2.ʹ�÷�ʽ
	* ��������: new ByteArrayOutputStream()
	* д������: write(int),
	* ��ȡ����: toByteArray()����һ��byte[] arr. ������ת�����ַ���new String(arr)ֱ�������������ַ���.*/
	public static void main(String[] args) throws IOException {
		demo();
	}

public static void demo() throws FileNotFoundException, IOException {
	FileInputStream fis = new FileInputStream("a.txt");
	ByteArrayOutputStream baos = new ByteArrayOutputStream();//���д�������һ�����ڴ滺������С�ɱ�.û�й����ļ�,������.
		int i;
		while((i = fis.read()) != -1){
			baos.write(i);
		}
		
		fis.close();
		System.out.println(baos);  /*�����൱����baos.toString(),���������ת�����ַ���.��ΪByteArrayOutputString
		������д��toString����.���ʱ��дtoStringϵͳ��Ĭ�ϼ���.*/
//����һ�ַ���������baos.toByteArray();�������ص���һ��byte[] arr;�ٰ�����ת�����ַ������.new String(arr);
}

}
