package com.other_io;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.person.person;
public class ObjectOutputStream223 {
	
/*###22.05_IO流(对象操作流ObjectOutputStream)(了解)注意要存档后读档.
* 1.什么是对象操作流
	* 该流可以将一个对象写出, 或者读取一个对象到程序中.也就是执行了序列化和反序列化的操作.
	* 将一个对象写出,.也就是执行了序列化new ObjectOutputStream(new FileOutputStream("e.txt"))
	* 无论是字节输出流,还是字符输出流都不能直接写出对象,要读取对象,反序列化ObjectInputStream(new FileInputStream("e.txt"))
	*/
	public static void main(String[] args) throws IOException, Exception{
		demo();
	
	}

	public static void demo() throws IOException, FileNotFoundException {
		person a = new person("肖磊",2);
		person a2 = new person("李霞",24);
		person a3 = new person("肖海",31);
		ArrayList<person> b = new ArrayList<>();
			b.add(a);
			b.add(a2);
			b.add(a3);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
			oos.writeObject(b);		//把集合当作对象写入输出流序列化路径e.txt中
			oos.close();
	}
}
