package com.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class next {
	/*#21.09_IO��(���ı���ת)
	* ��һ���ı��ĵ��ϵ��ı���ת,��һ�к͵�����һ�н���,�ڶ��к͵����ڶ��н���
	*
	*ע��:���������е�ԭ����,������Ҫ�����.��˼������ʱ�ٿ�,����ʱ�͹ص�.�Ծ����ͷ���Դ���Ч��.
	*/
	public static void main(String[] args) throws IOException{
		demo();
	}

	public static void demo() throws FileNotFoundException, IOException {
		//��ĿҪ�����н���.����Ҫ��BufferedReader�е�readLine���ж�ȡ����.1:��ȡ��·��
		BufferedReader br = new BufferedReader(new FileReader("hhh.txt"));/*����һ�����������Ķ���·��,(ע��,����
		�ڲ����д���һ���ļ�������·��,��Ϊ�������ǿ�·��,���봫��ʵ���ļ�new FileReader("hhh.txt"),�����ļ�)*/
		ArrayList<String> a = new ArrayList<>();//2:��Ϊ��Ҫ��ת����.������Ҫ�ѵ���������.
		String s;		//��Ϊ��ȡ���������ַ���,����Ҫ����һ��String����.
		while((s = br.readLine()) != null){		//��ʾ���ж�ȡ,ֻҪ�����ַ���ִ�������.
			a.add(s);	//�Ѷ�����ÿһ�ж����뼯��.
		}
		br.close();    //������,���Ϲص�.
	
//3:��Ҫд����.��������������д��·��,�ڲ��������������������ļ���.
	BufferedWriter bw = new BufferedWriter(new FileWriter("hhh2.txt"));	//��������������������
	 	for (int i = a.size()-1; i >= 0; i--) {		//��ʾ�����һ������ʼ����.
	 			bw.write(a.get(i));   //��ʾ��ȡ������ÿ��������Ӧ��Ԫ��ֵ.����ÿ�������ַ�
	 			bw.newLine();       //��ʾ����,ѭ���б�ʾûд��һ�оͻ���.
	 	}
	 	bw.close();	//�����д���Ҫ���Ϲص�.
	}
}
