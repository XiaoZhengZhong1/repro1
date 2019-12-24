package com.Thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class D07_Executors {
	/*###25.09_���߳�(�̳߳صĸ�����ʹ��)(�˽�)
	* A:�̳߳ظ���
		* ��������һ�����̳߳ɱ��ǱȽϸߵģ���Ϊ���漰��Ҫ�����ϵͳ���н�������ʹ���̳߳ؿ��Ժܺõ�������ܣ������ǵ�������Ҫ�������������ں̵ܶ��߳�ʱ����Ӧ�ÿ���ʹ���̳߳ء��̳߳����ÿһ���̴߳�������󣬲����������������ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ�á���JDK5֮ǰ�����Ǳ����ֶ�ʵ���Լ����̳߳أ���JDK5��ʼ��Java����֧���̳߳�
	* B:�����̳߳ص�ʹ�ø���
		* JDK5������һ��Executors�������������̳߳أ������¼�������
			* public static ExecutorService newFixedThreadPool(int nThreads)
			* public static ExecutorService newSingleThreadExecutor()
			* ��Щ�����ķ���ֵ��ExecutorService���󣬸ö����ʾһ���̳߳أ�����ִ��Runnable�������Callable���������̡߳����ṩ�����·���
			* Future<?> submit(Runnable task)
			* <T> Future<T> submit(Callable<T> task)
		* ʹ�ò��裺
			* �����̳߳ض���
			* ����Runnableʵ��
			* �ύRunnableʵ��
			* �ر��̳߳�
		* C:������ʾ
			* �ύ����Runnable
	* */
	public static void main(String[] args) {
		// public static ExecutorService newFixedThreadPool(int nThreads)
				ExecutorService pool = Executors.newFixedThreadPool(2);	//��������װ�����̵߳��̳߳�.

				// ����ִ��Runnable�������Callable���������߳�
				pool.submit(new MyRunnable());	//���̳߳����ʵ��
				pool.submit(new MyRunnable());

				//�����̳߳�
				pool.shutdown();	//�ر��̳߳�.��Ϊ�̳߳��ǻ��,���ر�,�̳߳ؾͲ���ͣ.
	}

}
