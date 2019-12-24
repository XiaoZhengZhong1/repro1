package com.Char;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReader214 {
/*###21.10_IO流(LineNumberReader) 
* LineNumberReader是BufferedReader的子类, 具有相同的功能, 并且可以统计行号(在没有行号时,写入行号.)
	* 调用getLineNumber()方法可以获取当前行号(在循环写入时就要同时写入行号)
	* 调用setLineNumber()方法可以设置当前行号(可以设置从多少行开始编号.)*/
	public static void main(String[] args) throws IOException {
		demo();
	
	
	}

	public static void demo() throws FileNotFoundException, IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("hhh.txt"));
			String s;
			while((s = lnr.readLine()) != null){	//因为LineNumberReader是BufferedReader的子类.可以调用整行读取
				System.out.println(lnr.getLineNumber() + ":" + s);  //表示打印获取统计号和读出的每行内容.
			}
			lnr.close();
	}

}
