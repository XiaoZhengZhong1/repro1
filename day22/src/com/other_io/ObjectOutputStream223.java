package com.other_io;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.person.person;
public class ObjectOutputStream223 {
	
/*###22.05_IO��(���������ObjectOutputStream)(�˽�)ע��Ҫ�浵�����.
* 1.ʲô�Ƕ��������
	* �������Խ�һ������д��, ���߶�ȡһ�����󵽳�����.Ҳ����ִ�������л��ͷ����л��Ĳ���.
	* ��һ������д��,.Ҳ����ִ�������л�new ObjectOutputStream(new FileOutputStream("e.txt"))
	* �������ֽ������,�����ַ������������ֱ��д������,Ҫ��ȡ����,�����л�ObjectInputStream(new FileInputStream("e.txt"))
	*/
	public static void main(String[] args) throws IOException, Exception{
		demo();
	
	}

	public static void demo() throws IOException, FileNotFoundException {
		person a = new person("Ф��",2);
		person a2 = new person("��ϼ",24);
		person a3 = new person("Ф��",31);
		ArrayList<person> b = new ArrayList<>();
			b.add(a);
			b.add(a2);
			b.add(a3);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
			oos.writeObject(b);		//�Ѽ��ϵ�������д����������л�·��e.txt��
			oos.close();
	}
}
