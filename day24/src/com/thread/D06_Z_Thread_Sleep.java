package com.thread;

public class D06_Z_Thread_Sleep {
	/*###24.11_���߳�(�����߳�)(����)----Sleep��˯�ߵ���˼.Thread.Sleep(����)���߳�˯�ߵ���˼.��Ϊwindowϵͳ��֧������
	* Thread.sleep(����,����), ���Ƶ�ǰ�߳��������ɺ���1��= 1000���� .1�� = 1000 * 1000 * 1000���� =1000000000�������10��*/
	public static void main(String[] args) throws InterruptedException {
			Thread.sleep(5000);		//��ʾ���߳�������ʱ����5����,��������.(���л����ʱ��ֹͣ�쳣)
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);  //��ʾ��ѭ����,ÿѭ��һ������1��.
				System.out.println("i");
			}
	
			new Thread(){
				public void run(){	//������д����̳�,����̳и���ֻ�ܱȸ���ǿ,�����run()����û���쳣.����Ͳ����׳��쳣
					for (int i = 10; i > 0; i--) {
						try {	
							Thread.sleep(1000);	//ע�����ͬ���ᱨ��ʱ��ֹͣ�쳣,���ǲ����׳�.ֻ��Ctrl + 1 ����try catch
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
						System.out.println("a");
					}
				}
			}.start();
	
	}

}
