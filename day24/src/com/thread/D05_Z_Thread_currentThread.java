package com.thread;

public class D05_Z_Thread_currentThread {
/*###24.10_���߳�(��ȡ��ǰ�̵߳Ķ���)(����)
 * current��"��ǰ��,���ڷ�����"��˼.currentThread()��Thread���еľ�̬����,ֻ�����������.�ǻ�ȡ��ǰ�̵߳���˼
* Thread.currentThread(), ���߳�Ҳ���Ի�ȡ*/
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());	//��ʾ�����ǰ�̵߳�����. Run As = main
		Thread.currentThread().setName("�������߳�");	//��ʾ��ȡ��ǰ�̲߳��������÷��������߳�����
		System.out.println(Thread.currentThread().getName());//��ʾ�����ȡ��ǰ�߳�,���û�ȡ���Ʒ���Run As =�������߳�
	
		new Thread("���ǵڶ����߳�"){
			public void run(){
				System.out.println(getName());	//getName(),ǰ�治��this,ϵͳ���Զ����.
			}
		}.start();
		
		new Thread(new Runnable(){	/*new Thread(xxx);��ʾnew�����вι��췽��.һ�������ǲ��ܴ���һ���̵߳�,���ǹ��캯����
		������һ��ʵ���˽ӿڵ�������.����Thread�ĸ���.��ΪAPI��ʾThread(Runnable)�ǿ��Դ���Runnable�����.��Ϊ���ǽӿ�,����ֻ��
		������������.API��ʾ�����һ���µ��߳�.*/
			public void run(){
				System.out.println(Thread.currentThread().getName());	/*Run As = Thread-0 ��ȡ��ǰ�߳�����
				֤������߳����ַ��䵽��һ�����߳�.ע��Runnable�ӿ���ֻҪһ��run()����.û�������κη���.��ҲRunnable�߳̽ӿڵı׶�.û���κ�
				���ܿ�����,���Լ��������̶߳�û�п����ķ���.ֻ��ͨ��Thread(Runnable)���캯��.��ʵ���Լ������ഫ�빹�캯����,��Thread�Ŀ�������
				�����߳�.�Լ�ֻ��һ��run����.����currentThread()��ȡ��ǰ�̵߳ķ���.�Ϳ��������л�ȡ��ǰ�߳�,�������̵߳����Է���.*/
			}
		}).start();
			
		
		
		
	
	}

}
