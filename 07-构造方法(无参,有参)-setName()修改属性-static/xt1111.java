/*
#07.08_�������(Ա���స����ϰ)(����)
* A:������ʾ
	* ���󣺶���һ��Ա����Employee
	* �Լ�������������Ա��Ȼ�������Ա����
		* ����name,����id,����salary 
	* ���췽����
		* �ղκ��вε�
	* getXxx()setXxx()������
	* �Լ�һ����ʾ���г�Ա��Ϣ�ķ����������ԡ�
		* work 
*/

class xt1111 {
	public static void main(String[] args) {
		Employee f =  new Employee("XZZ","007",10000);	
			f.work();
	}
}
class Employee{
	private String name;
	private String id;
	private double salay;
	public Employee(){}
	public Employee(String name,String id,double salay){
		this.name = name;
		this.id = id;
		this.salay = salay;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setSalay(double salay){
		this.salay = salay;
	}
	public double getSalay(){
		return salay;
	}
	public void work(){
		System.out.println("����:" + name + ",����:" + id + ",����" + salay + ",�����������ô���");
	}
}
/*
����:XZZ,����:007,����10000.0,�����������ô���
�밴���������. . .
*/


