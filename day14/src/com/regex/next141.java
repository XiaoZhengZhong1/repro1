package com.regex;

import java.util.Arrays;

public class next141 {

	public static void main(String[] args) {
/*##14.06_��������(�Ѹ����ַ����е���������)
* A:������ʾ
	* ������������һ���ַ���:��91 27 46 38 50������д����ʵ�������������ǣ���27 38 46 50 91��
	*/
/*��Ŀ����:���Ȱ�ԭʼֵ������ַ���,���и���ַ�������,�ٶ���һ��ͬ�����ȵ�int[]����,�ٰ��ַ����������,�ѱ�����ÿ���ַ���ת����int��	
 ���浽int[]������.������Arrays.sort()��newһ��StringBuilder����,��int[]����,�ѱ����Ľ����append��ӵ�������,�пո�ļӿո�.					*/
//1:����ԭʼ�ַ���String a.
//2:��ԭʼ�ַ����и�split��ֵ���ַ�������String[] a1 = a.split(" ");	
//3:����һ��ͬ�����ȵ�int[] a2 = new int[a1.length] .	
//4:for�����ַ�������.
//5:�ѱ�����ÿ���ַ���ת����int��������ַ�.a2[i] = Integer.parseInt(a1[i])
//6:�ٰ�a2��������,Arrays.sort(a2);
//6:newһ��StringBuilder����.StringBuilder a3 = new StringBuilder();	
//7:��for����a2,�ٰ�a2[i]��Ӹ�a3,  a3.append(a2[i]);	
	
	String a = "91 27 46 38 50";
	String[] a1 = a.split(" ");
	   int[] a2 = new int[a1.length];
	   		for (int i = 0; i < a1.length; i++) {
				a2[i] = Integer.parseInt(a1[i]);
			}
	   		Arrays.sort(a2);
	StringBuilder a3 = new StringBuilder();
		for (int i = 0; i < a2.length; i++) {
			if(a2[i] == a2.length-1){
				a3.append(a2[i]);
			}else{
				a3.append(a2[i] + " ");
				}
		
		}
		System.out.println(a3);
	
	
	
	
	
	}

}
