package com.demo.string;

public class demo2_string_konggou {
//public String();	�չ������˼
//public String(byte[] b); ���ֽ�����ת�����ַ���
//public String(byte[] b1,int index,int length);  ���ֽ������һ����ת�����ַ���.int index�Ǵ�0������ʼ����˼.int length��ת�������������˼.
//public String(char[] b2); ���ַ�����ת�����ַ���,���ǰѵ������ַ���,��������.
//public String(char[] b3,int index,int count);	Ҳ�Ǳ�ʾ,���Ǹ�������ʼ,��˳������ת�����ٸ�.
//	
//	
//	
//	
//	
	public static void main(String[] args) {
		
		//String a = new String();
	//       System.out.println(a);	//����հ�,��Ϊ����new�Ķ���Ҳ�ǿչ���
	
	    byte[] b = {97,98,99,100};
			 String c = new String(b);	//���ֽ�����ת�����ַ���
				System.out.println(c);	//�������abcd���Ķ�Ӧֵ,�н���,���ǽ���������ö���,ת���ɰ����Ƕ��ö���
	
		/*byte[] b1 = {97,98,99,100,101,102};
			String c1 = new String(b1,3,2);	//��˼�Ǵӵ�3��������ʼ,ת��2���ַ���
				System.out.println(c1);*/
	/*
		  char[] b2 = {'a','b','c','d'};
			//String c2 = new String(b2);	//�������ַ�ת����һ���ַ�.
				System.out.println(new String(b2));//ֱ�������������,Ҳ����,������¼�����c2һ��
	*/
		//char[] b3 = {'a','b','c','d','e','f'};
		//	String c3 = new String(b3,3,2);	//��ʾ�ӵ�����������ʼ,����ת��2��
				//System.out.println(new String(b3,3,2));//ֱ�������������,Ҳ����,������¼�����c3һ��
	
		  

	
	
	
	
	}

}
