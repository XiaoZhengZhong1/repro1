package com.HashMap;

import java.util.Comparator;
import java.util.TreeMap;

import com.student.student2;

public class TreeMap184 {
	/*###18.07_���Ͽ��(TreeMap���ϼ���Studentֵ��String�İ���)
	* A:������ʾ
		* TreeMap���ϼ���Studentֵ��String�İ���*/
	public static void main(String[] args) {

//�ŷ���1:new Comparator<student2>()//ע��Comparator��һ���Ƚ����ӿ�,�ǲ��ܱ�ʵ������,���ǿ��Ե����������ݽ���,��̬.��д����.
		TreeMap<student2, String> tm = new TreeMap<>(new Comparator<student2>() {

			@Override
			public int compare(student2 s1, student2 s2) {	//s1��s2����������ӵ������������
				int num = s1.getAge() - s2.getAge();//ע��Ƚ�������-.
				return num == 0 ? s1.getName().compareTo(s2.getName()) : num;
			}
		});
			tm.put(new student2("��ϼ",24), "����");
			tm.put(new student2("Ф��",2), "Ф��");
			tm.put(new student2("Ф����",31), "Ф�ҳ�");
			System.out.println(tm);
	//{student [name=Ф��, age=2]=Ф��, student [name=��ϼ, age=24]=����, student [name=Ф����, age=31]=Ф�ҳ�}

			
/*TreeMap�ǿ��������,��������,������������,�����Ǹ������ֵ���бȽ������,�����ַ���.1:TreeMap�������бȽ����ķ�����,����newһ��
 * ��������,�����洴��TreeMap����ʱ,�ѱȽ�������������Ҳ��������tm,��д�Ƚ����ıȽϷ���,�Զ���Ƚ�����.    2:���Զ�����student2
 * ʵ��comparable�ɱ��Խӿ�,�����������compareto�ȽϷ���,�Զ��������仹��������Ϊ��Ҫ�ȽϷ���.*/

/*����2:���Զ���student����,ʵ�ֿɱ��Խӿ�,���±ȽϷ���:public class student2 implements Comparable<student2>*/	
	}

}
