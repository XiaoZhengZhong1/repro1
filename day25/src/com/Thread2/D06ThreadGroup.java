package com.Thread2;

public class D06ThreadGroup {
	/*###25.07_���߳�(�߳���ĸ�����ʹ��)(�˽�)
	* A:�߳������
		* Java��ʹ��ThreadGroup����ʾ�߳��飬�����Զ�һ���߳̽��з������Java�������ֱ�Ӷ��߳�����п��ơ�
		* Ĭ������£����е��̶߳��������߳��顣
			* public final ThreadGroup getThreadGroup()//ͨ���̶߳����ȡ�������ڵ���
			* public final String getName()//ͨ���߳�������ȡ���������
		* ����Ҳ���Ը��߳����÷���
			* 1,ThreadGroup(String name) �����߳�����󲢸��丳ֵ����
			* 2,�����̶߳���
			* 3,Thread(ThreadGroup?group, Runnable?target, String?name) 
			* 4,������������ȼ������ػ��߳�
		* B:������ʾ
			* �߳����ʹ��,Ĭ�������߳���*/

	//ͨ�����������ú�̨�̣߳���ʾ������̶߳��Ǻ�̨�߳�
	//tg.setDaemon(true);
			
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr, "����");
		Thread t2 = new Thread(mr, "����");
		//��ȡ�߳���
		// �߳�������ķ�����public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		// �߳�������ķ�����public final String getName()
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);	//������ main
		System.out.println(name2);	//������ main
		// ͨ���������֪���ˣ��߳�Ĭ�����������main�߳���
		System.out.println(Thread.currentThread().getThreadGroup().getName());	//������ main
		// ͨ������Ĳ��ԣ���Ӧ���ܹ�������Ĭ������£����е��̶߳�����ͬһ����,main�߳���

		
		//* �Լ��趨�߳���
 			
		// ThreadGroup(String name)
		ThreadGroup tg = new ThreadGroup("����һ���µ���");

		MyRunnable mr2 = new MyRunnable();
		// Thread(ThreadGroup group, Runnable target, String name)
		Thread t3 = new Thread(tg, mr2, "����");
		Thread t4 = new Thread(tg, mr2, "����");
		
		System.out.println(t3.getThreadGroup().getName());	//����������һ���µ���
		System.out.println(t4.getThreadGroup().getName());
	}

}
class MyRunnable implements Runnable{

	@Override
	public void run() {
	for (int i = 0; i < 10; i++) {
		
		System.out.println(Thread.currentThread().getName() + "....." + i);
	}
	}
	
}
/*###25.10_���߳�(���̳߳���ʵ�ֵķ�ʽ3)(�˽�)
*ʵ�ֲ���:1:ʵ�ֽӿ�public class MyCallable implements Callable<Integer> {
* 2:��д����,�����������쳣,��return����ֵpublic Integer call() throws Exception {
* 3:����һ���̳߳�ExecutorService pool = Executors.newFixedThreadPool(1)
* 4:��ʵ�ֵĽӿ�����,�����̳߳ز�����.Future<Integer> f1 = pool.submit(new MyCallable(xxx));
*5:��ȡ����ֵ:Integer i1 = f1.get();
*6:�������ֵSystem.out.println(i1);
*�ύ����Callable
* ���̳߳���ʵ�ֵķ�ʽ3�ĺô��ͱ׶�
	* �ô���
		* �����з���ֵ
		* �����׳��쳣
		
	* �׶ˣ�
		* ����Ƚϸ��ӣ�����һ�㲻��
* 
* */
/*###25.11_���ģʽ(�򵥹���ģʽ������ʹ��)(�˽�)
* A:�򵥹���ģʽ����
	* �ֽо�̬��������ģʽ��������һ������Ĺ����ฺ�𴴽�һЩ���ʵ��
* B:�ŵ�
	* �ͻ��˲���Ҫ�ڸ������Ĵ������Ӷ���ȷ�˸������ְ��
* C:ȱ��
	* �����̬�����ฺ�����ж���Ĵ�����������µĶ������ӣ�����ĳЩ����Ĵ�����ʽ��ͬ������Ҫ���ϵ��޸Ĺ����࣬�����ں��ڵ�ά��
* D:������ʾ
	* ��������ࣺpublic abstract Animal { public abstract void eat(); }
	* ���幷�ࣺpublic class Dog extends Animal {}
	* ����è�ࣺpublic class Cat extends Animal {}
	* ��ʼ���ڲ�������ÿ������������Լ��������󣬵��ǣ���������Ĺ�������Ƚ��鷳������Ҫ����ר����������飬���Ծ�֪����һ��ר�ŵ�������������
* 
*/

/*###25.12_���ģʽ(��������ģʽ�ĸ�����ʹ��)(�˽�)
* A:��������ģʽ����
	* ��������ģʽ�г��󹤳��ฺ���崴������Ľӿڣ��������Ĵ��������ɼ̳г��󹤳��ľ�����ʵ�֡�
* B:�ŵ�
	* �ͻ��˲���Ҫ�ڸ������Ĵ������Ӷ���ȷ�˸������ְ��������µĶ������ӣ�ֻ��Ҫ����һ���������;���Ĺ����༴�ɣ���Ӱ�����еĴ��룬����ά�����ף���ǿ��ϵͳ����չ��
* C:ȱ��
	* ��Ҫ����ı�д���룬�����˹�����*/
