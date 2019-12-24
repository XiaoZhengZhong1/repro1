/*
###05.12_Java语言基础(数组的操作4查表法)(掌握)
* A:案例演示
	* 数组查表法(根据键盘录入索引,查找对应星期)'一','二','三','四','五','六','日'
*/
//import java.util.Scanner;
class DemoArray4 {
	public static void main(String[] args){
		//char[] a = {' ','一','二','三','四','五','六','日'};	//元素因为是中文,所以是字符型,要加''.元素第一个是 空格 是要把0顶掉,0=空格 1=1	
			//System.out.println(a[1]);		*/					//此行和上行,代码是直接输出数字对应星期
	
//	根据键盘录入索引,查找对应星期)'
	/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入对应的星期,范围1-7");
			int week = sc.nextInt();	*/				//week是星期礼拜的意思,因为week是接收键盘录入1-7的,所以是int型
			
	//System.out.println("星期" + getWeek(week));		//把方法调用,直接写在输出里和单独写在上一行,意思和效果是一样的.如 getWeek(week);
/*键盘录入输入2,输出结果如下:																	//	System.out.println("星期" + week);	
请输入对应的星期,范围1-7
2
星期二
请按任意键继续. . .	
*/
	//}
//数字索引方法
/*public static char getWeek(int week){						//week是星期礼拜的意思,因为week是接收键盘录入1-7的,所以是int型
	char[] arr = {' ','一','二','三','四','五','六','日'};	//元素里是中文所以是char类型
		return arr[week];	*/								//此行代码发结果是一个元素,所以返回值也是char


/*

###05.13_Java语言基础(数组的操作5基本查找)(掌握)
* A:案例演示
	* 数组元素查找(查找指定元素第一次在数组中出现的索引)*/
//题目分析,就是在一个数组中查找一个指定元素数字.所对应的搜引0123456......
//返回值:索引值肯定是int型,方法名:获得索引getIndex,参数:一个数组int[] arr;一个数值int value
	
	
	int[] arr = {11,22,33,44,55,66,77,88,99,};
		/*int	Index = */getIndex(arr,55);	//55就是方法参数中value的数值,=右边是一个方法调用,方法调用到下面for循环中结束后会得到 i 再赋值给左边,
		//System.out.println(Index);		//Index是索引的意思,索引是int类型
	}
public static int getIndex(int[] arr,int value){
	for (int i = 0;i < arr.length ;i++ ){
		if (arr[i] == value){
		System.out.println(i);//直接在if满足条件后输出i,效果也是一样.下面1行代码,上面的输出代码和方法调用左边的代码,都可以不要,
		//return i;
		}
		
	}
	
		return -1;			//如果没有此行代码就会出现 错误: 缺少返回语句 因为for循环没有满足条件,又没有返回语句,怎么办,所以retnrn -1.表示不存在
		}					//因为索引是从0123456.....没有-1
//输出结果: 4 	



}
