package com.HashSet;

import java.util.TreeSet;

import com.xzz.bean_1.person;

public class TreeSet174 {
	/*###17.09_���Ͽ��(TreeSet�洢Integer���͵�Ԫ�ز�����)
	* A:������ʾ
		* TreeSet�洢Integer���͵�Ԫ�ز�����
	TreeSet�����������϶�����������,Ҳ�ܱ�֤���ظ�.
*/
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
			t.add(5);
			t.add(5);
			t.add(2);
			t.add(2);			
			t.add(4);
			t.add(1);
			t.add(3);
	System.out.println(t);	//[1, 2, 3, 4, 5]
	
	/*###17.10_���Ͽ��(TreeSet�洢�Զ������)
	* A:������ʾ
		* �洢Person����	*/
	TreeSet<person> t2 = new TreeSet<>();
			t2.add(new person("Ф����",31));
			t2.add(new person("��ϼ",24));
			t2.add(new person("Ф��",2));
			System.out.println(t2);	/* �������:com.xzz.bean_1.person cannot be cast to java.lang.Comparable
	��˼��person��û��ʵ��Comparable�ȽϽӿ�,��ȻTreeSet�����Ǹ����������,�����Ҫ�бȽ�,���簴��ֵ��С����֮���,API����һ��
	Comparable��Ȼ����ӿ�,�ܶ����ʵ��������ӿ�,��д�˽ӿ��е�compareto����. ���������Integer��.*/
	//[person [name=Ф��, age=2], person [name=��ϼ, age=24], person [name=Ф����, age=31]]
	}

}
