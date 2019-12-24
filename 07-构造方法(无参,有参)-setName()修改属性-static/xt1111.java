/*
#07.08_面向对象(员工类案例练习)(掌握)
* A:案例演示
	* 需求：定义一个员工类Employee
	* 自己分析出几个成员，然后给出成员变量
		* 姓名name,工号id,工资salary 
	* 构造方法，
		* 空参和有参的
	* getXxx()setXxx()方法，
	* 以及一个显示所有成员信息的方法。并测试。
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
		System.out.println("姓名:" + name + ",工号:" + id + ",工资" + salay + ",工作类容是敲代码");
	}
}
/*
姓名:XZZ,工号:007,工资10000.0,工作类容是敲代码
请按任意键继续. . .
*/


