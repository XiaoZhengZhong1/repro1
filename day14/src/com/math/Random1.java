package com.math;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
/*###14.12_��������(Random��ĸ����ͷ���ʹ��)
* A:Random��ĸ���
	* �������ڲ���������������ͬ�����Ӵ������� Random ʵ����
	* ���ÿ��ʵ��������ͬ�ķ����������У����ǽ����ɲ�������ͬ���������С�
* B:���췽��
	* public Random()
	* public Random(long seed)
* C:��Ա����
	* public int nextInt()
	* public int nextInt(int n)(�ص�����);
*/
//nextInt(int n)����һ��α�����������ȡ�Դ���������������еġ��� 0����������ָ��ֵ����������֮����ȷֲ��� int ֵ��
		Random a = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(a.nextInt(100));//��˼�����0��100����0�������.����forѭ��10��,�ͻ����10����ͬ�����,
		}
	}

}
