package com_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class next {
/*###20.16_IO流(图片加密)
* 给图片加密*/
	public static void main(String[] args) throws IOException {
		demo();
	}

public static void demo() throws FileNotFoundException, IOException {
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream("ws.jpg"));
	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("cop3.jpg"));
		int len;
	while((len = bis.read()) != -1){
		bos.write(len ^ 123);//表示在写入的时候,异或上一个整数,因为一个数在异或上两次,就等于这个数本身.写入异或一次,读取异或一次
	}
	bis.close();
	bos.close();
}

}
