package com.Thread2;


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class D03_Z_Timer {
	/*###25.03_���߳�(Timer)---��ʱ�����������еķ��������������Ľ�TimerTask(Ҳ��java util���µĳ�����)(����)
	* Timer��:��ʱ��(��API����ʾ����.������.��java util���µ�)schedule����,�ǹ����ƻ�,�ճ̰���.��ʱ�ķ���.
	*�����õ�������������,���Լ̳е���TimerTask������(����ʵ����Runnable�߳̽ӿ�.��д��run()����)
	* ������schedule(TimerTask task, Date time) ����,   ������ָ����ʱ��ִ��ָ�������񡣲�����ʾ(��ʱ����ʱ����.��ʱʱ�䳤��)
    * ��ΪҪ�õ�����ʱ�䳤��,Ҫ�õ�ʱ����Date(Ҳ��java util���µ�),���õ�ǰ������ʱ����,Date;������ʾ��Ҫ��1900,��Ҫ��1
	* */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {//ע�����Ǽ̳�TimerTast,����ΪTimer����scheduble������ʱ��Ҫ�����������
		Timer t = new Timer();	//��ΪTimerTask������ֻ��һ���ղι��췽��,��һ��Run����,һ��ȡ�������ͷ��ط���.û�ж�ʱ����.
			t.schedule(new naozhong(), new Date(119, 7, 29, 9, 35, 10),3000);/*��ʾ�������������������ʱ��,
			��ʱ���ִ��.��һ������ָ������,�ڶ�������ָ��ʱ��,����������ָ�����3��ʱ��,��ʾ���3����ִ������.(���������Ҫ�ɲ�Ҫ)*/	
			while(true){	//Ϊ�˿������Ե�����Ч��,д������ѭ����.
				Thread.sleep(1000);	//��ʾÿ��һ����.
				System.out.println(new Date());	//��ӡ��ǰʱ��
			}
	}

}
//����һ����,������ ������Ҫ��ʱִ��.�ͼ̳������ʱ������.������󷽷�.
class naozhong extends TimerTask{	//�̳������ʱ��,Ctrl+1������д���󷽷�.run()

	@Override
	public void run() {
	System.out.println("������");
	}
	
}
/*֪ʶ��:����Ǹ�����ʱ,��Ҫ�̳�TimerTast������.��дrun()���󷽷�.����Ҫ����Timer��ʱ������.���м�ʱ��������.��schedule()����
 * ��ʱ����,������.Ҫ��ָ���������,ָ��ʱ�����,ָ�����ʱ��(new����,new Date,����)*/
 