package com.exception;

import java.io.File;

public class renameTo_198_delete {
	/*###19.16_File��(File�����������ɾ������)
	* A:��������ɾ������
		* public boolean renameTo(File dest):���ļ�������Ϊָ�����ļ�·��
		* public boolean delete():ɾ���ļ������ļ���
	* B:������ע������
		* ���·������ͬ�����Ǹ�����
		* ���·������ͬ�����Ǹ��������С�
	* C:ɾ��ע�����
		* Java�е�ɾ�����߻���վ��
		* Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ���
//renameto();---���·������ͬ�����Ǹ��������·������ͬ�����Ǹ��������С�
*/
//����,rename()
	public static void main(String[] args) {
		File f = new File("ccc.txt");
		File f2 = new File("e.txt");
		System.out.println(f.renameTo(f2));	//��ʾ��f���ļ����ĳ�f2d,Ҳ���Ըĵ�����̷�����. 

//ɾ���ļ�,delete();
		File f3 = new File("xxx.txt");
		System.out.println(f3.delete());  //��ʾɾf3�е�����.���Ҫɾ���ļ���,�ļ��б����ǿյ�,ɾ�����߻���վ.
	}

}
/*###19.17_File��(File����жϹ���)
* A:�жϹ���
	* public boolean isDirectory():�ж��Ƿ���Ŀ¼,�ļ���.
	* public boolean isFile():�ж��Ƿ����ļ�
	* public boolean exists():�ж��Ƿ����
	* public boolean canRead():�ж��Ƿ�ɶ�----windowϵͳ��Ϊ�����ļ����ǿɶ���,
	* public boolean canWrite():�ж��Ƿ��д---windowϵͳ������Լ�setWrite���óɿ�д���߲���д,���ǿ�д���߲���д.
	* public boolean isHidden():�ж��Ƿ�����
	* 
	* 
	* */