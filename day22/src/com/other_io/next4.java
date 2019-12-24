package com.other_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class next4 {
/*###22.13_IO��(�������������)(�˽�)
* 1.ʲô���������������
	* DataInputStream, DataOutputStream���԰��ջ����������ʹ�С��д����----��˼��������д�����,�Ϳ��Զ�ȡ����.��������д���
	* ��997,998,999,�Ѿ�������byte��ȡֵ��Χ.-127-128֮��.(��Ȼ�ļ��м����д��������)������readInt()�������Ľ����ӡ��������
	* 997,998,999.
	* ���簴Long��Сд��һ������, д��ʱ������ռ8�ֽ�. ��ȡ��ʱ��Ҳ���԰���Long���Ͷ�ȡ, һ�ζ�ȡ8���ֽ�.
* 

* 2.ʹ�÷�ʽ*/
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
