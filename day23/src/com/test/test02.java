package com.test;

import java.io.File;

public class test02 {
	/*###23.02_File��ݹ���ϰ(ɾ�����ļ���)
	* ����:2,�Ӽ��̽���һ���ļ���·��,ɾ�����ļ���
	* 1:��һ��,���̽���һ���ļ�·��.��һ��test01����getDir()����.���Ե���.
	* 2:�ڶ���,����һ��ɾ���ļ�����.(��Ϊ�ļ������ļ����޷�ɾ��),ɾ����û�з�����,Ҳ����Ҫ����,�����ǵ�һ����ȡ���ļ��ж���
	* 3:���ļ��ж������listLise(),���ص���һ��File[],��ΪҪ�ж��ļ������Ƿ�����ļ�,���ļ���.�ļ�ɾ��,
	* 4:ѭ��������,��ɾ���ļ���
	* */
	public static void main(String[] args) {
		File d = test01.getDir();	//test01.getDir()��ʾ����test01���е�getDir()����.
		getDeleteFile(d);           //����ɾ������.
	}
	public static void getDeleteFile(File d){
		File[] f = d.listFiles();
			for (File fie : f) {
				if(fie.isFile()){	//��ʾ������ļ�.
					fie.delete();	//��ɾ���ļ�.
				}else{					
					getDeleteFile(fie);	//������ļ��о͵ݹ�,��������ķ���.ɾ���ļ�.
				}
			}
			d.delete();
	
	}
	
}
