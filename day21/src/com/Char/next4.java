package com.Char;

import java.io.File;
import java.util.Scanner;

public class next4 {
	/*###21.17_File��(��ϰ)
	* ����:�Ӽ����������һ���ļ���·��,��ӡ�����ļ��������е�.java�ļ���
	* 1:дһ�������ļ�·���ķ���.��������¼��Scanner,��ʾ�����ļ�������.
	* 2:while(true)����ѭ��,{�洢¼�����,����һ���ļ���·��new File(¼�����)��¼������װ���ļ���.}
	* 3:��ѭ��������if�ж�,!exists()����ļ������ھ���ʾ. File(���ļ���)����ʾ�����ļ���.�ȴ����ֲ����ļ�,�϶����ļ���,����¼�뱾��
	* ����3�������ǽ����ļ���.��������ӡ�ļ��з���.
	* 4:дһ����ӡ����.��ӡ�ļ��������е�.java�ļ�.ֻ��ӡ���践��ֵ,������printjavaname,��������������յ��ļ���.
	* 5:����һ��File[]����.File������listFlies(�ļ���)����.���ص���һ��file����.
	* 6:��������.
	* 7:�б�������if�ж�,���������Ԫ�����ļ������Һ�׺��.java�����.���Ԫ�����ļ���,�͵ݹ���������д�ӡ����.(���Ǳ����ļ��е���˼)
	* 
	* */
	public static void main(String[] args) {
	     File f = getDir();
		printjava(f);
	}
	
	public static File getDir(){	//Dri��Directory�ļ��е���д.
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ļ���·��");
		while(true){
			String s = sc.nextLine();
			File f = new File(s);
			if(!f.exists()){
				System.out.println("��������ļ�·��������,�����������ļ���·��");
			}else if(f.isFile()){
				System.out.println("����������ļ�·��.�����������ļ���·��");
				}else{
				return f;
				}	
			sc.close();	//ע�����¼��رպ�,ֻ��¼��һ��.
		}
	}
	public static void printjava(File f){
		File[] fi = f.listFiles();	//���ļ���ת�����ļ�����.File�����а��ļ���ת��������ķ���,
			for (File e : fi) {
				if(e.isFile() && e.getName().endsWith(".java")){	//���Ԫ�����ļ�,�����ļ���������.java��β��
					System.out.println(e);
				}else if(e.isDirectory()){	//��ʾ���Ԫ�����ļ���.
				printjava(e);	//�ݹ�����ļ���Ԫ��.
				}
			}
	
	
	
	}
	
	
	}





