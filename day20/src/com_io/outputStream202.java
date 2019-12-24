package com_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;




public class outputStream202 {

	public static void main(String[] args) throws IOException {
		demo2();	//下面提上来的方法.
	FileOutputStream fos = new FileOutputStream("zzz.txt",true);//加true表示在该文件中续写,API显示添加的是boolean
					fos.write(100);
					fos.write(101);
					fos.write(102);
					fos.close();
					//输出:abcdef
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("zzz.txt");	/*注意输出流无需先创建文件,因为读取必须要有文件数据
		都是输出,在输出是会自动创建文件,无需先建好,因为输出是数据在输出者手中.*/
		fos.write(97);	//输入写的是int类型4个字节,单输出时还是bye类型1个字节,会去掉前面3个字节.
		fos.write(98);
		fos.write(99);
		fos.close();			//关闭输出流释放资源.	
	//当运行时系统会自动在当前路径生成,"zzz.txt"文件并且在文件中写出 abc .
	
/*FileOutputStream输出流在创建对象(传入文件名参数)的时候,如果没有该文件就创建一个,如果有就会清空原有文件,在重新写入,如果想在原来
 * 的文件里面续写内容,就在传入原来文件名参数时,在后面加ture如("zzz.txt",ture)*/
	}
	
}
