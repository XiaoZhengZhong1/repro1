package com.collection;

import java.util.ArrayList;
import java.util.List;

public class next1 {
	/*###15.10_���Ͽ��(List���ϴ洢ѧ�����󲢱���)
	* A:������ʾ
		* ͨ��size()��get()�������ʹ�ñ�����*/
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List L = new ArrayList();
			L.add(new xt2("�ڸ�",2));
			L.add(new xt2("lx",24));
			L.add(new xt2("xzz",31));
			for (int i = 0; i < L.size(); i++) {
				System.out.println(L.get(i));
				xt2 x = (xt2)L.get(i);		//����ת�ͻ�ȡgetName,getAge
				System.out.println(x.getName() + "----" + x.getAge());
			}
	
	
	
	
	}

}
