package com.demo.string;

public class demo3_string {

//1:byte[] ������ = ����.getBytes(); 		���ַ���ת��Ϊ�ֽ�����(���Ǽ�����洢�Ľ�������)
	public static void main(String[] args) {
/*		String a = "abc";
	byte[] arr = a.getBytes();
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] +",");*/
	
/*		String b = "���";						//ͨ��gbk����ַ���ת�����ֽ�����.����,�����ǿ��ö���ת��Ϊ��������Ķ���
		byte[] arr1 = b.getBytes();				//gdk���һ�����Ĵ��������ֽ�,���ҵ�һ���ֽ��Ǹ���
	for (int j = 0; j < arr1.length; j++) {
		System.out.println(arr1[j]);
	*/
	//}
	
		
		
	
	//}
	
	
//2:char[] ������ = ����.toCharArray();		���ַ���ת��Ϊ�ַ�����
		/*String a = "helloWord";
			char[] arr2 = a.toCharArray();
	for (int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i] + ", ");
	}*/


//3:Static String valueOf(char[] arr);  ������ת�����ַ���.�Ǿ�̬��String����.
//��ʽ:String ���� = String.valueOf(char[] arr); ���Խ��κ����͵�����ת�����ַ���.
		char[] a1 = {'a','b','c'};
			String b1 = String.valueOf(a1); 
				System.out.println(b1);
			String a2 = String.valueOf(100);//��int���͵�����ת�����ַ���.
				System.out.println( a2 + 100);
	
	}

}
