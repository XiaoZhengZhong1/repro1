/*

13:��д����ʵ���������ݣ�if���ʵ��
���Գɼ��ֵȼ���
	90~100	A�ȡ�
	80-89	B�ȡ�
	70-79	C�ȡ�
	60-69	D�ȡ�
	60����	E�ȡ�
����ݸ����ɼ��������Ӧ�ĵȼ���



*/


import java.util.Scanner;
class zxt {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("������һ������");
	int x = sc.nextInt();
	
	if (x >= 90 && x <=100) {
	System.out.println(x +",��A��");
	}else if (x >= 80 && x <= 89){
	System.out.println(x +",��B��");
	}else if (x >=70 &&  x <= 79) {
	System.out.println(x +",��c��");
	}else if (x >= 60 && x <= 69) {
	System.out.println(x +",��d��");
	}else if (x < 60 ) {
	System.out.println(x +",��e��");
	}else {System.out.println("�Բ���,������������,����������");
	}
	
	}
}
