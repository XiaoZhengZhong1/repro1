package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;		//��ʾ�ļ����ܳ��ֲ����ڵ��쳣,���л���ֻ�ɫ!��,ע�͵���Ӱ������.
import java.io.FileOutputStream;
import java.io.IOException;



public class test03 {
	/*###23.03_File��ݹ���ϰ(����)
	* ����:3,�Ӽ��̽��������ļ���·��,������һ���ļ�����(��������)��������һ���ļ�����
	* 1:���������ļ�·��,���Ե�������test01�е�getDir()����.��ȡ�����ļ���·��.
	* 2:дһ������copy(...);���췽��.�Զ�����get()����.
	* 3:�ڻ�ȡ����������new File(����Ŀ�ĵ�,������Դ.getName);�õ�������Ķ���.�������mkdir();���������õ�������һ�� ���ļ���
	* 4:�ÿ�����Ķ������,listFile()����,����	File[],��������������Ԫ��.
	* 5;��������,�ڱ��������ж�,if{���ļ�,�����ֽڶ�д��(6�б�׼����)����,����},else{���ļ���,�͵ݹ�}
	* 6:����������,�ѿ���������equals�ж�.if(·����ͬ){�����ظ��ļ���,}����ʾ.else{���ÿ�������}��Ϊ���������¼��ļ��еĴ���,
	* ����ļ���·��������ͬ,�������ļ���,��ѭ�����ݹ�,�ֵ�������,�����Ǹ��ļ����ִ���һ��,�ֵ�ѭ�����ݹ�......������ѭ����,�Զ�����
	* �ڴ����,����Ϊֹ.
	* */
	public static void main(String[] args) throws IOException {
		File fi = test01.getDir();
		File fi2 = test01.getDir();
			if(fi2.equals(fi)){
				System.out.println("���ļ��Ѵ���,����������Ǵ���������ļ�.");
			}else{
				copy(fi,fi2);	//ע�⿽���ǲ���˳��,(��������,����Ŀ�ĵ�)

			}
				}

	public static void copy(File fi, File fi2) throws IOException {
		File newfi4 = new File(fi2,fi.getName());	/*������Ϊ����˫����""("fi2,fi"."getName()")�����˷�һ��Сʱ
		ʱ��,API��public File(String parent, String child)��� parent Ϊ null���򴴽�һ���µ� File ʵ��,�յ�һ���Ǹ���
 ��� child Ϊ null���׳�NullPointerException,�ļ�·���������String����.�����"",�Ҷ�����fi2��null,������parent(����),
 fi���ļ����ļ���������,����Ҫ����fi���ļ������ƴ����µ��ļ���,����ҪgetName();
*/
			newfi4.mkdir(); //��ʾ�������ȡ�����ļ���·������,д��newfi4��.
		File[] fi5 = fi.listFiles();	//ע��һ��Ҫ�����������ļ��к��ļ����ݵ��ļ����������
			for (File fie : fi5) {
			if(fie.isFile()){
				BufferedInputStream bis = 
						new BufferedInputStream(new FileInputStream(fie));	//��ʾ���ļ����ñ�׼�ֽ����������ļ�.
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(new File(newfi4,fie.getName())));
				/*��ʾ�ñ�׼�ֽ����������ļ�,��ת�������������ظ���37�д���,��37�����ڸ���fi2�и�������fi���ļ������´�����
				 * �ļ��ж���newfi4,��������,��37���е�����fi���ص�����fi5������ı���fie��������.��������fie���ļ�������
				 * ����newfi4�д����µ��ļ�����.���������Ҫ�Ľ��,�����������bos����fi2������newfi4������*/	
				int i;
					while((i = bis.read()) != -1){	//��ʾ�ڻ�������fi���ص�����fi5������Ԫ���ֽڸ���,
						bos.write(i);	//�Ѷ�����Ԫ���ֽ�д��fi2������newfi4������bos��.
						
					}
				
				
					bis.close();	//���������Ϲص�.
					bos.close();
						}else{		//�����ļ�,�Ǿ����ļ���.
						copy(fie,newfi4);	//�ݹ�,��������ķ���.
					}
				}
	
	
	}

}
