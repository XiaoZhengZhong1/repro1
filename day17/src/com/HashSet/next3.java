package com.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class next3 {
	/*###17.08_���Ͽ��(��ϰ)
	* �������е��ظ�Ԫ��ȥ��*/
	
	public static void main(String[] args) {
/*1;�ȴ���һ��ArrayList����,��������ظ�ֵ.
 * 2:��ȡһ��ɾ���ظ�Ԫ�صķ���,getxxx(),���ɷ���.
 * 3:�ڷ������洴��һ��HashSet����,��ArrayList����addall()��ӽ���,��ȥ�����ظ�
 * 4:��Arraylist����clera()���,�ٰ�ȥ���ظ���HastSet����addall()��ӽ���.
 * 5:���ArrayList����
 * */
			List<String> A = new ArrayList<>();
				A.add("a");
				A.add("a");
				A.add("b");
				A.add("b");
				A.add("c");
				A.add("c");
				A.add("c");
				getX(A);	//��Ϊ�����л���ظ�ɾ��,��A���,�ٰ�ɾ���ظ����,��ӵ�A��,���Ի�ȡ�Ļ���A.
	System.out.println(A);	//[b, c, a]
	
	}

	public static void getX(List<String> A) {
		HashSet<String> hs = new HashSet<>();
			hs.addAll(A);
			A.clear();
			A.addAll(hs);
	
	}

}
