package com.Thread2;

public class D04_Z_wait_notify {
	/*###25.04_���߳�(�����̼߳��ͨ��)(����)
	* 1.ʲôʱ����Ҫͨ��
* ����̲߳���ִ��ʱ, ��Ĭ�������CPU������л��̵߳�(��������߳�ִ��һ���,�Ǹ��߳�ִ��һ���.����ͬ��Ҳ��һ��(ͬ���ܱ�֤�߳�֮�䲻��))
		* �������ϣ�������й��ɵ�ִ��, �Ϳ���ʹ��ͨ��, ����ÿ���߳�ִ��һ�δ�ӡ
	* 2.��ôͨ��
		* ���ϣ���̵߳ȴ�, �͵���wait()
		* ���ϣ�����ѵȴ����߳�, �͵���notify();
		* ����������������ͬ��������ִ��, ����ʹ��ͬ��������������(���������������class����this����ϵͳĬ����ʶ���.���ߴ���һ������)*/
	public static void main(String[] args) {
		final tongxin tg = new tongxin();
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					try {
						tg.print();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}	//��ʾ�������߳��ڲ��࿪��һ���߳�.tg���뱨��(��Ϊ�ڲ����еı���������final����)
				}
			}
		}.start();
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					try {//��Ϊ���������������������׳��쳣,�׵�������,�ɵ����ߴ���.�������ǵ��÷�����Ҫ�����쳣(run����û���쳣,)
						tg.print2();//��ʾ�������߳��ڲ��࿪��һ���߳�.tg���뱨��(��Ϊ�ڲ����еı���������final����)
					} catch (InterruptedException e) {	//run()��������û���쳣,���಻�����쳣.ֻ��try
						
						e.printStackTrace();
					}	
				}
			}
		}.start();
	}

}
class tongxin{
	private int a = 1;	//����һ������,������ͨ�Ž�������.˽�б���,��ʾֻ���ڱ�����ʹ��.
	public void print() throws InterruptedException{
		synchronized(tongxin.class){
			if(a != 1){		//������ʾ��ֵΪ1 ,�жϱ�ʾa ���������1,�����̵߳ȴ�.
				tongxin.class.wait();//wait()�ȴ�������Objict��ķ���.������Ҳ���Ե���.���������ļ��������Ҳ�ǿ��Ե�thisҲ��
			}
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		System.out.print("d");
		System.out.println("");	
			a = 2;	//�ѱ�����Ϊ2
			tongxin.class.notify();	//�������߳�,�еȴ��϶�Ҫ�л���.��ͬʱ���ڵ�.�����߳�ͨ��.
		}
	}
	public void print2() throws InterruptedException{
		synchronized(tongxin.class){
			if(a != 2){	//if����Ǵ�������ִ�е�,����Ƕ���߳�,�����Ѻ����ֱ��������ı����ѵ�wait,������ȥ��if�ж�.
				tongxin.class.wait();	//ע��ͨ�ŵȴ��ͻ��ѱ�����ͬ������,��Ϊ�ȴ��ͻ��ѵ���ͬ���е�����.
			}
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.print("4");
		System.out.println("");	
			a = 1;
		   tongxin.class.notify(); //�����жϺ�ֻ������ֵ,�ֱ����һ���߳�.���ҵ�һ���߳�ִ��ʱ,��һ���߳��ڵȴ�.���ܱ�֤�̹߳���
		}
	}
}
/*
###25.05_���߳�(�������������ϼ���߳�ͨ��)
* ����߳�ͨ�ŵ�����
	* notify()�������������һ���߳�
	* notifyAll()�����ǻ��������߳�
	* JDK5֮ǰ�޷�����ָ����һ���߳�
	* �������߳�֮��ͨ��, ��Ҫʹ��notifyAll()֪ͨ�����߳�, ��while�������ж�����
*/
