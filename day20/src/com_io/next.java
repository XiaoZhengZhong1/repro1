package com_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class next {
/*###20.16_IO��(ͼƬ����)
* ��ͼƬ����*/
	public static void main(String[] args) throws IOException {
		demo();
	}

public static void demo() throws FileNotFoundException, IOException {
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream("ws.jpg"));
	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("cop3.jpg"));
		int len;
	while((len = bis.read()) != -1){
		bos.write(len ^ 123);//��ʾ��д���ʱ��,�����һ������,��Ϊһ���������������,�͵������������.д�����һ��,��ȡ���һ��
	}
	bis.close();
	bos.close();
}

}
