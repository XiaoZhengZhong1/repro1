package com.exception;

import java.io.File;

public class get199 {
	/*###19.18_File��(File��Ļ�ȡ����)
	* A:��ȡ����
		* public String getAbsolutePath()����ȡ����·��
		* public String getPath():��ȡ·��---��ȡ���췽���д����·��,���췽��������ǵ�ǰ·��,��ȡ�ľ��ǵ�ǰ·��.
		* public String getName():��ȡ����
		* public long length():��ȡ���ȡ��ֽ���
		* public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
		* public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������-----����ȡ����.
		* public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� -----��ȡ����.*/
	public static void main(String[] args) {
		File f = new File("e.txt");	//��ʾ��װ�����ļ�.
		System.out.println(f.getAbsolutePath());  //��ʾҪ��ȡ�ļ�����·��,���:E:\workspacexiaohei\day19\e.txt
	}

}
