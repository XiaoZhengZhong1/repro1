package com.HashMap;

import java.util.ArrayList;
import java.util.Collections;




/*###18.11_���Ͽ��(Collections������ĸ����ͳ�����������)
* A:Collections�����
	* ��Լ��ϲ��� �Ĺ�����
* B:Collections��Ա����
* 
	1	public static <T> void sort(List<T> list)	//��listԪ�ؽ�������.
	2	public static <T> int binarySearch(List<?> list,T key)	//��listԪ�ؽ��ж��ֲ���,�ҵ�Ԫ�ض�Ӧ������.
	3	public static <T> T max(Collection<?> coll)		//��ȡlist�������ֵ,�����ֵ�����.
	4	public static void reverse(List<?> list) 	//��תlist�е�Ԫ��.
	5	public static void shuffle(List<?> list)*/	//��list�е�Ԫ�ؽ������ϴ��.
//��������һ����,���������еķ������Ǿ�̬��,ֻ������������е���,������Ҫ�����List���Ͻӿڵ�
	public class collections186 {
	public static void main(String[] args){
		ArrayList<String> aL = new ArrayList<>();
			aL.add("b");
			aL.add("b");
			aL.add("d");
			aL.add("a");
			aL.add("c");
//1:������.
			Collections.sort(aL);	//�������������.
			System.out.println(aL);	//[a, b, b, c, d]

//2:���ֲ��ҷ�.
			System.out.println(Collections.binarySearch(aL, "d"));	//4����. ��Ϊb�ظ���ռ��1��2����.
	
//3:��ȡ���ֵ.
			System.out.println(Collections.max(aL));	//d ,	String�����˱ȽϷ���,���ֵ�����.
	
//4:��ת����Ԫ��.	
			Collections.reverse(aL);	//���ȷ�ת�����
			System.out.println(aL);		//[d, c, b, b, a]
	
//5:	
			Collections.shuffle(aL);	//�������ϴ��,���ܴ�ӡ.
			System.out.println(aL);		//[d, b, c, a, b]

	}
}