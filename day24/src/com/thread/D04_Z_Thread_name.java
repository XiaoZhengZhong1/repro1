package com.thread;

public class D04_Z_Thread_name {
/*	###24.09_���߳�(��ȡ���ֺ���������)(����)
	* 1.��ȡ����----�߳�Ҳ�������Ƶ�,Ĭ�������ǰ������̵߳ĸ�����0,1,2,3.....Ϊ����.
		* ͨ��getName()������ȡ�̶߳��������.----���������������������this.getName();this����������.
	* 2.��������
		* ͨ�����캯�����Դ���String���͵�����-----�����ڹ��췽����("��������")*/
	public static void main(String[] args) {
//* 1.��ȡ����----* ͨ��getName()������ȡ�̶߳��������
		new Thread(){
			public void run(){
				System.out.println(this.getName());   //Run As = Thread-0	��ʾ������0�߳�.
			}
		}.start();
	

		new Thread(){
			public void run(){
				System.out.println(this.getName());   //Run As = Thread-1	��ʾ������1�߳�.
			}
		}.start();
//2:�����ڷ����������ú��ڹ��캯��������.�ٻ�ȡ.		
		new Thread(){
			public void run(){
				this.setName("abc");	//�ڷ����������߳�����Ϊabc
				System.out.println(this.getName());   //Run As = abc	��ʾ�߳�������abc.
			}
		}.start();
	
		new Thread("abcdef"){	//�ڹ��캯���������߳�����Ϊabcdef
			public void run(){	
				System.out.println(this.getName());   //Run As = abcdef	��ʾ�߳�������abcdef
			}
		}.start();
	
//3:ͨ�������Ƶ���������úͻ�ȡ
		Thread th = new Thread(){	//��ʾ��������ָ���������Thread�Ǹ���,new������������,th���Ǵ�������������.
			public void run(){	
				System.out.println(this.getName());   //Run As = ggg	��ʾ�߳�������ggg
			}
		};
		th.setName("ggg");			//��ʾ���������ƾ������Ƶ�������,�Ϳ�������.
		th.start();
	}

	
	
}
