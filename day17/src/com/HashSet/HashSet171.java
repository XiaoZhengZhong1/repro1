package com.HashSet;

import java.util.HashSet;

public class HashSet171 {

	public static void main(String[] args) {
/*###17.01_���Ͽ��(HashSet�洢�ַ���������)
* A:Set���ϸ������ص�
	* ͨ��API�鿴����
* B:������ʾ
	* HashSet�洢�ַ���������
	* */
	 	HashSet<String> hs = new HashSet<>();
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");			//���洢���ɹ���ʱ��,����false
		System.out.println(hs); 	//[a]	֤���ظ���ֵû����ӽ�ȥ.
		System.out.println(b1);		//true	
		System.out.println(b2);		//false	֤���ظ�ʱ���ʧ��.
			hs.add("b");
			hs.add("c");
			hs.add("d");
			hs.add("e");
			for(String s : hs) {		//ֻҪ���õ����Ķ�������ǿforѭ��.
			System.out.print(s + ",");	/*d,e,b,c,a,	֤������˳���.������ַ�,˵��HashSet�̳���ϵ����д��toString
��ΪHashSet��Set������,Set��collection������,HashSet����ײ����,�ܼ̳�������ϵ��,���з�˽�еķ���*/	
			}
	}

}
