package important_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpliDateFormat {
	/*###14.17_��������(SimpleDateFormat��ʵ�����ں��ַ������໥ת��)(����)
	* A:DateFormat��ĸ���
		* DateFormat ������/ʱ���ʽ������ĳ����࣬�����������޹صķ�ʽ��ʽ�����������ڻ�ʱ�䡣�ǳ����࣬����ʹ��������SimpleDateFormat
	* B:SimpleDateFormat���췽��
		* public SimpleDateFormat()
		* public SimpleDateFormat(String pattern)
	* C:��Ա����
		* public final String format(Date date)
		* public Date parse(String source)*/

	
	public static void main(String[] args) throws ParseException {
//������ʾ�����ڶ���a:Fri Aug 02 16:33:00 CST 2019ת�����ַ���2019��08��02��16ʱ33��07��
		Date a = new Date();	//������ǰʱ�����.
		SimpleDateFormat a1 = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��");	//�������ڸ�ʽ����.���Զ���ʱ���ʽ
			System.out.println(a1.format(a));//���ø�ʽ����,���Զ����ʱ���ʽ����a��ǰʱ��.

//������ʾ��ʱ���ַ���,ת�������ڶ���.			
	String b = "2019��08��02��16ʱ33��07��";
	SimpleDateFormat b1 = new SimpleDateFormat("yyy��MM��dd��HHʱmm��ss��");
		//Date b3 = b1.parse(b);	//��ʾ��ʱ���ַ���ת�������ڶ���.-------b1.parse�������ֲ������쳣,ctrl+1�׳��쳣����
		System.out.println(b1.parse(b));//Fri Aug 02 16:33:07 CST 2019

	}

}
