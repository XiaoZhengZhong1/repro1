package com.thread;

public class D03_Z_new_Thread {
	/*###24.08_���߳�(�����ڲ���ʵ���̵߳����ַ�ʽ)(����)
	* �̳�Thread��
	* �������.�����ಿ��,������һ�����д���һ��������(ǰ�������������.�Ǵ��ڵ�).����Thread xxx = new Thread();Thread�������һ��
	* �߳���,�ڱ������new Thread(){},�������д���������.ע�����һ��Ҫ��{}������������.��Ϊnew Thread()�������һ���������
	* class A ��һ����˼.��Ϊ��������,ǰ��Ͳ��ü�class����.����һ��Ҫ��{}��ʾ����һ����.��һ�����д�����һ��������.�൱���Ǽ̳���
	* ����������౾�����.Thread��.
	* */
	public static void main(String[] args) {
//�����ڲ���1:new Thread(){}.start(); ���б�����дrun()����.�������ÿ�������
		new Thread(){	/*һ���̳���Thread���,�ڲ��������������.(��ΪThread�߳��౾��ʹ���API��,��Java lang���µ�,����Ҫ
			����.�ڱ������new Thread���Ǵ�����Thread�����������.).*/
			public void run(){	//��д�˷���
				for (int i = 0; i < 1000; i++) {	
					System.out.println("abcd");
				}
			}
		}.start();	//��Ϊnew�߳̾�Ҫ����,����}����ᱨ��, .start();������Ͳ�������.(��Ϊû�и�ֵ����.������������Ƕ���,���÷���)
		
/*�����ڲ���2:	new Thread(new Runnable(){}).start();	 ������������new Runnable(){}���б�����дrun����.��ΪRunnable
 * �ӿ�����û��start()����.����Ҫ����new Thread()�������������.�ö�����ÿ�������.*/
		new Thread(new Runnable(){		//�����ಿ��new Runnable(){}ʵ����Runnable
			public void run(){			//��д����.
				for (int i = 0; i < 1000; i++) {	//�����п������Լ���ִ�����.
					System.out.println("12334");
				}
			}
		}).start();
			
		
		
	}

}
