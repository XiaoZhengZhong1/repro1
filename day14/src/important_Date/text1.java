package important_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class text1 {
/*###14.18_��������(�����������������참��)(����)
* A:������ʾ
	* ������һ��������������������?*/
	public static void main(String[] args) throws ParseException {
/*��Ŀ����:��������������,1:Ҫ������ʱ��,��ǰʱ��ͳ���ʱ��.���ַ�����ʽ��.2:�������ڸ�ʽ,��Ϊ����Ҫ���Լ�����ĳ����͵�ǰʱ��,ת��
�ɼ�����ܶ��������ڶ���.3:���ַ���ʱ��ת�������ڶ���.4:�õ�ǰ�����ڶ����Ժ������ʽ��ȥ�����ĺ�����ʽ�����ڶ���,��Ϊ�����ʽ	���������	
���м���,5:�õõ��ĺ�������1000�������60�����60�ֳ���24Сʱ,�͵ó�����
	*/
	String birthday = "1988/02/07";
	String today = "2019/08/02";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date c = sdf.parse(birthday);
		Date c1 = sdf.parse(today);
		long c3 = c1.getTime() - c.getTime();
		System.out.println(c3/1000/60/60/24/365);
	}

}
