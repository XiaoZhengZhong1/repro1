package com.thread;



public class D10_Z_synchronized {
	/*###24.17_���߳�(ͬ������)(����)
	* ʹ��synchronized�ؼ�������һ������,�÷��������еĴ��붼��ͬ����(ǰ������ͬ���Ķ���,����һ�������������Ͷ���,���Ҷ�����Ĭ����ͬ)
	 �Ǿ�̬ͬ������������:this
	 * ��̬��ͬ������������:�ֽ������(���Ƿ�����������ļ�(����.class))*/
	public static void main(String[] args) {
		final one o = new one();
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					o.println();
				}
			}
		}.start();
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					o.println2();
				}
			}
		}.start();
	}

}

class one{
	public synchronized void println(){	//�����м���synchronized��ʾͬ������.�ͱ������еķ���ͬ��,������.��Ҫ��ϵͳ��Ĭ��
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		System.out.print("d");
		System.out.print("\r\n");	//����ͬ������,���ܱ�֤abcd��һ�����.���û��ͬ������,���Ͻ������,��:abcdAB
	}
	public void println2(){
		synchronized(this){		//��ʾͬ������������.����this.�������.
		System.out.print("A");
		System.out.print("A");
		System.out.print("A");
		System.out.print("A");
		System.out.print("\r\n");	//����ͬ������.�ܱ�֤AAAA��һ�����,�������AAAAab
		}
	}
}

/*��̬�������ǵ�һ������������public static synchronized void println() �����м���static
 * �ڶ���������synchronized(one.class) �ѵڶ���ͬ���������Ϊ(one.class).��Ϊ��̬��������ļ��ض����ص�,�������ʱ��û�ж���
 * ���ļ�����class����ϵͳ��ʶ��Ķ���.*/

/*###24.21_���߳�(��ǰ���̰߳�ȫ����ع�)(����)
* A:�ع���ǰ˵�����̰߳�ȫ����
	* ��Դ�룺Vector,StringBuffer,Hashtable,Collections.synchroinzed(xxx)
	* Vector���̰߳�ȫ��,ArrayList���̲߳���ȫ��-----�ڱ���(д����)��,Ctrl+Shift+t,��������߼���.��Ctrl+o����add��put����
	* �ᷢ��,�̰߳�ȫ�ķ����ж������synchronizedͬ������.�̲߳���ȫ�Ķ�û�����ͬ������.
	* StringBuffer���̰߳�ȫ��,StringBuilder���̲߳���ȫ��
	* Hashtable���̰߳�ȫ��,HashMap���̲߳���ȫ��
*/
