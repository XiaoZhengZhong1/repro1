package com.Char;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class next3 {
	/*###21.15_IO��(���ð����)
	* ����������һ�����ð����,û�й��������ʱ��,ÿִ��һ�ξͻ��������ǻ��ж��ٴ�ʹ�û�����ѧ����IO��֪ʶ,ģ�����ð����,����10�λ���,
	ִ��һ�ξ���ʾһ�������м��λ���,�������������ʾ�빺������
	*1:�ȴ���һ���ļ�,�ļ�����������10,����ʮ�λ���.
	*2:����һ�������������ַ���new BufferedReader(FileReader("int.txt"));,��ΪҪ�û�������ReadLine(),���ж�ȡ����.�Ų���
	*�������ֽں��ַ�һ��һ����ȡ,��1��������48.
	*3:����һ��Strint s;�������ն�����ֵ,��Ϊ���ж�,���Է��ص����ַ���.
	*4:���ַ���ת����int i = Integer.parseInt(s);
	*5:��ת�����ֵ��if�ж�,���>0���������i--�λ���,�ٴ���һ�������FileWriter("int.txt");�� i д����Ϊ����д���ַ����ı����.
	*6:�ر������,��else,�����ʾ���,"���д����ѵ�,�빺���������.�ر�������."
	*/
	public static void main(String[] args) throws IOException {
		demo();
	
	}

	public static void demo() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("int.txt"));
		String Line = br.readLine();
		int cha = Integer.parseInt(Line);//ע��,������г������ָ�ʽ�쳣.˵���ļ�int.txt��д������������,�пո�֮����޷�ת��
			if(cha > 0){
				System.out.println("�㻹��:" + cha-- + "�λ���");
			FileWriter fw = new FileWriter("int.txt");
				fw.write(cha + "");
				fw.close();
			}else{
				System.out.println("�������ô����ѵ�,�빺���������");
			}
				br.close();
	}

	/*###21.14_IO��(��ȡ�ı����ַ����ֵĴ���)
	* ��ȡһ���ı���ÿ���ַ����ֵĴ���,�����д��times.txt��
	* 1:����һ�������������ַ����������ļ������·��.new BufferedReader(new FileReader("hhh.txt"))
	* 2:����һ��������˫�м���.TreeMap<�ַ�,����>
	* 3:����int i;��������ѭ�������Ļ������ַ����ļ�,��ÿ��ѭ�����ص�ֵ,ǿת���ַ�char(i),����ӵ�����put(�ַ�,����),�ַ������ڴ���1...
	* 4:�ر������.
	* 5:���������������ַ���������ļ���ַ�Ķ���.new BufferedWriter(new FileWriter("times.txt"))
	* 6:����ǿforѭ����������,��ѭ������switch(key) case "\t" ���������д��"\\t" + "=" + get(key);��ʾ�����Ʊ����д�Ʊ��....
	* 7:�ر������.
	* */
		
		


}
