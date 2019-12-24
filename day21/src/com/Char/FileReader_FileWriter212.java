package com.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_FileWriter212 {

	public static void main(String[] args) throws IOException {
		demo();	//方法演示自定义字符数组,拷贝字符文件.
		demo2();//
	}

	public static void demo2() throws FileNotFoundException, IOException {
/*###21.07_IO流(带缓冲的字符流) 
* BufferedReader的read()方法读取字符时会一次读取若干字符到缓冲区, 然后逐个返回给程序, 降低读取文件的次数, 提高效率
* BufferedWriter的write()方法写出字符时会先写到缓冲区, 缓冲区写满时才会写到文件, 降低写文件的次数, 提高效率*/
		BufferedReader br = new BufferedReader(new FileReader("sss.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("ggg2.tet"));
			int len2;
		while((len2 = br.read()) != -1){
			bw.write(len2);
		}
		br.close();
		bw.close();
	}

	public static void demo() throws FileNotFoundException, IOException {
		//###21.06_IO流(自定义字符数组的拷贝)
			FileReader fr = new FileReader("sss.txt"); 
			FileWriter fw = new FileWriter("ggg.txt");
			char[] arr = new char[1024];  //定义一个长度为1024的字符数组.
			int len;
			while((len = fr.read(arr)) != -1){	//表示把fr文件读到arr数组中.注意一定要读到字符数组中.
				fw.write(arr , 0 , len);  //表示把数组中从0索引开始写len个到fw中,注意()中的参数是arr 0 len
			}
			fr.close();
			fw.close();
	}

}
