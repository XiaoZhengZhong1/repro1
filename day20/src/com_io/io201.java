  package com_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class io201 {
	/*###20.01_IO��(IO�������������)
	* 1.����
		* IO�����������豸֮������ݴ���
		* Java�����ݵĲ�����ͨ�����ķ�ʽ
		* Java���ڲ��������඼��IO����
		* ���������Ϊ���֣����������������
		* �����������ͷ�Ϊ���֣�
			* �ֽ��� : �ֽ������Բ����κ�����,��Ϊ�ڼ�������κ����ݶ������ֽڵ���ʽ�洢��
			* �ַ��� : �ַ���ֻ�ܲ������ַ����ݣ��ȽϷ��㡣
	* 2.IO�����ø���
		* �ֽ����ĳ����ࣺ
			* InputStream 
			* OutputStream
		* �ַ����ĳ����ࣺ
			* Reader 
			* Writer		
	* 3.IO������д
		* ʹ��ǰ������IO���е���
		* ʹ��ʱ������IO�쳣����
		* ʹ�ú��ͷ���Դ
		* 
		* 
###20.02_IO��(FileInputStream)
* read()һ�ζ�ȡһ����  
		* */

	public static void main(String[] args) throws IOException  {
		demo1();
//���淽���Ѿ���Alt + shift + m��ȡ������,Ϊ	demo1();
	
//������whilѭ��,���Ż�����ķ���.��Ϊ�����-1��֤����ȡ����,-1�Ϳ�����Ϊ������.	
//����ѭ���Ż���ʽ�����Ժ󾭳��õ��ĸ�ʽ.
	FileInputStream fis2 = new FileInputStream("qqq.txt");
	int a;							//����a,��Ϊ��ȡ��ֵ����.
	while((a = fis2.read()) != -1){	//ע��˴�����,���԰�������ȡ��ֵ�Ľ��,����һ������,����Ƚ�.��ʾ���������-1�����
			System.out.println(a);	//97 98 99
				}
				fis2.close();	//�����ͷ���Դ.
	
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("qqq.txt");	/*��������������,�������������.Ҳ�д���.����������
		 qqq.txt����	abc															�쳣,��ʾ�������ܲ����ڵ��쳣,Ctrl+1�׳�*/
			int x = fis.read();		/*��Ӳ���϶�ȡfis�ļ��е�һ���ֽ�����.read()��ȡ�ֽ�����.read()�����б���,��ʾ����
			���ݻ��޷���ȡ,Ctil + 1�׳��쳣�Ϳ���. */
			
			System.out.println(x);		//97       �����ȡ���ֽ�.
			int x2 = fis.read();		
			System.out.println(x2);		//98		
			int x3 = fis.read();		
			System.out.println(x3);		//99	֤����һ��ֻ�ܶ�ȡһ���ֽ�,��Ӧ�������ֵ,
			int x4 = fis.read();		
			System.out.println(x4);		//-1
			int x5 = fis.read();		
			System.out.println(x5);		//-1	֤��-1�ǽ���,��Ϊֻ�������ַ�.
			
			
			fis.close();			//�����ͷ���Դ.
	}
	/*###20.03_IO��(read()��������ֵΪʲô��int)
	* read()������ȡ����һ���ֽ�,Ϊʲô������int,������byte
	* 
��Ϊ�ֽ����������Բ����������͵��ļ�,����ͼƬ��Ƶ��,��Щ�ļ��ײ㶼���Զ�������ʽ�Ĵ洢��,���ÿ�ζ�ȡ������byte,�п����ڶ����м��ʱ������111111111
��ô��11111111��byte���͵�-1,���ǵĳ���������-1�ͻ�ֹͣ������,��������ݾͶ�������,�����ڶ�ȡ��ʱ����int���ͽ���,���11111111������ǰ�油��
24��0����4���ֽ�,��ôbyte���͵�-1�ͱ��int���͵�255���������Ա�֤�������ݶ���,��������ǵ�-1����int����*/		
}
