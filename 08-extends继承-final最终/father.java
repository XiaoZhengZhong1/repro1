/*
###08.19_�������(final�ؼ���������,�����Լ��������ص�)(����)
* A:final����
* B:final�����ص�
	* �����࣬�಻�ܱ��̳�
	* ���α����������ͱ���˳�����ֻ�ܱ���ֵһ��
	* ���η������������ܱ���д
* C:������ʾ
	* final�����ص�
*/


//final�������յ���˼,��final������,�ͱ�ʾ����������յ���,�޷����̳�,��final���α����������ͱ���˳�����ֻ�ܱ���ֵһ��,final���η������������ܱ���д
final class father{								//�����࣬�಻�ܱ��̳�
	public static void main(String[] args) {
		final int NUM = 10;							//���������һ������,������ĸ�������д,����Ƕ������,ÿ�����ʶ���д,�м���_�»��߸���
	//public static final double PI = 3.14;
	
		//final���γ�Ա����,һ�㶼�����public static final һ��ʹ��,��Ϊ��final���κ��Ѿ��ɱ�����.������ֵ��,�޸Ĳ���	
											//��ô��������public static ������,�����,��������һ��,�������ķ���Ȩ��.
	

//class son extends father{					//����: �޷�������father���м̳�  ��Ϊ���Ѿ���final���γ�Ϊ��������
//}
/*
##08.20_�������(final�ؼ������ξֲ�����)(����)
* A:������ʾ
	* �����ڲ����߷��������϶���ʾһ��(�˽�)

	* �������ͣ���ֵ���ܱ��ı�
	* �������ͣ��ǵ�ֵַ���ܱ��ı�,�����е����Կ��Ըı�
*/
	final Bed j = new Bed("��ľ��",9999);
		//j = new Bed("��ľ��",1999);		//����: �޷�Ϊ���ձ���j����ֵ ,��Ϊ�������ͣ��ǵ�ֵַ���ܱ��ı�
		j.setName("��ľ��");				
		j.setPrice(1999);					//���ú�������:��ľ��, 1999 , �������ͣ��ǵ�ֵַ���ܱ��ı�,�����е����Կ��Ըı�
		System.out.println(j.getName() + ", " + j.getPrice());

	}
}
class Bed{
	private String name; 
	private int price;
	public Bed(){}
	public Bed(String name,int price){
		this.name = name;
		this.price = price;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	
}