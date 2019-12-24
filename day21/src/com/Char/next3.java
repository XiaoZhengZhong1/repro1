package com.Char;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class next3 {
	/*###21.15_IO流(试用版软件)
	* 当我们下载一个试用版软件,没有购买正版的时候,每执行一次就会提醒我们还有多少次使用机会用学过的IO流知识,模拟试用版软件,试用10次机会,
	执行一次就提示一次您还有几次机会,如果次数到了提示请购买正版
	*1:先创建一个文件,文件内容是数字10,代表十次机会.
	*2:创建一个带缓冲区的字符流new BufferedReader(FileReader("int.txt"));,因为要用缓冲区的ReadLine(),整行读取方法.才不会
	*出现像字节和字符一个一个读取,把1按码表读出48.
	*3:定义一个Strint s;用来接收读出的值,因为整行读,所以返回的是字符串.
	*4:把字符串转换成int i = Integer.parseInt(s);
	*5:把转换后的值做if判断,如果>0就输出还有i--次机会,再创建一个输出流FileWriter("int.txt");把 i 写入因为它是写入字符流的便捷类.
	*6:关闭输出流,再else,输出提示语句,"所有次数已到,请购买正版软件.关闭输入流."
	*/
	public static void main(String[] args) throws IOException {
		demo();
	
	}

	public static void demo() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("int.txt"));
		String Line = br.readLine();
		int cha = Integer.parseInt(Line);//注意,如果此行出现数字格式异常.说明文件int.txt中写的内容有问题,有空格之类的无法转换
			if(cha > 0){
				System.out.println("你还有:" + cha-- + "次机会");
			FileWriter fw = new FileWriter("int.txt");
				fw.write(cha + "");
				fw.close();
			}else{
				System.out.println("您的试用次数已到,请购买正版软件");
			}
				br.close();
	}

	/*###21.14_IO流(获取文本上字符出现的次数)
	* 获取一个文本上每个字符出现的次数,将结果写在times.txt上
	* 1:创建一个带缓冲区的字符输入流带文件对象的路径.new BufferedReader(new FileReader("hhh.txt"))
	* 2:创建一个二叉树双列集合.TreeMap<字符,次数>
	* 3:定义int i;用来接收循环读出的缓冲区字符流文件,把每个循环返回的值,强转成字符char(i),再添加到集合put(字符,次数),字符不存在次数1...
	* 4:关闭输出流.
	* 5:创建带缓冲区的字符输出流带文件地址的对象.new BufferedWriter(new FileWriter("times.txt"))
	* 6:用增强for循环遍历集合,在循环中用switch(key) case "\t" 在语句体中写出"\\t" + "=" + get(key);表示遇上制表符就写制表符....
	* 7:关闭输出流.
	* */
		
		


}
