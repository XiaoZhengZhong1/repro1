package com.other_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.person.person;	
					//ע��Ҫ�浵�����.
							//�˽�����
/*ע���Զ������б���ʵ��Serializable�ӿ�.�����������й���,�˽ӿ��൱���ǿ���.���б�����ObjectOutputStream��д�����к�,���ܶ���*/
public class ObjectInputStream224 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
	demo();
	}

	public static void demo() throws IOException, FileNotFoundException,
			ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
			System.out.println(ois);
		@SuppressWarnings("unchecked")
		
		ArrayList<person> aL = (ArrayList<person>)ois.readObject();  /*��ʾ��ȡ�����������л�,��Ϊ����д�����
		����,���Զ���Ҳ�Ǽ���,����Ҫǿת�ɼ���.*/
			for (person p : aL) {
				System.out.println(p);
			}
			ois.close();
	}
}
