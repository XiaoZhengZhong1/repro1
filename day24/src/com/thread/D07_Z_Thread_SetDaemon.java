package com.thread;

public class D07_Z_Thread_SetDaemon {
	/*###24.12_���߳�(�ػ��߳�)(����)
	* setDaemon(), ����һ���߳�Ϊ�ػ��߳�, ���̲߳��ᵥ��ִ��, ���������ػ��̶߳�ִ�н�����, �Զ��˳�*/
	public static void main(String[] args) {
//��ΪҪ�����Ǹ����ػ��߳�,�Ǹ��Ǳ��ػ��߳�.���Կ������߳�Ҫ������.����������.
	Thread t1 = new Thread(){
		public void run(){
			for (int i = 0; i < 1; i++) {
				System.out.println("���ػ�����˧");
			}
		}
	};	//��Ϊ���ڲ���,����Ҫ��;����
	
	Thread t2 = new Thread(){
		public void run(){
			for (int i = 0; i < 10; i++) {
				System.out.println("�ػ�����˧��ǰ��");
			}
		}
	};	//��Ϊ���ڲ���,����Ҫ��;����
	t2.setDaemon(true);  //��ʾt2���ػ��߳�,�ػ�t1.t1�߳�������������,�����߳̽�����ջ��,t2�߳̿���û���Ὺ��,�������к���
	t1.start();			//�����ػ��߳�t1������.t2�ػ��߳��ڽӵ�ָ���Ҳ�����.
	t2.start();
	}

}
