/*
��̬�еĳ�Ա�����ص�֮��Ա����:���뿴���(����)ָfather a,���п��ұ�(����)ָnew son()  Ҳ�а󶨶�̬:��˼����ǿ��������д,����ʱ������ĳ�Ա����������û��
��,֤������д,������������Ա����,û�оͻᱨ��,
��̬�о�̬��Ա����.  ��̬�������,���������õ�,���������޷���д,���������������.���Կ����������˭�����˭;
�ܽ�:ֻ����д��(�Ǿ�̬��,���Ƕ�̬��,��̬�󶨵�),���Ǳ��뿴���,���п��ұ�.�������Ǳ��뿴������п����

*/
class  DT11{
	public static void main(String[] args) {
		father a = new son();		//���뿴���,���п��ұ�,������������ұ�new son()�Ӷ����е� son
			a.print();
		son b = new son();
			b.print();	
		a.eat();
		b.eat();//��̬���Դ�����Ե���,�Ͷ���.��Ȼ�������������Ҳ�Ǹ��Ե������
	}							 
}
class father{
	int NUM = 10;
	public void print(){
	System.out.println("father");
	}
	public static void eat(){
		System.out.println("�Է��Ⱦ�");
	}
}
class son extends father{
	int NUM = 20;
	public void print(){
		System.out.println("son");
	} 
	public static void eat(){
		System.out.println("�Է�������");
	}
}
/*
son
son
�Է��Ⱦ�
�Է�������
�밴���������. . .
*/