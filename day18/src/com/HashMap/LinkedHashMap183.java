package com.HashMap;

import java.util.LinkedHashMap;

public class LinkedHashMap183 {
/*###18.06_���Ͽ��(LinkedHashMap�ĸ�����ʹ��)
* A:������ʾ
	* LinkedHashMap���ص�
		* �ײ�������ʵ�ֵĿ��Ա�֤��ô�����ôȡ*/

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> LHp = new LinkedHashMap<>();	//��������˫�м��϶���,
			LHp.put("��ϼ", 24);
			LHp.put("Ф��", 2);	
			LHp.put("Ф����", 24);
	System.out.println(LHp);	//{��ϼ=24, Ф��=2, Ф����=24} �ܱ�֤��ô����ôȡ.
	
	}

}
