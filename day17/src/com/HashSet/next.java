package com.HashSet;

import java.util.HashSet;
import java.util.Random;

public class next {
	/*###17.06_���Ͽ��(����10��1-20֮��������Ҫ������������ظ�)
	* A:������ʾ
		* ���󣺱�дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨��*/
	public static void main(String[] args) {
/*1:Ҫ�������,��Ҫ����Random�����.
 *2:Ҫ�����ظ�,�Ǿ���HashSet��������洢�����.
 * 3:Ҫ���ȡ10��,������sizs()�ĳ���,��ʾ<10.Random���е�next(n)����.�ܱ�ʾ0��n�������
 * 4:Ҫ�����,���ñ�����ӡ.
 * 
 * */
		
		Random r = new Random();
		HashSet<Integer> H = new HashSet<>();
		while(H.size() < 10){			//��ʾ������ϳ���û��10��,���ܼ�����������.
			H.add(r.nextInt(20) + 1);	//��ʾ���������еĻ�ȡ���������,��ȡ0��20�������,+1��ʾ�ܻ�ȡ����20�������.
			}
		for (Integer integer : H) {		//�����ڿ���̨���
			System.out.print(integer + ",");	//16,19,3,4,20,5,7,10,14,15,
		}
	}

}
