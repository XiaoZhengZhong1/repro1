package com.test;

import java.math.BigInteger;

public class test06 {
	/*###23.06_�ݹ���ϰ(1000�Ľ׳��������β����ĸ���)
	* ����:���1000�Ľ׳��������β����ĸ���,���õݹ���
	*1:��Ϊ1000�Ľ׳˾���1*2*3*4*5*6.....1000,�����һ������λ��������,ֻ����BigInteger����װ����.Ҫ��1��ʼ,�Ͱ�1��װ��
	*BigInteger����.��дһ��forѭ��.��ѭ������Ҳ�����BigInteger.��ѭ�������׳�����. 
	* 2:�ѽ׳˽��ת�����ַ���.����һ��int����.����������.,�����ַ���,�ж��Ƿ����'0'�ַ�,�����ͼ�����++,���ܻ�ȡ���е�0�ĸ���
	* 3:��ȡβ��0�ĸ���.�ѽ׳˽���ַ�����װ��StringBuilder������.����StringBuilder����.
	* 4:���÷�ת����,���ַ������з�ת.����β����0�͵�ǰ��ȥ��.
	* 5:�����ַ���.��if�ж�.���!=0��break����
	* 
	* */
	public static void main(String[] args) {
		BigInteger bi = new BigInteger("1");	
		for (int i = 1; i <= 1000; i++) {	//ע��˴���С�ڵ���1000.��Ϊ1000����Ҳ��Ҫ��˵�
			BigInteger bi2 = new BigInteger(i + "");	
				bi = bi.multiply(bi2);					
		}
		String str = bi.toString();	
		StringBuilder sb = new StringBuilder(str);	//�ѽ׳��ַ�����װ���ַ�������������.
				str = sb.reverse().toString();	//��ʾ��ʾ����������ת��ת�����ַ���.
				int in2 = 0;					//���������,
				for (int i = 0; i < str.length(); i++) {
				if('0' != str.charAt(i)){		//��ʾ�ַ�����������Ӧ���ַ����������0�ַ�,����������ѭ��,
					break;
				}else{
					in2++;
				}
			}		
				System.out.println(in2);
	
	}
//demo();��ȡ1000�׳����е�0,
	public static void demo() {
		BigInteger bi = new BigInteger("1");	//��ΪBigInteger��������ֻ��װ�ַ���.
		for (int i = 1; i < 1000; i++) {
			BigInteger bi2 = new BigInteger(i + "");	//ֻ��װ�ַ���,��Ҫ�ÿմ�����.
				bi = bi.multiply(bi2);					//������˵ķ���,
		}
			String str = bi.toString();					//�ѽ��ת�����ַ���.
			int in = 0;
			for (int i = 0; i < str.length(); i++) {
				if('0' == str.charAt(i)){					//��ʾ����������е���0�ַ���,�ͼ�1
					in++;
				}
			
			}
			System.out.println(in);
	}

}
