package com.test;

import java.io.File;
import java.util.Scanner;

public class test01 {
/*###23.01_File��ݹ���ϰ(ͳ�Ƹ��ļ��д�С)
* ����:,�Ӽ��̽���һ���ļ���·��,ͳ�Ƹ��ļ��д�С
* 1:������������,һ������·���ķ���,һ�������ļ��д�С�ķ���.
* 2:�������·������,���ص����ļ�File,����¼��û�в����б�.�Ӽ��̽��վ�Ҫ����Scanner.����ʾ�����ļ���.
* 3:��Ҫ����һ���ļ���·��.��Ҫ���ϵļ���¼��,��¼������װ���ļ�����.�������ж�.·���Ƿ����.�ǲ����ļ�·��.ֱ����ʽ��ȷreturn�ļ�����
* ���ϵ�¼�����while����ѭ��.��ѭ����¼��.��if�ж�.
* 4:�������·���ɹ�.��Ҫ����һ��ͳ���ļ��д�С�ķ���.(�ļ��д�С�޷�ֱ�����,�������0)���������ļ����������ļ����ֽڸ���.���ص���ͳ��
* ���Long(������),ͳ�ƾ��Ǽ������,���Ⱦ�Ҫ����һ������.������,�������ͳ��.��Ϊ�ļ��ֽ�����ܶ�,�͵���ֵ���ܻ�ܴ�,�Ͷ����Long.
* �����б�����¼����ļ�����.
* 5:�������������.���ļ��������FileList()����,���ļ����󷵻ص�File[]��.
* 6:��������,�ڱ��������ж�,���Ԫ�����ļ�,��=��+�ļ�.length.������ļ���,���õݹ鷽��.
* 
* 
* */
	public static void main(String[] args) {
			File dir = getDir() ;	//��ʾ���û�ȡ·������.�õ�·������dir,����������û�ȡ�ļ��г��ȷ�����,������ֵ.
		System.out.println(getFlieLength(dir));	//��ʾ��ӡ���û�ȡ�ļ��г��ȷ����Ľ��.���������淽����ȡ�Ķ���.
		
	}
	public static File getDir(){
		Scanner sc = new Scanner(System.in);
			System.out.println("�������ļ���·��");		//ע���ļ��о���H:\haoya �̷��еĶ����ļ���.��ʽ�̷���һ��\
			while(true){
				String ine = sc.nextLine();	//ע��¼��һ��Ҫ��ѭ����,���ܶ��¼��.ֱ����ʽ��ȷ.
				File dir = new File(ine);	//��¼������װ���ļ�,�������ж�.
				if(!dir.exists()){			//ע�������ж�·��������,һ��Ҫ�� ! (��),�˴�û��!�����˷Ѱ�Сʱ.
					System.out.println("��������ļ���·��������,�����������ļ���·��.");
				}else if(dir.isFile()){
					System.out.println("����������ļ�·��,�����������ļ���·��.");
				}else{
					return dir;		       //�ļ�·������,�����ļ�·��,��ֻ�����ļ���·����.
				}
				sc.close();	                //ע��رռ���¼��������ʱ��Ҫ�ر�,����ֻ��¼��һ��.���ܶ��¼��.���ж�.
			}
			
	}
	public static long getFlieLength(File dir){
		long len = 0;					//�����Ϊlen.�ļ����ֽ���Ҳ��ܴ�,����Ҫ�����long.
		File[]	fi = dir.listFiles();//��ΪҪ�ж��ļ��ж���dir���Ƿ�����ļ���,��Ҫ���ļ��������.��Ҫ��dir�����ݱ���,Ҫ����
	       for (File file : fi) {
				if(file.isFile()){
					len = len + file.length();
				}else {
					len = len + getFlieLength(file);	//�ݹ鷽���е��ñ�����,�ѷ�����ִ��һ��,�ѽ�����������.
				}
				
	        }
			return len;
	}
}