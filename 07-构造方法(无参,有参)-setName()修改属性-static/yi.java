/*
###07.01_�������(���췽��Constructor�����͸�ʽ)(����)
* A:���췽������������
	* �����������(����)���г�ʼ��
* B:���췽����ʽ�ص�
	* a:��������������ͬ(��СҲҪ������һ��)
	* b:û�з���ֵ���ͣ���void��û��
	* c:û�о���ķ���ֵreturn;
*/
//��ʾ֤��ʹ�ù��췽��,���������,���õ��÷�������������췽���������
/*
class  yi{
	public static void main(String[] args) {
		diban p = new diban();
	}
}
class diban{
	private String name;
	private int price;
	public diban(){		//���췽��
		name = "��ľ�ذ�";
		price = 50;
		System.out.println(name + " " + price);
	}
}
*/
/*
��ľ�ذ� 50
�밴���������. . ..
*/




/*
#07.02_�������(���췽�������ؼ�ע������)(����)
* A:������ʾ
	* ���췽��������
	* ����:��������ͬ,�뷵��ֵ�����޹�(���췽��û�з���ֵ),ֻ�������б�
* B:���췽��ע������
	* a:�������û�и������췽����ϵͳ���Զ��ṩһ���޲ι��췽����
	* b:������Ǹ����˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽����
		* ע�⣺���ʱ��������ǻ���ʹ���޲ι��췽�����ͱ����Լ�������������Զ�Լ������޲ι��췽��
*/
//û�и������췽����ϵͳ���Զ��ṩһ���޲ι��췽����
//�������û�ж���ֵ�ķ���,���ϵͳ����Ľ�� null 0 ,����ϵͳ�������޲ι��췽��public diban(){},����,����������ͬ.����С�����ǿյ�.���޲�
/*
class  yi{
	public static void main(String[] args) {
		diban p = new diban();
			p.pudi();
	}
}
class diban{
	private String name;
	private int price;
	public void pudi(){
		System.out.println(name + " " + price);
	}
}
*/
/*
null 0
�밴���������. . .
*/
/*




*/
//�޲ι�����вι���.��Ϊ����ĸ�ʽ��;��������������ͬ.һ���в���,һ��û�в���,������ͬ.������ͬ,������.
/*
class  yi{
	public static void main(String[] args) {
		diban p = new diban();
		diban p2 = new diban("����ľ",88);		
	}
}
class diban{
	private String name;
	private int price;
	public diban(){									//��С����,�޲ι���
		System.out.println(name + " " + price);
	}
	public diban(String name,int price){			//С���������в���.���вι���
				this.name = name;
				this.price = price;
		System.out.println(name + " " + price);
	}
		
}		//�������޲ε���ϵͳ��Ĭ��ֵ,�вε�,�����ֵ���,�вεĺô�,�ܸ���������(��Ա����)��ʼ����ֵ,
*/
/*
null 0
����ľ 88
�밴���������. . .
*/



/*
#07.03_�������(����Ա������ֵ�����ַ�ʽ������)
* A:setXxx()����
	* �޸�����ֵ 
* B:���췽��
	* �����������Խ��г�ʼ�� 
*/
//:������Ǹ����˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽����
class  yi{
	public static void main(String[] args) {
		diban p = new diban("����ľ",88);		
			  p = new diban("����֦",999);	//�ڹ��췽���и�����,�����¼���һ������,��ԭ������������,����������ʹ��		
		System.out.println(p.getName()+ " " + p.getPrice());
/*
����֦ 999
�밴���������. . ..
*/
		diban p2 = new diban();	//��Ϊ���޲ι���û�в���,���Ǿ͵���set��Ĳ���
			p2.setName("�ľ");
			p2.setPrice(66);
		System.out.println(p2.getName()+ " " + p2.getPrice());
/*
����ľ 88
�ľ 66
�밴���������. . .
*/
			p2.setName("�춹ɼ");	//setXxx()����,�޸�����ֵ,���㰲ȫ.�ڿ����������޸ĵ�ʱ��,��Щ.�޸ĺ�,ԭ������. 
			p2.setPrice(77);
	System.out.println(p2.getName()+ " " + p2.getPrice());
/*
����ľ 88
�ľ 66
�춹ɼ 77
�밴���������. . .
*/	
	}
}
class diban{
	private String name;
	private int price;
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
	public diban(String name,int price){			
				this.name = name;
				this.price = price;
		
	}
	public diban(){
	
	}	
}	