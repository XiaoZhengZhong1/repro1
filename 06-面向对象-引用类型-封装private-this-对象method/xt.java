class  xt{
	public static void main(String[] args) {
		shu a = new shu();
		a.name = "����";
		a.age = 50;
		System.out.println(a.name + " " + a.age);
		a.cz();//�������÷��ڳ�Ա����,����������,���ܰ�˳���������
		shu a1 = new shu();	//ͬһ��,����new�ܶ������.�����������ظ�
		a1.name = "��ľ";	//��Ա�������Ը���
		a1.age = 100;
	System.out.println(a1.name + " " + a1.age);
		a1.hm();//��Ա�������Բ�ͬ
       shu a2 = a1;	//��ʾ��һ������a2��a1һ��
		a2.hm();	//��ʾ��Ա����Ҳһ��.���þͻ����,��Ա����Ҳһ��.�����������,��������(new)
	}
}
class shu{
	String name;//ͬһ��,��Ա����(����)ֻ�趨��һ��,
	int age;
public void cz(){
	System.out.println("�����ܳɳ�.������������ľ�Ҿ�");
}
public void hm(){
	System.out.println("��ľ�ܳɳ�.�����ľ��������ľ�Ҿ�");
	}
/*
���� 50
�����ܳɳ�.������������ľ�Ҿ�
��ľ 100
��ľ�ܳɳ�.�����ľ��������ľ�Ҿ�
*/
}