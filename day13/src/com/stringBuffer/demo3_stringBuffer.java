package com.stringBuffer;

public class demo3_stringBuffer {

	public static void main(String[] args) {
/*
###13.04_��������(StringBuffer��ɾ������)
* A:StringBuffer��ɾ������
	* public StringBuffer deleteCharAt(int index):
		* ɾ��ָ��λ�õ��ַ��������ر���
	* public StringBuffer delete(int start,int end):
		* ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
*/
		/*StringBuffer d = new StringBuffer("helloword");
			d.deleteCharAt(1);//ɾ��ָ������1��Ӧ���ַ�.
				System.out.println(d);//hlloword
			d.delete(1,4);//ɾ��������ͷ1������ʼ,����������β4�����������ַ���.
				System.out.println(d);//hword
*/		
		
		
		
		/*###13.05_��������(StringBuffer���滻�ͷ�ת����)
		* A:StringBuffer���滻����
			* public StringBuffer replace(int start,int end,String str):
				* ��start��ʼ��end��str�滻
		* B:StringBuffer�ķ�ת����
			* public StringBuffer reverse():
				* �ַ�����ת*/
	//StringBuffer���滻����    replace(int start,int end,String str):
	/*StringBuffer c = new StringBuffer("helloword");
		c.replace(0, 4, "aaa");//�滻��0������ʼ,��4�����������ַ���,��aaa�滻.
			System.out.println(c);//aaaoword
		c.reverse();//��ת�ַ���
			System.out.println(c);//drowoaaa
*/	
				
	
	
		/*###13.06_��������(StringBuffer�Ľ�ȡ���ܼ�ע������)
		* A:StringBuffer�Ľ�ȡ����
			* public String substring(int start):
				* ��ָ��λ�ý�ȡ��ĩβ
			* public String substring(int start,int end):
				* ��ȡ��ָ��λ�ÿ�ʼ������λ�ã�������ʼλ�ã�����������λ��
		* B:ע������
			* ע��:����ֵ���Ͳ�����StringBuffer����*/
	// ��ָ��λ�ý�ȡ��ĩβ
	StringBuffer e = new StringBuffer("hellowString");
		String e1 = e.substring(4);//��ȡ��4������ʼ����4,Ĭ�ϵ���β���ַ�.��Ϊ��ȡ�ַ���,���з���ֵ��String����.
			System.out.println(e1);//owString
		String e2 = e.substring(0, 5);//��ȡ��0������ʼ����0,��5��������,������5���ַ���.
			System.out.println(e2);//hello
		System.out.println(e);//hellowString  ��ȡ������StringBuffer e��ֵ��û�ı�.
	}

}
