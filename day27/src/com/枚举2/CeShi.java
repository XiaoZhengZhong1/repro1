package com.ö��2;
/*
 * ###27.15_JDK5������(ö�ٵ�ע������)
* A:������ʾ
	* ����ö����Ҫ�ùؼ���enum
	* ����ö���඼��Enum������
	* ö����ĵ�һ���ϱ�����ö������һ��ö�����ķֺ��ǿ���ʡ�Եģ��������ö�����������Ķ���������ֺžͲ���ʡ�ԡ����鲻Ҫʡ��
	* ö��������й���������������private�ģ���Ĭ�ϵ�Ҳ��private�ġ�
	* ö����Ҳ�����г��󷽷�������ö���������д�÷���
	* ö����switch����е�ʹ��
 * */
public class CeShi {

	public static void main(String[] args) {
		//����enum��ö�ٷ�ʽ1
		we MO = we.mo;
		System.out.println(MO);
	

	//����enum��ö�ٷ�ʽ2
			we2 WE2 = we2.mo2;
			System.out.println(WE2.getName());
	//����enum��ö�ٷ�ʽ3
	        we3 WE3 = we3.mo2;
	        	WE3.show();
	
	we2 TU2 = we2.tu2;	//��ʼ���ʽ,
	switch (TU2) {	//��ʾֵTU2,ƥ�������case
	case tu2:		//��ʾtu2�õ���ʼ���ʽ��ƥ��,�Ƿ����TU2
		System.out.println("���ڶ�");
		break;
	case we2:
		System.out.println("����һ");
		break;
	default:
		break;
	}
	
	
	
	}
}
