package important_calendar;

import java.util.Calendar;

public class calender_get {
/*###14.19_��������(Calendar��ĸ����ͻ�ȡ���ڵķ���)(����)
* A:Calendar��ĸ���
	* Calendar ����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �������ֶ�֮���ת���ṩ��һЩ������
	* ��Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
* B:��Ա����
	* public static Calendar getInstance()
	* public int get(int field)
*/
//:Calendar��ĸ���,��һ��������.�����date���еĺܶ��ʱ�ķ���.	
	public static void main(String[] args) {
//��ΪCalender�ǳ�����,�޷���ʵ����,���в���new����,�������������������,����Ĭ��ʱ������,Ĭ�ϵ�ǰʱ��	
		Calendar c = Calendar.getInstance();//��ȡĬ�ϵĵ�ǰʱ��,���������������,��,��,ʱ,��,��,����...����ʽ��ʾ����ϣ����
		//System.out.println(c);
//java.util.GregorianCalendar[time=1564794541823,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=7,WEEK_OF_YEAR=31,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=215,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=9,SECOND=1,MILLISECOND=823,ZONE_OFFSET=28800000,DST_OFFSET=0]	
//���д�����Calender���е�getInstance������ȡ��Ĭ�ϵ�ǰʱ��,������Ҫ����ת��������ϰ�ߵ���,��,��,ʱ,��,����.��ʽ.	
/* public int get(int field)��ȡ����,ͨ��API��Calender�����ֶλ�ȡ.����ͨ��YEAR�ֶλ�ȡ��,ͨ��MONTH��ȡ��......
��Ϊ������.....�ֶ���Calender�����Ǿ�̬����,���������������*/
//		System.out.println(c.get(Calendar.YEAR));	//* ��Calender���еĵ�get(int field)������ȡ��,
//		System.out.println(c.get(Calendar.MONTH)+1);	//��ȡ��,��Ϊϵͳ�Ǵ�0�¿�ʼ�����,������ʵ�е��¾�Ҫ��һ����
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));	//��ȡ���е���,
//		System.out.println(getWeek(c.get(Calendar.DAY_OF_WEEK)));	//*��ȡһ������,��ǰ����,����ϵͳ1��������������,2��������һ
//����ϵͳ1��������������,2��������һ,����������Ҫ��һ�������,���淶������.ע��,���������ú�,c.get(Calendar.DAY_OF_WEEK)
//������ȡ��ǰ���ڵĴ���,���ǲ���,���õ������н��й淶*/	
	
//�������п��Է���һ������������	
	System.out.println(c.get(Calendar.YEAR) + "��" + getNum(c.get(Calendar.MONTH)+1) + "��" + 
	getNum(c.get(Calendar.DAY_OF_MONTH))	+ "��" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}	//������:2019��08��03��������
	//��һ�������,����ϵͳ1��������������,2��������һ
	//1:����ֵ���ͷ������ڼ�,��һ���ַ���.String��.2:������getWeek.3:����int week.4:return String week.
	
	public static String getWeek(int week){
		String[] c1 = { "","������","����һ","���ڶ�","������","������","������","������",};
			return c1[week];
	}
	//�����ڳ��ȸ�ʽ�淶��һ�µ�,��2019��08��03��������
	//1:����ֵ����,String,2:������getNum.3:����,int num,4:return String num
	public static String getNum(int num){
		return  num > 9 ? "" + num : "0" + num;	//��ʾ�������ʱ�����9�Ͳ���Ҫ�Ķ�,�Ӹ��մ�.���������9,�ͼӸ�0
				
	}

/*���潲������������֪ʶ��.
1:Calendar c = Calendar.getInstance();��Calendar���.
2;c.get((Calendar.MONTH)+1)����Calendar���е�get()����,����.�ֶ�,��ȡ��������.ע������Ҫ��+1�Ľ������������������Ҫ�Ľ��.
3:String getWeek(int week)�ò����,�淶����.�ó�������Ҫ����������
4:String getNum(int num).�ø�λ����λ��,���ַ���.�����Ԫ����ó�������Ҫ�����ڳ���һ���ĸ�ʽ
*/
}
