//注意if中关系表达式只能用 & && | ||! == != <+ < > >= 之类的关系运算符来表达比较关系
//if(如果的意思)语句的格式   如果if语句要进行数据 录入 就要用数据键盘录入格式(比如多次数据 进行if比较表达) 
// 格式1 if (比较表达式) {语句体;}		比较表达式是boolean布尔型.结果不是true就是false
// 习题demo(演示)   注意class后面的类名不能和下行的代码相同 否则运行会出问题

class ifjc  {
	public static void main(String[] args) {
		//int age = 2;//age(年龄的意思)
		//int age = 4;
		//if (age >= 3) {
		//System.out.println("就可以上幼儿园了");	//这里面的输出语句是为上行的if输出的
		//}
		//System.out.println("这是规定");//运行结果只输出了一句话 "这是规定"  因为2不满足>=3  把年龄改成4后.两句话就都那输出了
	//计算机运行流程 先计算 if后面 比较表达式 的值,如果是true 就执行语句体 如果是false就不执行
	
	
	//格式2 if (关系表达式) {语句体1;}else {语句体2;}   注意只有if后面有 关系表达式 else后面没有
	//int age = 3;
	//System.out.println("就可以上幼儿园");
	//}else {System.out.println("就要等满了三岁再来报名");//else(另外 其他 的意思)
	//}
	//格式2最后运行只会执行一个语句体操作 关系结果true就执行语句体1的操作 false就执行语句体2的操作
	
	//习题 用if语句选择两个数的最大值
	
	/*int a = 5;
	int b = 10;
	int c;
	if (a > b) {c = a;
	}else {c = b;}
	System.out.println("c=" + c);//输出结果c=10 前面学过任何字符串用 + 相连都会被同化 所以 c= 直接输出方便浏览*/
	
	//习题2 判断一个数是奇数还是偶数 并且输出奇数和偶数
	/*int num = 11;
   if (num % 2 == 0)				//前面学过任何整数 % 摸鱼2 不是0 就是1 奇数除以2余1 偶数除以2余0
   {System.out.println(num + "是一个偶数");
   }else {System.out.println(num + "是一个奇数");}//输出结果 11是一个奇数 上行已经把11赋值给num计算机从左往右的顺序先计算出num的值11遇 +"" 加号和字符串被同化
   */
   
   //格式3     else if 可以有很多个  最后else收尾
   //if (关系表达式){语句表达式;}else if (关系表达式) {语句表达式;}else if (关系表达式) {语句表达式;}else {语句表达式;}
   //习题 作息时间表
   /*int x = 30;
   if (x >=5 && x <= 8) {System.out.println("该吃早饭了");
   }else if (x >= 10 && x <= 12) {System.out.println("该吃中饭了");
   }else if (x >= 17 && x <= 19) {System.out.println("该吃晚饭了");
   }else if (x >= 20 && x <=23) {System.out.println("可以吃夜宵了");
   }else if (x <= 24 && x <= 4) {System.out.println("还不睡觉,等看日出呢");
   }else if (x > 24){System.out.println("对不起,您输入的时间格式有误");
   }else {System.out.println("吃货该干活了");
   } */
   //注意 一般遇上左大括号就不用; 如果加了; 会把该行代码和下行代码分开输出
			
   }
}        //问 三元运算和if语句的区别?  答;三元运算能实现的if语句都能实现 反之不能,因为三元运算 运行后只会得到一个结果 ?  :  就是冒号两边的结果.不能输出语句