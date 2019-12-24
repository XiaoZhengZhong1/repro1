package com.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class next {
	/*#21.09_IO流(将文本反转)
	* 将一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交换
	*
	*注意:工作开发中的原则是,流对象要晚开早关.意思就是用时再开,不用时就关掉.以尽早释放资源提高效率.
	*/
	public static void main(String[] args) throws IOException{
		demo();
	}

	public static void demo() throws FileNotFoundException, IOException {
		//题目要求整行交换.所以要用BufferedReader中的readLine整行读取方法.1:读取流路径
		BufferedReader br = new BufferedReader(new FileReader("hhh.txt"));/*创建一个带缓冲区的读入路径,(注意,必须
		在参数中传入一个文件输入流路径,因为缓冲区是空路径,必须传入实体文件new FileReader("hhh.txt"),匿名文件)*/
		ArrayList<String> a = new ArrayList<>();//2:因为需要反转数组.所以需要把倒过来遍历.
		String s;		//因为读取的是整行字符串,所以要定义一个String接收.
		while((s = br.readLine()) != null){		//表示整行读取,只要还有字符就执行语句体.
			a.add(s);	//把读出的每一行都存入集合.
		}
		br.close();    //读完流,马上关掉.
	
//3:需要写出流.创建带缓冲区的写出路径,在参数中添加匿名输出对象文件名.
	BufferedWriter bw = new BufferedWriter(new FileWriter("hhh2.txt"));	//创建带缓冲的输出流对象
	 	for (int i = a.size()-1; i >= 0; i--) {		//表示从最后一个索开始遍历.
	 			bw.write(a.get(i));   //表示获取集合中每个索引对应的元素值.就是每个整行字符
	 			bw.newLine();       //表示换行,循环中表示没写完一行就换行.
	 	}
	 	bw.close();	//输出流写完就要马上关掉.
	}
}
