package com.other_io;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Z_next {
/*###22.04_IO��(�ڴ������֮����������)(����)
* ����һ���ļ�������,����read(byte[] b)����,��a.txt�ļ��е����ݴ�ӡ����(byte�����С����Ϊ5)
* 1:Ҫ��read()������Ҫ�����ļ�������new FileInputStream("a.txt");
* 2:Ҫ����byte[] b�ֽ�������.��Ҫ��������.
* 3:Ҫ��ӡ����,��Ҫ�������Ԫ��д��,��ת���ַ������.
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
			while((i = fis.read(b)) != -1 ){	//ע����Ϊ���鳤����5,ÿ�ζ�ȡ5���ֽ�,����ȡһ�λḲ����һ�ζ�����ֵ,�Դ�����.
				baos.write(b, 0, i);;	//����д����ʱ��һ��Ҫд��,ÿ��ѭ���Ķ�ȡ����
			}
			fis.close();
			System.out.println(baos);
	}

}
