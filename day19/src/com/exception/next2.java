package com.exception;

import java.io.File;

/*###19.19_File��(���ָ��Ŀ¼��ָ����׺���ļ���)
* A:������ʾ
	* �����ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
*/
public class next2 {
	public static void main(String[] args){
		File f = new File("F:\\");	//��װE��.ע��Ҫת��\\
		File[] f2 = f.listFiles();	//��ʾ��ȡf,(E����)����Ŀ¼�ļ�,�ļ���.�ŵ�����f2����.
		
		for (File fi : f2) {
			if(fi.isFile() && fi.getName().endsWith(".jpg")){//��˼��,���fi��һ���ļ�,����fi����������.jpg��β��.
				System.out.println(fi);	//ע���ļ����ļ��е�����.��Ϊû����.jpg�������ļ�,���Ϊ��.
			}
		}
		
	}
}
