package important_calendar;

import java.util.Calendar;

public class calendar_add_set {
/*###14.20_��������(Calendar���add()��set()����)(����)
* A:��Ա����
	* public void add(int field,int amount)//field�ֶε���˼,����.����,amount��������˼,��ʾ��Ӷ��ٻ��߼�������
	* public final void set(int year,int month,int date)
* B:������ʾ
	* Calendar��ĳ�Ա����ʹ��*/
public static void main(String[] args) {
	Calendar a = Calendar.getInstance();//�������÷���,������.��Ϊ�ǳ�����,����ʵ����,Ҳ�൱���Ǹ�������ָ���������.
	
	a.add(Calendar.YEAR, 1);//Calendar���add()��Ա����,��ȡ�ֶ����ݻ���Ҫ����.���õ�1�����1��,-1�����1��.��,���ֶ�һ��
	System.out.println(a.get(Calendar.YEAR));//ע��Ҫ��ȡ,�������a,���a���������ϵͳĬ�ϵ�������ʽ,��ΪCalendar�ǳ����
	
	a.set(Calendar.YEAR, 2088);//Calendar���set()����,��ʾ��ȡ�ֶ�,������������......
	System.out.println(a.get(Calendar.YEAR));
	
	a.set(1988, 2, 17);//����������.ע�����ʱҪget()��ȡ.
	System.out.println(a.get(Calendar.YEAR) + "��"+ a.get(Calendar.MONTH) + "��" + a.get(Calendar.DAY_OF_MONTH));
	}

}
