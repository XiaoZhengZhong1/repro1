package com.thread;

public class D02_Z_Runnable {
	/*###24.05_���߳�(���̳߳���ʵ�ֵķ�ʽ2)(����)
	* 2.ʵ��Runnable
		* ������ʵ��Runnable�ӿ�
		* ʵ��run����
		* �����߳�Ҫ������д��run������
		* �����Զ����Runnable���������(�ڲ�����new)
* ����Thread����, ��������д���Runnable������new�Ķ���(��ΪRunnable��һ���ӿ�,û��start()��������.Thread����Runnable������)
		* ����start()�������߳�, �ڲ����Զ�����Runnable��run()����*/
	public static void main(String[] args) {
		A2 aa = new A2();
		Thread t = new Thread(aa);	//��Reannble�ӿڵ�����A2��Ķ�����,Runnable����һ������Thread��Ĺ��췽��������.
			t.start();				//����Thread�Ŀ�������.����start()�������߳�, �ڲ����Զ�����Runnable��run()����*
			for (int i = 0; i < 1000; i++) {	
				System.out.println("abcd");
			}
	}

}
class A2 implements Runnable{
	public void run() {
		for (int i = 0; i < 1000; i++) {	//�����п������Լ���ִ�����.
			System.out.println("12334");
		}
	}

	
}

/*###24.06_���߳�(ʵ��Runnable��ԭ��)(�˽�)
* �鿴Դ��
	* 1,��Thread��Ĺ��캯��,������Runnable�ӿڵ����� 
	* 2,ͨ��init()�����ҵ����ݵ�target����Ա������target��ֵ
	* 3,�鿴run����,����run���������ж�,���target��Ϊnull�ͻ����Runnable�ӿ���������run����
*/
/*###24.07_���߳�(���ַ�ʽ������)(����)
* �鿴Դ�������:
	* a.�̳�Thread : ����������д��Thread���run(), ������start()ʱ, ֱ���������run()����
	* b.ʵ��Runnable : ���캯���д�����Runnable������, ��Ա������ס����, start()����run()����ʱ�ڲ��жϳ�Ա����Runnable�������Ƿ�Ϊ��, ��Ϊ�ձ���ʱ������Runnable��run(),����ʱִ�е��������run()����
	
	** �̳�Thread
	* �ô���:����ֱ��ʹ��Thread���еķ���,�����
	* �׶���:����Ѿ����˸���,�Ͳ��������ַ���
* ʵ��Runnable�ӿ�
	* �ô���:��ʹ�Լ�������߳������˸���Ҳû��ϵ,��Ϊ���˸���Ҳ����ʵ�ֽӿ�,���ҽӿ��ǿ��Զ�ʵ�ֵ�
	* �׶���:����ֱ��ʹ��Thread�еķ�����Ҫ�Ȼ�ȡ���̶߳����,���ܵõ�Thread�ķ���,���븴��.
	*/