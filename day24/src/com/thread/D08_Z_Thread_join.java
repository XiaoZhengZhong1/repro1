package com.thread;

public class D08_Z_Thread_join {
/*###24.13_���߳�(�����߳�)(����)
* join(), ��ǰ�߳���ͣ, �ȴ�ָ�����߳�ִ�н�����, ��ǰ�߳��ټ���(���Ǳ��߳���ִ��ʱ,����߳̽�����Ӳ屾�߳�ǰ��ִ��.)
* join(int), ���Եȴ�ָ���ĺ���֮�����,(��ʾ��Ӷ��ٺ���,ʱ������ӽ���)*/	
	public static void main(String[] args) {
		final Thread t1 = new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println(getName() + "...aaaaa");
				}
				
			}
		};
	
		Thread t2 = new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					if(i == 3){		//��ʾ���i == 3
					try {
						t1.join(1);	//t1��ӽ���ִ��1����
						//t1.join();	//��ʾt1��ӽ���,��ִ��t1�߳�.
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}    /*t1���뱨����ʾ(��������һ���ڲ����еķ����ձ���t1.���ڲ���������һ�������ж����)��˼��˵
					�ڲ���ı���t1Ҳ�Ǿֲ��ڲ������.������final���κ�,�����ڱ������ʹ��.
					���t1��,�������һ������ʱ���ж��쳣,try catch���,������.*/
					}
					System.out.println(getName() + "...bbbbbb");
				}
				
			}
		};
		t1.start();
		t2.start();
	}

}
