package com.other_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class sequence221 {
/*此节是了解内容.
 * ##22.01_IO流(序列流)(了解)
* 1.什么是序列流
	* 序列流可以把多个字节输入流整合成一个, 从序列流中读取数据时, 将从被整合的第一个流开始读, 读完一个之后继续读第二个, 以此类推.
	###22.02_IO流(序列流整合多个)(了解)
	* 整合多个: SequenceInputStream(Enumeration)类也是InputStream的子类.构方法接收的是枚举类型.之前学过collection
	* 单列集合,list的子类vector中有elements()方法,返回的是枚举类型.
	* */
	public static void main(String[] args) throws IOException {
		demo();
}

public static void demo() throws FileNotFoundException, IOException {
	FileInputStream fis = new FileInputStream("a.txt");
	FileInputStream fis2 = new FileInputStream("a2.txt");
	FileInputStream fis3 = new FileInputStream("a3.txt");
	Vector<FileInputStream> v = new Vector<>();
		v.add(fis);
		v.add(fis2);
		v.add(fis3);
		Enumeration<FileInputStream> e = v.elements();
SequenceInputStream sis = new SequenceInputStream(e);
FileOutputStream fos = new FileOutputStream("a4.txt");
		int i;
	while((i = sis.read()) != -1){
		fos.write(i);
}
	sis.close();
	fos.close();
}

}
