package com.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class InputStreamReader216 {

/*###21.12_IO流(使用指定的码表读写字符) 
* FileReader是使用默认码表读取文件, 如果需要使用指定码表读取, 那么可以使用InputStreamReader(字节流,编码表)
* FileWriter是使用默认码表写出文件, 如果需要使用指定码表写出, 那么可以使用OutputStreamWriter(字节流,编码表)
* */
	public static void main(String[] args) throws IOException {
		demo();
	}
/*简单解释就是br缓冲区里面,有InputStreamReader将字节转换成字符的桥梁,用指定编码.GBK和UTF-8
	bw缓冲里有OutputStreamWriter将字符写成字节的桥梁.用指定编码GBK和UTF-8,注意写入和写出的码表要一致,都用GBK比较好.*/

public static void demo() throws UnsupportedEncodingException,
		FileNotFoundException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("hhh.txt"),"GBK"));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("hhh3.txt"),"GBK"));
		int i;
		while((i = br.read()) != -1){
			bw.write(i);
		}
br.close();
bw.close();
}
}
