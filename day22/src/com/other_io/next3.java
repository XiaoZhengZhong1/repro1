package com.other_io;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class next3 {
	/*###22.12_IO流(随机访问流概述和读写数据)(了解)
	* A:随机访问流概述
		* RandomAccessFile概述----是IO流包下的类.此类的实例支持对随机访问文件的读取和写入。
		* RandomAccessFile类不属于流，是Object类的子类。但它融合了InputStream和OutputStream的功能。
		* 支持对随机访问文件的读取和写入。*/
	public static void main(String[] args) throws IOException {
		demo();
			
	}

	public static void demo() throws FileNotFoundException, IOException {
		RandomAccessFile raf = new RandomAccessFile("a.txt","rw");	/*创建一个随机访问流.关联ws.jpg."rw"意思是
		打开文件,以方便读取和写入.如果该文件不存在,就创建一个文件*/
			int i = raf.read();		//读一个字节.
			System.out.println(i);	//输出这个字节.
	
			raf.seek(6);   //设置seek指针.文件读写也是有索引的也是从0索引开始.此行表示从第6个索引开始,读取或者写入.
			int i2 = raf.read();	//表示读取第6个索引的字节.
			System.out.println(i2);	//输出这个字节.
			
			raf.seek(9);			//表示把指针设置在9索引.
			raf.write(113);			//在9索引写入113,文件中9索引出现 q 字符对应的码表是113,此设置是续写,不会清空原文件内容.
			raf.close();
	}

}


