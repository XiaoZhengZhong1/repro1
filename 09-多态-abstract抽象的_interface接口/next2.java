class next2 {
	public static void main(String[] args) {
		coder  a = new coder("xzz",168,10000);
			a.work();
	manager b = new manager("高斯林",001,1000000,2000000);	
		b.work();
	}
}
/*
案例2:成员:项目经理 程序员
共性:姓名,id,工资
特性:项目经理做管理.有奖金
程序员特性:敲代码
*/
abstract class employee{					//员工
	private String name;
	private int id;
	private double salary;		//工资
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
	public void setId(int id){	//程序员
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
	
	public abstract void work();	//工作
}
class coder extends employee{
	public coder(){}
	public coder(String name,int id,double salary){
		super(name,id,salary);
	}
	public void work(){
		System.out.println("我的姓名是:" + this.getName() + ",我的工号是:" + this.getId() + ",我的工资是:" + this.getSalary() + ",我的工作是,敲代码");
	}
}
class manager extends employee{	//项目经理
	private int bonus;	//奖金
	public manager(){}
	public manager(String name,int id,double salary,int bonus){	//注意;因为创建对象时,直接用构造方法初始化值的,所有bonus特有属性奖金,也要赋值,
		super(name,id,salary);
		this.bonus = bonus;										//因为是特有属性,父类没有,所以用this代表本类属性.
	}
	public void work(){
		System.out.println("我的姓名是:" + this.getName() + ",我的工号是:" + this.getId() + ",我的工资是:" + this.getSalary() + ",我的奖金是:" + bonus + "我的工作是管理");
	}
}
/*
我的姓名是:xzz,我的工号是:168,我的工资是:10000.0,我的工作是,敲代码
我的姓名是:高斯林,我的工号是:1,我的工资是:1000000.0,我的奖金是:2000000我的工作是管理
请按任意键继续. . .
*/
