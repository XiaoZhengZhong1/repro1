package com.ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_aslist {
/*###16.18_���Ͽ��(Arrays�������asList()������ʹ��)(����)
* A:������ʾ
	* Arrays�������asList()������ʹ��
	* Collection��toArray(T[] a)���Ͱ�ļ���ת����*/
	public static void main(String[] args) {
//1:���ַ�������ת���ɼ���.		
		String[] S = {"a","b","c","d"}; 
			List<String> L= Arrays.asList(S); //������ת���ɼ���,Arrays�������asList()����
				//	L.add("e");		���лᱨ��,����ת���Ϻ�,����ʹ�����Ӻ�ɾ������,���Ǽ��ϵ������������ǿ���ʹ�õ�.
			System.out.println(L);	//[a, b, c, d]
	
//2:��������������ת�ɼ���.
	int[] a = {1,2,3,4,5};
		List<int[]> L1 = Arrays.asList(a);/*����List<String>������û��[]����Ϊ�ַ������������ÿ���ַ���������������
		����,���ܴ���һ������,����String�����������ͱ�����Ƿ��ϼ��ϵ�.��int�ǻ�����������,�����ﲻ�ܴ洢������������,int[]
		�ܵ����Ƕ���,���Զ���װ.*/
	System.out.println(L1);	//[[I@1d1e730]------֤��������������ת���ɼ���,�Ὣ�������鵱�������������ͷ�װ�ɵ�ַ����
	
	Integer[] a1 = {6,7,8,9,10};
		List<Integer> L2 = Arrays.asList(a1);	//����ת����,������������������,���ֻ����������͵����Լ��İ�װ������
	System.out.println(L2);	//[6, 7, 8, 9, 10]
	
	System.out.println();	//����
//3:������ת��������,������.
	ArrayList<String> A3 = new ArrayList<>();	//�������϶���.
			A3.add("a");
			A3.add("s");
			A3.add("d");
			A3.add("f");
	String[] S3 = A3.toArray(new String[6]);	/*��ʾ�Ѽ���ת�����������,toArray()������,��ʾ��Ҫ�������,��Ϊ������
	�������String,���Ծ�newһ��String����,���鳤���Զ���,��[]����<=����A3����ʱ,ȡ���ϵĳ���,������[]����>=����A3����,ȡ����*/
	for (int i = 0; i < S3.length; i++) {
		System.out.print(S3[i] + ",");	//a,s,d,f,null,null,
	}
	}

}
