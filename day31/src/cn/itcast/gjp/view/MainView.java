package cn.itcast.gjp.view;

import java.util.List;
import java.util.Scanner;

import cn.itcast.gjp.controller.ZhangWuController;
import cn.itcast.gjp.domain.ZhangWu;

//视图层就是用户看到和操作是界面(用控制台模拟),操作数据会传递给controller层实现.
//由于要频繁和controller层传递数据,所以在本类new controller对象)
//
public class MainView {
	private  ZhangWuController controller = new ZhangWuController();//私有表示只在本类中,关联使用

	/*
			 *  实现界面效果
			 *  接收用户的输入
			 *  根据数据,调用不同的功能方法*/
	public void run(){
		Scanner sc = new Scanner(System.in);
		while(true){//先在控制台输出选项
			System.out.println("---------------管家婆家庭记账软件---------------");
			System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
			System.out.println("请输入要操作的功能序号[1-5]:");
			//接收用户的菜单选择选项
			int choose = sc.nextInt();
			//对选择的菜单判断,调用不同的功能
			switch(choose){//对选项进行固定判断
			case 1:
			   // 选择添加账务,调用添加账务的方法
				addZhangWu();
				break;
			case 2:
				// 选择的编辑账务,调用编辑账务方法
				editZhangWu();
				break;
			case 3:
				// 选择的删除账务,调用删除账务方法
				deleteZhangWu();
				break;
			case 4:
				// 选择的是查询账务,调用查询方法
				selectZhangWu();
				break;
			case 5:
				System.exit(0);//正常退出虚拟机
				break;
		}
			sc.close();			
		}
		
	}

	/*定义方法,实现对账务的删除功能
	 * 实现思想
	 * 接收用户录入信息,输入一个主键数据.再由本类调用控制层的删除方法.并传递视图层接收的主键数据.
	 * */
	public void deleteZhangWu(){
		selectAll();
		System.out.println("你选择的是删除功能,请输入要删除的id号");
		int Zwid = new Scanner(System.in).nextInt();//因为只需要录入一个id号,所以可以new一个键盘录入,调用录入方法.
		controller.deleteZhangWu(Zwid);
		System.out.println("账务删除成功");
		
	}
	
	
	
	
	
	
	/*定义方法,实现对账务的编辑功能
	 * 实现思想
	 * 接收用户录入数据信息,把信息封装成zhangwu对象.
	 * 调用控制层controller的编辑方法.传递录入账务对象参数.实现编辑.
	 * 
	 * */
	public void editZhangWu(){
		selectAll();//表示用户选中2选项编辑账务时,先把所有账务打印给用户看,以方便选中编辑.
		System.out.println("请选择要编辑的账务");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要编辑的id");
		int zwid = sc.nextInt();
		System.out.println("请输入分类名称");
		String flname = sc.next();//next()可以接收任意类型的数据
		System.out.println("请输入金额");
		 double money = sc.nextDouble();
		System.out.println("请输入账户");
		String zhanghu = sc.next();
		System.out.println("请输入日期xxxx年-xx月-xx日");
		String createtime = sc.next();
		System.out.println("请输入描述具体信息");
		String description = sc.next();
		//把键盘录入的信息,封装成zhangwu对象.
		ZhangWu zw = new ZhangWu(zwid, flname, money, zhanghu, createtime, description);
		//调用控制层controller的账务编辑方法.传递账务对象参数
				controller.editZhangWu(zw);
				System.out.println("编辑账务成功");
				sc.close();
	}
	
	
	
	
	//定义addZhangWu--- 添加账务方法,在用户视图界面选择1的时候调用.
	//把键盘录入的信息,封装成zhangwu对象.表中除了id之外的5项记录(因为主键id已经自动递增,无需添加).
	public void addZhangWu(){
		System.out.println("您选择的是账务添加,请输入以下内容");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入分类名称");
		String flname = sc.next();//next()可以接收任意类型的数据
		System.out.println("请输入金额");
		 double money = sc.nextDouble();
		System.out.println("请输入账户");
		String zhanghu = sc.next();
		System.out.println("请输入日期xxxx年-xx月-xx日");
		String createtime = sc.next();
		System.out.println("请输入描述具体信息");
		String description = sc.next();
		sc.close();
/*将接收到的数据调用Contorller层中的方法,再由contorller层调用service层中的方法,再由service层调用dao层方法,最终由dao层操作
 * 把录入的数据到数据库添加(因为方法名和参数都是一样的,键盘录入的参就是所有参数)*/
	
//把五个录入的参数封装成zhangwu对象,用new zhangwu对象用有参构造,传入六个参数.第一个id可以传入0.因为只是个形式,没有录入id的选项
		ZhangWu zw = new ZhangWu(0, flname, money, zhanghu, createtime, description);
		controller.addZhangWu(zw);
		System.out.println("恭喜添加账务成功");
	}

	
	
	 /*
	  * 定义方法,实现查询所有的账务数据
	  */
	public void selectZhangWu(){
		 System.out.println("1. 查询所有    2. 条件查询");
		 Scanner sc = new Scanner(System.in);
		 int selectChooser = sc.nextInt();
		 //判断根据用户的选择,调用不同的功能
		 sc.close();
		 switch(selectChooser){
		 case 1:
			 //选择的查询所有,调用查询所有的方法
			 selectAll();
			 break;
		 case 2:
			 //选的条件查询,调用带有查询条件的方法
			 select();
			 break;
		 }
	 }
	
	
	 //选择的查询所有,调用查询所有的方法
	public void selectAll(){
		List<ZhangWu> list = controller.selectAll();
		//项目要求,输出的结果要包括表头(指列名如:id)
		 print(list);
	 }

	
	
	 /*
	  * 定义方法,实现条件查询账务数据
	  * 提供用户的输入日期,开始日期结束日期
	  * 就2个日期,传递到controller层
	  * 调用controller的方法,传递2个日期参数
	  * 获取到controller查询的结果集,打印出来
	  */
	 public void select(){
		System.out.println("选择添加查询:请按照时间格式yyyy年-mm月-dd日");
		 Scanner sc = new Scanner(System.in);
		System.out.print("请输入开始日期:");
		String startDate = sc.nextLine();
		System.out.print("请输入结束日期:");
		String endDate = sc.nextLine();
		List<ZhangWu> list = controller.select(startDate, endDate);
		sc.close();
		if(list.size() != 0)
			print(list);
		else
			System.out.println("没有数据");
	 }

	 	


//下面的打印方法由于,每次打印都要调用,重复率太高,已经被抽取成了,一个方法.
public void print(List<ZhangWu> list) {
	System.out.println("ID\t\t类别\t\t金额\t\t账户\t\t时间\t\t\t说明");//每个列名跟两个制表符表示,列之间的记录间隔远
	 for (ZhangWu zw : list) {
		System.out.println(zw.getZwid() + "\t\t" + zw.getFlname() + "\t\t" + zw.getMoney() + "\t\t"
				+ zw.getZhanghu() + "\t\t" + zw.getCreatetime() + "\t\t" + zw.getDescription() );
	}
}




}