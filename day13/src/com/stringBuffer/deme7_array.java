package com.stringBuffer;

import java.util.Arrays;

public class deme7_array {

	public static void main(String[] args) {
/*###13.18_��������(Arrays��ĸ����ͷ���ʹ��)
* A:Arrays�����
	* ���������в����Ĺ����ࡣ
	* �ṩ�����򣬲��ҵȹ��ܡ�
* B:��Ա����
	* public static String toString(int[] a)
	* public static void sort(int[] a)
	* public static int binarySearch(int[] a,int  key)
*/
//��ΪArrayds�඼�Ǿ�̬����,��������ķ���Ҳ����ֱ������������.
	int[] arr = {11,44,66,77,55,33,22};
	//System.out.println(Arrays.toString(arr));//Arrays.toString(arr);����.��������ת �ַ����ķ���.
	
	Arrays.sort(arr);				//����.������������ķ���.������,�ٴ�ӡ.
	//System.out.println(Arrays.toString(arr));	//������,�ٴ�ӡ.
	
	
	int[] a = {11,22,33,44,55,66,77};//���ֲ��ұ�������������.
	System.out.println(Arrays.binarySearch(a, 33));//��ʾ����a������,33������.
	//System.out.println(Arrays.binarySearch(a, 55));//��ʾ����a������,55������.
	//System.out.println(Arrays.binarySearch(a, 88));//��ʾ����a������,88������.
/*����������������У��򷵻������������������򷵻� (-(�����) - 1)�������������ֳ���.����a���鳤����7.����������-7-1=-8
��˼���88Ҫ������a������,�س����ڵڰ˸������.	
*/
	}

}
