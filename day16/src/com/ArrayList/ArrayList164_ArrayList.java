package com.ArrayList;

import java.util.ArrayList;

import com.xzz.bean.person;

public class ArrayList164_ArrayList {
/*###16.19_���Ͽ��(����Ƕ��֮ArrayListǶ��ArrayList)(����)
* A:������ʾ
	* ����Ƕ��֮ArrayListǶ��ArrayList*/
	public static void main(String[] args) {
		ArrayList<ArrayList<person>> L = new ArrayList<>();	//������Ƕ�׼���,�൱�ڼ����ﻹ�и�ArrayList<person> L2 = new ArrayList<>();
				ArrayList<person> L2 = new ArrayList<>();
						L2.add(new person("Ф��",2));
				
						L2.add(new person("Ф��",2));
						
						L.add(L2);
						
					for (ArrayList<person> a : L) {	//����Ƕ��,������ȻҲ��ҪǶ��.
						for (person b : a) {	//ע�����еı��� a ����ľ������з������ÿ��person,�൱�ڶ����˶���.
					System.out.print(b + ",");	//person [name=Ф��, age=2],person [name=Ф��, age=2],
						}
					}
	}

}
