package com.HashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet173 {
/*###17.05_���Ͽ��(LinkedHashSet�ĸ�����ʹ��)
* A:LinkedHashSet���ص�
* B:������ʾ
	* LinkedHashSet���ص�
		* �ײ���������ʵ�ֵ�,��Set��������Ψһ,���Ա�֤��ô�����ôȡ .
		* ��Ϊ��hashSet������,����Ҳ�����ظ�,��֤Ԫ��Ψһ,��HashSetԭ��һ��.*/

	public static void main(String[] args) {
		LinkedHashSet<String>  LHS = new LinkedHashSet<>();	//����LinkedHashSet����.
						LHS.add("a");
						LHS.add("a");
						
						LHS.add("b");
						LHS.add("b");
						LHS.add("c");
						LHS.add("d");
					System.out.print(LHS + ",");	//[a, b, c, d],
	
	}

}
