package com.HashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMap185_Hashtable {
	/*###18.10_���Ͽ��(HashMap��Hashtable������)
	* A:������
		* HashMap��Hashtable������
			* Hashtable��JDK1.0�汾���ֵ�,���̰߳�ȫ��,Ч�ʵ�,HashMap��JDK1.2�汾���ֵ�,���̲߳���ȫ��,Ч�ʸ�
			* Hashtable�����Դ洢null����nullֵ,HashMap���Դ洢null����nullֵ
	* B:������ʾ	
		* HashMap��Hashtable������*/
	
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
			hm.put("null", 22);
			hm.put("w", null);
			System.out.println(hm);	//{w=null, null=22}
			
		Hashtable<String, Integer> ht = new Hashtable<>();
			ht.put("null", 11);
			ht.put("ww", null);
			System.out.println(ht);	//����.java.lang.NullPointerException
	}

}
