/** d:方法调用的时候不用在传递数据类型


//注意所有的方法都是有,return返回语句的,虽然void不用写返回语句,还有后面讲的构造方法连void都没有,但都是有返回语句return的,
//不需要写的,系统会自动添加(07.01节06分30秒)
###04.19_Java语言基础(方法概述和格式说明)
* A:为什么要有方法
	* 提高代码的复用性 
* B:什么是方法
	* 完成特定功能的代码块。 
* C:方法的格式
* 
		修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
			方法体语句;
			return 返回值; 
		} 
* D:方法的格式说明
	* 修饰符：目前就用 public static。后面我们再详细的讲解其他的修饰符。
	* 返回值类型：就是功能结果的数据类型。
	* 方法名：符合命名规则即可。方便我们的调用。
	* 参数：
		* 实际参数：就是实际参与运算的。
		* 形式参数；就是方法定义上的，用于接收实际参数的。
	* 参数类型：就是参数的数据类型
	* 参数名：就是变量名
	* 方法体语句：就是完成功能的代码。
	* return：结束方法的。
	* 返回值：就是功能的结果，由return带给调用者。 
*/
/*
B:案例演示
	* 需求求两个数据之和的案例
* C:方法调用图解*/
import java.util.Scanner;
class Smethod							//method是方法的意思
{
	public static void main(String[] args) {
		int c;
		 c = add(20,30);				//调用方法
	System.out.println(c);}				//输出结果 50 没问题.  注意此行和上行两行代码,本是下行方法的内容.是写在上行方法的大括号里面的	
public static int add(int a,int b){		//add是加的意思,因为题目是求和,所以方法叫 加 好理解,方法名可以随便取,合法就行,最好是跟中文字面上的意思一样
 										//注意这个方法是写在上个方法的大括号外面的.表示两个方法是平等级的.但是都在同一个class里面.
	int c = a + b;						
	return c;
	}	
/*
##04.21_Java语言基础(方法的注意事项)
* A:方法调用(有具体返回值)* c:赋值调用,推荐方案。
	* a:单独调用,一般来说没有意义，所以不推荐。
	* b:输出调用,但是不够好。因为我们可能需要针对结果进行进一步的操作。
	
* B:案例演示
	* a:方法不调用不执行
	* b:方法与方法是平级关系，不能嵌套定义
	* c:方法定义的时候参数之间用逗号隔开
	* d:方法调用的时候不用在传递数据类型
	* e:如果方法有明确的返回值，一定要有return带回一个值
*/

/*###04.22_Java语言基础(方法的练习)
* A:案例演示
	* 需求：键盘录入两个数据，返回两个数中的较大值
* B:案例演示
	* 需求：键盘录入两个数据，比较两个数是否相等     
*/
	/*Scanner sc = new Scanner(System.in);	
		System.out.println("请输入一个整数");
			int x = sc.nextInt();
		System.out.println("请输入二个整数");		/*说明下该题目,计算执行流程,从上往下:输入第一个整数,往下存储到空括号,赋值给左边的x,输入第二个整数存储下面
			int y = sc.nextInt();						大括号.赋值给左边的y.到下面的方法调用,x y 已经有值了,方法调用是针对下面的方法语句体的.所以会把值拿到
		int Max = getMax(x,y);			//方法调用		  下面方法语句中进行比较,再把最大值赋值给左边的Max,最后再打印Max*/
		//System.out.println(Max);
	//}	
//public static int getMax(int x,int y){	//get是获取是意思,max是最大值的意思,方法名跟题目相等.
//	return x > y ? x : y;				//此行代码既表达了方法语句体是,用三元运算来比较两个值的大小.有表达了返回值



//	* 需求：键盘录入两个数据，比较两个数是否相等 
//
/*Scanner sc = new Scanner(System.in);	
		System.out.println("请输入一个整数");
			int x = sc.nextInt();
		System.out.println("请输入二个整数");
			int y = sc.nextInt();
		boolean b = isEquals(x,y);		//因为下面方法语句体中,结果是boolean,所以b的结果不是true就是false
	System.out.println(b);
	}
public static boolean isEquals(int x,int y) {
			return x == y;	*/			// == 是关系表达式.是boolean布尔型


/*
#04.23_Java语言基础(方法之输出星形及其调用)
* A:案例演示
	* 需求：根据键盘录入的行数和列数，在控制台输出星形
* B:方法调用：(无返回值,void)
	* 单独调用
	* 输出调用(错误)
	* 赋值调用(错误)*/

	/*Scanner sc = new Scanner(System.in);	
		System.out.println("请输入行数");
			int x = sc.nextInt();
		System.out.println("请输入列数");
			int y = sc.nextInt();
				print(x,y);					//方法调用一定要有,不然底下的for循环中x和y就得不到值.因为没有返回值,也不需要再输出,就直接调用方法
	}

public static void print(int x,int y){		//因为只是要打印 * ,不用,也没有返回值,也不存在类型.所以就是void(空白),因为是打印所以方法名就叫打印print
											//参数肯定就是行数和列数x y
			for (int f = 1;f <= x ;f++ ){		
			for (int j = 1;j <= y ;j++ ){
		System.out.print("*");				//表示不换行打印
			}
		System.out.println();				//换行的作用.把光标换到下行
											//底下的return 返回值.因为只是打印,不需要返回值.所以可以省略.
//10行10列的输出结果如下:		
/*		
**********
**********
**********
**********
**********
**********
**********
**********
**********
**********		
*/		
		//}
	//}

}