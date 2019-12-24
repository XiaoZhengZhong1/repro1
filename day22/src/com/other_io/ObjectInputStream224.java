package com.other_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.person.person;	
					//注意要存档后读档.
							//了解内容
/*注意自定义类中必须实现Serializable接口.才能启用序列功能,此接口相当于是开启.还有必须是ObjectOutputStream先写出运行后,才能读出*/
public class ObjectInputStream224 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
	demo();
	}

	public static void demo() throws IOException, FileNotFoundException,
			ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
			System.out.println(ois);
		@SuppressWarnings("unchecked")
		
		ArrayList<person> aL = (ArrayList<person>)ois.readObject();  /*表示读取输入流反序列化,因为上面写入的是
		集合,所以读的也是集合,所以要强转成集合.*/
			for (person p : aL) {
				System.out.println(p);
			}
			ois.close();
	}
}
