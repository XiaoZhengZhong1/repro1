package important_calendar;


import java.util.Calendar;
import java.util.Scanner;

public class text1 {
/*###14.21_��������(��λ�ȡ���������ƽ�껹������)(����)
* A:������ʾ
	* ���󣺼���¼������һ����ݣ��жϸ��������껹��ƽ��*/
	public static void main(String[] args) {
/*��Ŀ����:
 * 1:����¼�����.��Scanner��.
 * 2:��Ҫ������Calendar c = Calendar.getInstance();
 * 3:��ΪҪ��2����28�컹��29��,�ж�ƽ�������.��Ҫ һ����ȡ��ķ���.���ؽ�����ж��Ƿ���28��29��,����һ��booleanֵ 
 * 4:��������set��������ʱ��Ϊ3��1��,�ټ�һ��,���ܵó�2�¶�������
 * 5:����һ���ж����,�ж�2���Ƿ�Ϊ28���29��
 * */	
	Scanner sc = new Scanner(System.in);
		System.out.println("�������ӡ�����");
			String a = sc.nextLine(); 
			int year = Integer.parseInt(a);
			boolean b = getYear(year);	//�������淽��,���淽�����ص���Booleanֵ,���л�ȡ����true����false
			System.out.println(b);
			sc.close();   //��������¼��.
	}
	
public static boolean getYear(int year) {
	Calendar c = Calendar.getInstance();	//��ȡ������ʽ������
		c.set(year, 2, 1);					//����Calendar������÷���,����������,���Ǽ���¼���������.
	c.add(Calendar.DAY_OF_MONTH,-1);		//�޸�c���������е���,������2����ʵ��3��,3��1�ռ�1��,����2����
	System.out.println(c.get(Calendar.DAY_OF_MONTH));//��ӡ�����޸ĺ����,����¼��2019,�����ӡ�����28
	return c.get(Calendar.DAY_OF_MONTH) == 29;	//�ж��޸ĺ��2�������Ƿ����29,���ھͷ���true����������,����֮.
	 
	}
	
}
