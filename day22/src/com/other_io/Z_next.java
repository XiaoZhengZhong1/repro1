package com.other_io;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Z_next {
/*###22.04_IO流(内存输出流之黑马面试题)(掌握)
* 定义一个文件输入流,调用read(byte[] b)方法,将a.txt文件中的内容打印出来(byte数组大小限制为5)
* 1:要有read()方法就要创建文件输入流new FileInputStream("a.txt");
* 2:要读到byte[] b字节数组中.就要定义数组.
* 3:要打印出来,就要把数组的元素写出,并转成字符串输出.
* 
* */
	public static void main(String[] args) throws IOException {
		demo();
	}

	public static void demo() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] b = new byte[5];
			int i;
			while((i = fis.read(b)) != -1 ){	//注意因为数组长度是5,每次读取5个字节,当读取一次会覆盖上一次读到的值,以次类推.
				baos.write(b, 0, i);;	//所有写出的时候一样要写出,每次循环的读取长度
			}
			fis.close();
			System.out.println(baos);
	}

}
