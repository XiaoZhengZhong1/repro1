package com.HashMap;

import java.util.HashMap;

import com.student.student2;

public class next {

	public static void main(String[] args) {
/*###18.05_���Ͽ��(HashMap���ϼ���Studentֵ��String�İ���)
* A:������ʾ
	* HashMap���ϼ���Studentֵ��String�İ���*/
	HashMap<student2, String> hm = new HashMap<>();
		hm.put(new student2("Ф��",2), "Ф��");//ע��student�������Ƿ�װ�������������.������Ҫ�����������䵱��һ�����巺��
		hm.put(new student2("Ф����",31), "Ф��");
		hm.put(new student2("��ϼ",24), "����");
		hm.put(new student2("��ϼ",24), "����");
	System.out.println(hm);
	
	
	
	}

}
