package com.System1;

import java.math.BigDecimal;

public class BigDecimal_1 {

	public static void main(String[] args) {
/*###14.15_��������(BigDecimal��ĸ����ͷ���ʹ��)
* A:BigDecimal�ĸ���
	* �����������ʱ��float���ͺ�double�����׶�ʧ���ȣ���ʾ������
	* ���ԣ�Ϊ���ܾ�ȷ�ı�ʾ�����㸡������Java�ṩ��BigDecimal

	* ���ɱ�ġ����⾫�ȵ��з���ʮ��������
* B:���췽��
	* public BigDecimal(String val)
* C:��Ա����
	* public BigDecimal add(BigDecimal augend)
	* public BigDecimal subtract(BigDecimal subtrahend)
	* public BigDecimal multiply(BigDecimal multiplicand)
	* public BigDecimal divide(BigDecimal divisor)
* D:������ʾ
	* BigDecimal��Ĺ��췽���ͳ�Ա����ʹ��*/
//BigDecimal��Ĺ��췽���ͳ�Ա����.����С������ʱ�����׼ȷ.ǰ������������ַ�����ʽ���ߵ���BigDecimal.valueOf(2.0);����.
	BigDecimal b = new BigDecimal("2.0");
	BigDecimal b1 = new BigDecimal("1.1");
	System.out.println(b.subtract(b1));//b-b1=0.9
	
	BigDecimal b2 = BigDecimal.valueOf(2.0);
	BigDecimal b3 = BigDecimal.valueOf(1.1);
	System.out.println(b2.subtract(b3));//b2-b3=0.9
	}

}
