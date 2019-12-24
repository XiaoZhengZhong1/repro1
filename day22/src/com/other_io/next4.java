package com.other_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class next4 {
/*###22.13_IO流(数据输入输出流)(了解)
* 1.什么是数据输入输出流
	* DataInputStream, DataOutputStream可以按照基本数据类型大小读写数据----意思就是数字写入多少,就可以读取多少.比喻下面写入的
	* 是997,998,999,已经超过了byte的取值范围.-127-128之间.(虽然文件中计算机写的是乱码)但是用readInt()读出来的结果打印出来还是
	* 997,998,999.
	* 例如按Long大小写出一个数字, 写出时该数据占8字节. 读取的时候也可以按照Long类型读取, 一次读取8个字节.
* 

* 2.使用方式*/
	public static void main(String[] args) throws IOException {
		demo();
	}

public static void demo() throws FileNotFoundException, IOException {
	// DataOutputStream(OutputStream), writeInt(), writeLong() 
	DataOutputStream dos = new DataOutputStream(new FileOutputStream("b.txt"));
	dos.writeInt(997);
	dos.writeInt(998);
	dos.writeInt(999);
	
	dos.close();
	//DataInputStream(InputStream), readInt(), readLong()

	DataInputStream dis = new DataInputStream(new FileInputStream("b.txt"));
	int x = dis.readInt();
	int y = dis.readInt();
	int z = dis.readInt();
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	dis.close();
}

}
