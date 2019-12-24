package com.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class InputStreamReader216 {

/*###21.12_IO��(ʹ��ָ��������д�ַ�) 
* FileReader��ʹ��Ĭ������ȡ�ļ�, �����Ҫʹ��ָ������ȡ, ��ô����ʹ��InputStreamReader(�ֽ���,�����)
* FileWriter��ʹ��Ĭ�����д���ļ�, �����Ҫʹ��ָ�����д��, ��ô����ʹ��OutputStreamWriter(�ֽ���,�����)
* */
	public static void main(String[] args) throws IOException {
		demo();
	}
/*�򵥽��;���br����������,��InputStreamReader���ֽ�ת�����ַ�������,��ָ������.GBK��UTF-8
	bw��������OutputStreamWriter���ַ�д���ֽڵ�����.��ָ������GBK��UTF-8,ע��д���д�������Ҫһ��,����GBK�ȽϺ�.*/

public static void demo() throws UnsupportedEncodingException,
		FileNotFoundException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("hhh.txt"),"GBK"));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("hhh3.txt"),"GBK"));
		int i;
		while((i = br.read()) != -1){
			bw.write(i);
		}
br.close();
bw.close();
}
}
