package com.System1;

import java.math.BigInteger;

public class bigInteger {

	public static void main(String[] args) {
/*###14.14_��������(BigInteger��ĸ����ͷ���ʹ��)
* A:BigInteger�ĸ���
	* �����ó���Integer��Χ�ڵ����ݽ�������
* B:���췽��
	* public BigInteger(String val)
* C:��Ա����
	* public BigInteger add(BigInteger val)		��+
	* public BigInteger subtract(BigInteger val) ��-
	* public BigInteger multiply(BigInteger val)	��*
	* public BigInteger divide(BigInteger val) ��/
	* public BigInteger[] divideAndRemainder(BigInteger val)ȡ����������.
*/
	//BigInteger�ĸ������Դ��������͵�����,���������.�����ַ��������׼ȷ.
	BigInteger a = new BigInteger("100");
	BigInteger a1 = new BigInteger("100");
	System.out.println(a.add(a1));//200
	
	
	}

}
