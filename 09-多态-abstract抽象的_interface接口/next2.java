class next2 {
	public static void main(String[] args) {
		coder  a = new coder("xzz",168,10000);
			a.work();
	manager b = new manager("��˹��",001,1000000,2000000);	
		b.work();
	}
}
/*
����2:��Ա:��Ŀ���� ����Ա
����:����,id,����
����:��Ŀ����������.�н���
����Ա����:�ô���
*/
abstract class employee{					//Ա��
	private String name;
	private int id;
	private double salary;		//����
	public employee(){}
	public employee(String name,int id,double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setId(int id){	//����Ա
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	
	public abstract void work();	//����
}
class coder extends employee{
	public coder(){}
	public coder(String name,int id,double salary){
		super(name,id,salary);
	}
	public void work(){
		System.out.println("�ҵ�������:" + this.getName() + ",�ҵĹ�����:" + this.getId() + ",�ҵĹ�����:" + this.getSalary() + ",�ҵĹ�����,�ô���");
	}
}
class manager extends employee{	//��Ŀ����
	private int bonus;	//����
	public manager(){}
	public manager(String name,int id,double salary,int bonus){	//ע��;��Ϊ��������ʱ,ֱ���ù��췽����ʼ��ֵ��,����bonus�������Խ���,ҲҪ��ֵ,
		super(name,id,salary);
		this.bonus = bonus;										//��Ϊ����������,����û��,������this����������.
	}
	public void work(){
		System.out.println("�ҵ�������:" + this.getName() + ",�ҵĹ�����:" + this.getId() + ",�ҵĹ�����:" + this.getSalary() + ",�ҵĽ�����:" + bonus + "�ҵĹ����ǹ���");
	}
}
/*
�ҵ�������:xzz,�ҵĹ�����:168,�ҵĹ�����:10000.0,�ҵĹ�����,�ô���
�ҵ�������:��˹��,�ҵĹ�����:1,�ҵĹ�����:1000000.0,�ҵĽ�����:2000000�ҵĹ����ǹ���
�밴���������. . .
*/
