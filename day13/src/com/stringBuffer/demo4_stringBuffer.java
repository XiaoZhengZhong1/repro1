package com.stringBuffer;

public class demo4_stringBuffer {

	public static void main(String[] args) {
		/*###13.07_��������(StringBuffer��String���໥ת��)
		* A:String -- StringBuffer
			* a:ͨ�����췽��
			* b:ͨ��append()����
		* B:StringBuffer -- String
			* a:ͨ�����췽��
			* b:ͨ��toString()����
			* c:ͨ��subString(0,length);*/
//��stringת����StringBuffer
		/*StringBuffer f = new StringBuffer("helloword");
			System.out.println(f);//ͨ�����췽��,���������ַ���String
				
			StringBuffer j = new StringBuffer();
				j.append("helloword");
					System.out.println(j);//ͨ����ӷ���,���������ַ���String
				*/
//��StringBufferת����string
		StringBuffer f = new StringBuffer("helloword");
			String h = new String(f);//��StringBuffer f ��ֵ��string h
				System.out.println(h);
	
			f.subSequence(0, f.length());//��ȡ��0������ʼ,�����һ�����������һ��.��Ϊ���һ����length-1,Ҫ����ȡ.
				System.out.println(f);
	}

}
