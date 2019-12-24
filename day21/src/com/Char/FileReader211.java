package com.Char;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader211 {
/*###21.01_IO流(字符流FileReader)
* 1.字符流是什么
	* 字符流是可以直接读写字符的IO流
	* 字符流读取字符, 就要先读取到字节数据, 然后转为字符. 如果要写出字符, 需要把字符转为字节再写出.  */  

	public static void main(String[] args) throws IOException {
		demo();	//读字符流
	    demo2();//写字符流
	    demo3();//拷贝字符流.
	}

public static void demo3() throws FileNotFoundException, IOException {
	//###21.03_IO流(字符流的拷贝)
	FileReader fr2 = new FileReader("ddd.txt");
	FileWriter fw2 = new FileWriter("fff.txt");
		int c;
	while((c = fr2.read()) != -1){
		fw2.write(c);
	}
	fr2.close();
	fw2.close();	/*注意如果此处忘记关流,拷贝文件会是空白,因为writer类中有一个小数组长度为1024个字符,一个字符代表两个字节,
	1024个字符就是2048个字节 了就是2k.不关流刷新,写的内容就不显示*/
}

public static void demo2() throws IOException {
/*###21.02_IO流(字符流FileWriter)
* FileWriter类的write()方法可以自动把字符转为字节写出*/
	FileWriter fw = new FileWriter("ddd.txt");
		fw.write("2019年8月21号晚上10点");	//我们写入的字符串计算机能存到文件中也是码表的功劳.码表以字符串的形式储存.
		fw.close();
}

	public static void demo() throws FileNotFoundException, IOException {
/*2.FileReader-----用于读取字符流.是读取字符文件的便捷类.
	* FileReader类的read()方法可以按照字符大小读取*/
		FileReader fr = new FileReader("sss.txt");	//创建一个读取字符的文件.
				int len;
				while((len = fr.read()) != -1){
					System.out.println((char)len);	/*表示把读到的字节文件强转成字符文件再输出,并输出.计算机只会输出0和1
					输出的是计算机能识别的进制数字*/
				}
				fr.close();
	}
/*###21.04_IO流(什么情况下使用字符流)
* 字符流也可以拷贝文本文件, 但不推荐使用. 因为读取时会把字节转为字符, 写出时还要把字符转回字节.
* 程序需要读取一段文本, 或者需要写出一段文本的时候可以使用字符流
* 读取的时候是按照字符的大小读取的,不会出现半个中文
* 写出的时候可以直接将字符串写出,不用转换为字节数组*/

/*###21.05_IO流(字符流是否可以拷贝非纯文本的文件)
* 不可以拷贝非纯文本的文件
* 因为在读的时候会将字节转换为字符,在转换过程中,可能找不到对应的字符,就会用?代替,写出的时候会将字符转换成字节写出去
* 如果是?,直接写出,这样写出之后的文件就乱了,看不了了  
*/

}
