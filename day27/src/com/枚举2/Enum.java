package com.ö��2;
public class Enum {
/*
 * ###27.16_JDK5������(ö����ĳ�������)
* A:ö����ĳ�������
	* int ordinal()	//����ö�����б�ŵ�.
	* int compareTo(E o)	//��ʾ�Ƚ��������.
	* String name()			//��ȡʵ������.
	* String toString()		//��ȡ��д֮���toString����.
	* <T> T valueOf(Class<T> type,String name)  //��̬����,��Ҫ���������.��ʾͨ���ֽ�������ȡö�����Ӧ��ֵ.
	* values() 
	* �˷�����Ȼ��JDK�ĵ��в��Ҳ�������ÿ��ö���඼���и÷�����������ö���������ö��ֵ�ǳ�����
* B:������ʾ
	* ö����ĳ�������

 * */
	public static void main(String[] args) {
		we2 m = we2.mo2;
		we2 t = we2.tu2;
		we2 w = we2.we2;
	//* int ordinal()	//����ö�����б�ŵ�.	
		System.out.println(m.ordinal());	//0
		System.out.println(t.ordinal());	//1
		System.out.println(w.ordinal());	//2
	
	//int compareTo(E o)	//��ʾ�Ƚϱ��.
		System.out.println(m.compareTo(t));//��ʾ0-1   -1
		System.out.println(m.compareTo(w));//��ʾ0-2   -2
	
	//* String name()			//��ȡʵ������.
		System.out.println(m.getName());//��ȡʵ������.
		System.out.println(m.toString());//��ȡ��д֮���toString����.
	
	
	//* <T> T valueOf(Class<T> type,String name)  //��ʾͨ���ֽ�������ȡö�����Ӧ��ֵ.
			we m2 = we.valueOf(we.class, "mo");//��������þ�̬����.ͨ���ֽ�������ö����,��ȡ��Ӧ��ֵ
				System.out.println(m2);
	
	//* values �˷�����Ȼ��JDK�ĵ��в��Ҳ�������ÿ��ö���඼���и÷�����������ö���������ö��ֵ�ǳ�����
				we[] arr = we.values();
					for (we we3 : arr) {
						System.out.println(we3);
					}
	
	}

}
