package important_Date;

import java.util.Date;

public class daty1 {

	public static void main(String[] args) {
/*##14.16_��������(Date��ĸ����ͷ���ʹ��)(����)
* A:Date��ĸ���
	* �� Date ��ʾ�ض���˲�䣬��ȷ�����롣 
* B:���췽��
	* public Date()
	* public Date(long date)
* C:��Ա����
	* public long getTime()
	* public void setTime(long time)*/
	Date a = new Date();		//Date�Ŀղι��췽��,ע�⵼��Date��util.Date;���µ�-----û�в����������,��ǰʱ��.
	System.out.println(a);
	
	Date a1 = new Date(0);//Date���вι��췽��,������0,���Ե���ʱ��Ϊ����,��������1970 01 01 08:00:00--��ʾc���Ե�������.
	a1.setTime(1000);	//��ʾ���ú���ֵ,�ı�ʱ�����,��������ʾ,�������0����ʱ���ȥ��һ��Thu Jan 01 08:00:01 CST 1970
	System.out.println(a1);

	System.out.println(a.getTime());//ͨ��ʱ�䷽��,��ȡ��ǰ����ֵ.

	System.out.println(System.currentTimeMillis());//ͨ��ϵͳ�෽��,��ȡ��ǰ����ֵ.

	
	
	
	
	
	}

}
