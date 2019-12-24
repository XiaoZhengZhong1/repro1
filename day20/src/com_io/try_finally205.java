package com_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class try_finally205 {
/*###20.14_IO流(流的标准处理异常代码1.6版本及其以前)
* try finally嵌套
*/

	public static void main(String[] args) throws IOException {
//###20.15_IO流(流的标准处理异常代码1.7版本)----try(流对象){读写循环}后面不用写关闭流,系统也会自动关闭.开发中不怎么用.
	try(
	FileInputStream fis2 = new FileInputStream("qqq.txt");
	FileOutputStream fos = new FileOutputStream("zzz.txt");
		){
			int len2;
		while((len2 = fis2.read()) != -1){
			fos.write(len2);
		}//因为jdk1.7版本输入和输出流都实现了AutoCloseable接口,(可以自动关闭 )里面重写了jdk1.6版本的IO的finally嵌套关闭.
//在try()中创建的流对象必须实现了AutoCloseable这个接口,如果实现了,在try后面的{}(读写代码)执行后就会自动调用,流对象的close方法将流关掉 	
	}
		
		
//下面演示jdk1.6版本,IO流的标准异常处理代码.		
		demo();
	}

public static void demo() throws FileNotFoundException, IOException {
	FileInputStream fis = null;		//表示局部变量使用前必须赋值.
	FileOutputStream fos = null;	
try{
	fis = new FileInputStream("qqq.txt");	//检测可能找不到文件输入流-----异常.
	fos = new FileOutputStream("zzz.txt");	//检测可能无法创建文件输出流----异常.
	int len;								//定义整数.
	while((len = fis.read()) != -1){		//整数等于读出文件字节长度.只要不等于-1就执行语句体.
		fos.write(len);						//写入每次读到的字节.
	}
	
}finally{								//表示必须执行的语句
	try{
	if(fis != null)				//检测表示只要输入流不是空,证明有文件存在,证明输入流开启了.
		fis.close();		//关闭输入流.在finally中嵌套try finally是不是两个流,能关一个就关一个.节省资源,提高效率.
	}finally{
		if(fos != null){
			fos.close();
		}
	}
}
}

}
