package com.other_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class sequence221 {
/*�˽����˽�����.
 * ##22.01_IO��(������)(�˽�)
* 1.ʲô��������
	* ���������԰Ѷ���ֽ����������ϳ�һ��, ���������ж�ȡ����ʱ, ���ӱ����ϵĵ�һ������ʼ��, ����һ��֮��������ڶ���, �Դ�����.
	###22.02_IO��(���������϶��)(�˽�)
	* ���϶��: SequenceInputStream(Enumeration)��Ҳ��InputStream������.���������յ���ö������.֮ǰѧ��collection
	* ���м���,list������vector����elements()����,���ص���ö������.
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
