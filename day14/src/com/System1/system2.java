package com.System1;

public class system2 {

	public static void main(String[] args) {
/*##14.13_��������(System��ĸ����ͷ���ʹ��)
* A:System��ĸ���
	* System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
* B:��Ա����
	1* public static void gc()
	2* public static void exit(int status)
	3* public static long currentTimeMillis()
	4* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
* C:������ʾ
	* System��ĳ�Ա����ʹ��*/
//	System.gc();//1-------��ʾ��������������.
//	System.exit(0);//2-----��ʾ�˳�java�����,0�������˳�,0��������쳣�˳�,�˳��󽫲���������
//3:currentTimeMillis��˼�ǻ�ȡ��ǰʱ��ĺ���ֵ,1��=1000����.��ǰʱ����Э������ʱ 1970 �� 1 �� 1 ����ҹ֮���ʱ���,�Ժ���Ϊ��λ
	long a = System.currentTimeMillis();//3���嵱ǰʱ��.   ��ΪSysem�಻�ܱ�ʵ����,ֻ�����������÷���.��Ϊ�Ǿ�̬����.
		for (int i = 0; i < 1000; i++) {
			System.out.println("*");
		}
	long a1 = System.currentTimeMillis();	//�������ʱ��.
	System.out.println(a1-a);		//����ʱ���,��������forѭ����ʱ��
	
//4:arraycopy�����������˼
	int[] b = {11,22,33,44,55,66,77};
	int[] b1 = new int[10];	//��ʾnewһ��10�����ȵĿ�����,int���͵�����ϵͳĬ��ֵ��0,�ȱ�����ӡ�¿�����.
		for (int i = 0; i < b1.length; i++) {
			System.out.print(b1[i] + ", ");//0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		}
	System.out.println();
	System.arraycopy(b, 0, b1, 0, b.length);//��ʾ��b�����0������ʼ,���Ƶ�b1������,��0����ճ��,���Ƴ�����b����ĳ���.
		for (int i = 0; i < b1.length; i++) {
			System.out.print(b1[i] + ", ");	//��ӡ�¸��ƺ��b1����.11, 22, 33, 44, 55, 66, 77, 0, 0, 0, 
		}
	}

}
