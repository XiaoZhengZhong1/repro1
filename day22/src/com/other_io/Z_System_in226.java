package com.other_io;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Z_System_in226 {
/*###22.10_IO��(��׼���������������������)
* 1.ʲô�Ǳ�׼���������(����)
	* System.in��InputStream, ��׼������, Ĭ�Ͽ��ԴӼ��������ȡ�ֽ�����
	* System.out��PrintStream, ��׼�����, Ĭ�Ͽ�����Console������ַ����ֽ�����
	* in��System���е�static��̬�ֶ�,�Ǳ�׼������.��������÷��ص���InputStream���Ͷ���.
	* System.out.println()Ҳ��һ����׼�������.�������ֶξ���һ����׼�����,�ٵ��ô�ӡ����.������û�й���Ӳ���е��κ��ļ�,���Բ��ù�
	* */
	public static void main(String[] args) throws IOException {
			
/*2.�޸ı�׼���������(�˽�)Ҫ֪�����ǿ��Կ��Ƶ�,�����ڿ���̨¼�����.Ҳ�����������ļ��ж����д��.
* �޸�������: System.setIn(InputStream)
* �޸������: System.setOut(PrintStream)
* 	*/
		System.setIn(new FileInputStream("b.txt"));	//�ı��׼������.
		System.setOut(new PrintStream("a.txt"));	//�ı��׼�����.
				InputStream is = System.in;			//��ȡĬ��ָ����̵ı�׼����������,����ָ���ļ�b.txt
				PrintStream ps  = System.out;		//��ȡĬ��ָ�����̨�ı�׼�����.����ָ���ļ�b2.txt
				int i;
				while((i = is.read()) != -1){
					ps.write(i);
				}
				is.close();
				ps.close();
	}
	//demo();ʲô�Ǳ�׼������(����)
public static void demo() throws IOException {
	InputStream is = System.in;		//��ȡ��׼������.Ĭ��ָ�����.
	int i = is.read();			//�����������.
	System.out.println(i);    //��������Ľ��.---���к����̨����ּ���¼���ʽ.¼��0�س���ʾ48,¼��1�س���ʾ49.
}

}
