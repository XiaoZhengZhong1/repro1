package com.Char;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader211 {
/*###21.01_IO��(�ַ���FileReader)
* 1.�ַ�����ʲô
	* �ַ����ǿ���ֱ�Ӷ�д�ַ���IO��
	* �ַ�����ȡ�ַ�, ��Ҫ�ȶ�ȡ���ֽ�����, Ȼ��תΪ�ַ�. ���Ҫд���ַ�, ��Ҫ���ַ�תΪ�ֽ���д��.  */  

	public static void main(String[] args) throws IOException {
		demo();	//���ַ���
	    demo2();//д�ַ���
	    demo3();//�����ַ���.
	}

public static void demo3() throws FileNotFoundException, IOException {
	//###21.03_IO��(�ַ����Ŀ���)
	FileReader fr2 = new FileReader("ddd.txt");
	FileWriter fw2 = new FileWriter("fff.txt");
		int c;
	while((c = fr2.read()) != -1){
		fw2.write(c);
	}
	fr2.close();
	fw2.close();	/*ע������˴����ǹ���,�����ļ����ǿհ�,��Ϊwriter������һ��С���鳤��Ϊ1024���ַ�,һ���ַ����������ֽ�,
	1024���ַ�����2048���ֽ� �˾���2k.������ˢ��,д�����ݾͲ���ʾ*/
}

public static void demo2() throws IOException {
/*###21.02_IO��(�ַ���FileWriter)
* FileWriter���write()���������Զ����ַ�תΪ�ֽ�д��*/
	FileWriter fw = new FileWriter("ddd.txt");
		fw.write("2019��8��21������10��");	//����д����ַ���������ܴ浽�ļ���Ҳ�����Ĺ���.������ַ�������ʽ����.
		fw.close();
}

	public static void demo() throws FileNotFoundException, IOException {
/*2.FileReader-----���ڶ�ȡ�ַ���.�Ƕ�ȡ�ַ��ļ��ı����.
	* FileReader���read()�������԰����ַ���С��ȡ*/
		FileReader fr = new FileReader("sss.txt");	//����һ����ȡ�ַ����ļ�.
				int len;
				while((len = fr.read()) != -1){
					System.out.println((char)len);	/*��ʾ�Ѷ������ֽ��ļ�ǿת���ַ��ļ������,�����.�����ֻ�����0��1
					������Ǽ������ʶ��Ľ�������*/
				}
				fr.close();
	}
/*###21.04_IO��(ʲô�����ʹ���ַ���)
* �ַ���Ҳ���Կ����ı��ļ�, �����Ƽ�ʹ��. ��Ϊ��ȡʱ����ֽ�תΪ�ַ�, д��ʱ��Ҫ���ַ�ת���ֽ�.
* ������Ҫ��ȡһ���ı�, ������Ҫд��һ���ı���ʱ�����ʹ���ַ���
* ��ȡ��ʱ���ǰ����ַ��Ĵ�С��ȡ��,������ְ������
* д����ʱ�����ֱ�ӽ��ַ���д��,����ת��Ϊ�ֽ�����*/

/*###21.05_IO��(�ַ����Ƿ���Կ����Ǵ��ı����ļ�)
* �����Կ����Ǵ��ı����ļ�
* ��Ϊ�ڶ���ʱ��Ὣ�ֽ�ת��Ϊ�ַ�,��ת��������,�����Ҳ�����Ӧ���ַ�,�ͻ���?����,д����ʱ��Ὣ�ַ�ת�����ֽ�д��ȥ
* �����?,ֱ��д��,����д��֮����ļ�������,��������  
*/

}
