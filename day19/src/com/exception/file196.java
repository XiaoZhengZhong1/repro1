package com.exception;

import java.io.File;

public class file196 {
	/*###19.14_File��(File��ĸ����͹��췽��)
	* A:File��ĸ���------�ļ�����˼.����һ����,���ǿ����ҵ��ļ���·��.ͨ��new����,�ڲ����д���Ҫ�ҵ��ļ���.
		* File��Ӧ�ý���һ��·��
			* �ļ�·�������ļ���·��  
			* ·����Ϊ����·�������·��
			* ����·����һ���̶���·��,���̷���ʼ
			* ���·�������ĳ��λ��,��eclipse����ָ��ǰ��Ŀ��,��dos��
		* �鿴APIָ���ǵ�ǰ·��
		* �ļ���Ŀ¼·�����ĳ����ʾ��ʽ
	* B:���췽��
		* File(String pathname)������һ��·���õ�File����
		* File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
		* File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
	* C:������ʾ*/
	public static void main(String[] args) {
//����·��.
		File f = new File("F:\\xiaohai");		//��ʾ�¼�һ��·������,�������ʾҪ�ҵ��ļ�,F:�������·��,\\ת�����˼
			System.out.println(f.exists());	//f.exists(),��ʾ�ж��ļ��Ƿ����.��������:true,��ʾ�ļ�����.

//��ǰ·��.
		File f2 = new File("xxx.txt");	//ֱ�������ļ�����,��ʾ�ǵ�ǰ·��.����day19��Ŀ,����Ϊ����ʾ�¼����ļ�
		System.out.println(f2.exists());	//������true.

//����Ŀ¼�������ļ�
		String parent = "F:\\xiaohai";		//��ʾ����Ŀ¼.
		String child = "10_package��";		//��ʾ�����ļ���.
		File f3 = new File(parent,child);
			System.out.println(f3.exists());	//���.true

//���԰Ѹ����װ��file����,ʹ��file�Ĺ���.
		File parent2 = new File( "F:\\xiaohai"); 
		String child2 = "10_package��";	
		File f4 = new File(parent2,child2);
		System.out.println(f4.exists());
		System.out.println(parent2.exists()); //��ʹ��File�Ĺ���.
	}

}
