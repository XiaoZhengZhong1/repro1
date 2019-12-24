package com.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*###21.08_IO流(readLine()和newLine()方法)	
* BufferedReader的readLine()方法可以读取一行字符(不包含换行符号)
* BufferedWriter的newLine()可以输出一个跨平台的换行符号,意思是换行.写入是换行.在别的操作系统也可以换行.
* 而"\r\n"只支持windows系统
* readLine是BufferedReader中的方法.
* newLine是BufferedWriter中的方法.
* 
* */
public class readLine_newLine213 {

	public static void main(String[] args) throws IOException {
		
	}
//demo2();演示整行读取和拷贝
	public static void demo2() throws FileNotFoundException, IOException {
		BufferedReader br2 = new BufferedReader(new FileReader("hhh.txt"));
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("hhh2.txt"));
			String s2;
			while((s2 = br2.readLine()) != null){
				bw2.write(s2);
			}
			br2.close();
			bw2.close();
	}
	//demo();---单独演示readLine整行读取的方法功能.
	public static void demo() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("hhh.txt"));
				String s;
			while((s = br.readLine()) != null){	/*因为readLine是整行读取的,返回的是字符串String,所有原代码把遇到-1
			转换成null,这样,才能被String接收.整行读取是以遇到\r\n换行转换符来接收一行的.*/
				System.out.println(s);
			}
			br.close();
	}

}


















