/*
##07.04_�������(ѧ����Ĵ��뼰����)(����)
* A:������ʾ
	* ѧ���ࣺ
		* ��Ա������
			* name��age
		* ���췽����
			* �޲Σ���������
		* ��Ա������
			* getXxx()/setXxx()
			* show()�������������г�Ա����ֵ
* B:����Ա������ֵ��
	* a:setXxx()����
	* b:���췽��
	
* C:�����Ա����ֵ�ķ�ʽ��
	* a:ͨ��getXxx()�ֱ��ȡȻ��ƴ��
	* b:ͨ������show()�����㶨
*/

class xt1 {
	public static void main(String[] args) {
		student t = new student("xzz",31);
		System.out.println(t.getName() + " " + t.getAge());
		student t2 = new student();
			t2.setName("XL");
			t2.setAge(2);
			t2.show();
	}
}
class student{
	private String name;
	private int age;
	public student(){}
	public student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void show(){
		System.out.println("����:" + name + ",����:" + age);
	
	}
}	

/*
xzz 31
����:XL,����:2
�밴���������. . .
*/






