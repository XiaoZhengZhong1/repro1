package com.Char;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReader214 {
/*###21.10_IO��(LineNumberReader) 
* LineNumberReader��BufferedReader������, ������ͬ�Ĺ���, ���ҿ���ͳ���к�(��û���к�ʱ,д���к�.)
	* ����getLineNumber()�������Ի�ȡ��ǰ�к�(��ѭ��д��ʱ��Ҫͬʱд���к�)
	* ����setLineNumber()�����������õ�ǰ�к�(�������ôӶ����п�ʼ���.)*/
	public static void main(String[] args) throws IOException {
		demo();
	
	
	}

	public static void demo() throws FileNotFoundException, IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("hhh.txt"));
			String s;
			while((s = lnr.readLine()) != null){	//��ΪLineNumberReader��BufferedReader������.���Ե������ж�ȡ
				System.out.println(lnr.getLineNumber() + ":" + s);  //��ʾ��ӡ��ȡͳ�ƺźͶ�����ÿ������.
			}
			lnr.close();
	}

}
