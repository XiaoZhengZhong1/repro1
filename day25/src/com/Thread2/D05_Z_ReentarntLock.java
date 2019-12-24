package com.Thread2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class D05_Z_ReentarntLock {
	/*###25.06_���߳�(JDK1.5�������Ի�����)(����)(ȡ����synchronized)
1.ReentrantLock����������������˼,��������ʹ�� synchronizedͬ����������������ʵ���ʽ����������ͬ��һЩ������Ϊ�������������ܸ�ǿ�� 
 ʹ��ReentrantLock���lock()��ȡ����unlock()�ͷ�����������ͬ��.��ȡ��Ҫ��whileѭ���ж�֮ǰ.
 * 2.ͨ��
* ʹ��ReentrantLock���newCondition()�������Ի�ȡCondition����
* ��Ҫ�ȴ���ʱ��ʹ��Condition��await()����, ���ѵ�ʱ����signal()����(������ȷ�ȴ��ͻ��ѵľ����߳�,����ȫ������,Ҳ��ȷ��˳��)
* ��ͬ���߳�ʹ�ò�ͬ��Condition, �����������ֻ��ѵ�ʱ�����ĸ��߳���(����ÿ���̵߳���һ��newCondition()����,����һ�������)
*/
	public static void main(String[] args) {
			final b b2 = new b();
			new Thread(){
				public void run(){
					while(true){
					try {
						b2.print();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					}
				}
			}.start();
			new Thread(){
				public void run(){
					while(true){
					try {
						b2.print2();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					}
				}
			}.start();
			new Thread(){
				
				public void run(){
					while(true){
					try {
						b2.print3();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				}
			}.start();
	}

}
class b {
	ReentrantLock r = new ReentrantLock();	//����һ������������.��������������ͬ��,�ͼ�����ȴ����ѷ���.
	private	Condition c = r.newCondition();	//��Ϊ�������÷��ص���һ��Condition������ӿ�,����Ҫ�Ȱѽӿڵ�������.�������ܵ���
	private	Condition c2 = r.newCondition();	//��ʾ��ȡ3����ͬ�ļ����,�ֱ����3���߳�.����ָ���ȴ��ͻ��Ѿ����߳�
	private	Condition c3 = r.newCondition();	//����private˽������,��ʾֻ�ڱ�����ʹ��.
	private int a = 1;		//�������.����3���߳�֮��ִ�е�ѭ���ж�����.
	public void print() throws InterruptedException{
		r.lock();		//��ʾ�ñ���˽�ж��������ͬ������,ִ�з�����������.
		if(a != 1){	
			c.await();	//c�ڱ������оʹ���������ִ�б��������̵߳ȴ�.
		}
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		System.out.print("d");
		System.out.println("");
			a = 2;		//�ı�ֵ
			c2.signal();	//����c2�߳�.(ע�⻽������ʱ�������ͷ���֮ǰ����)
			r.unlock();	//�ͷ���(���ǽ���)
	}
	public void print2() throws InterruptedException{
		r.lock();
		if(a != 2 ){
			c2.await();
		}
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.print("4");
		System.out.println("");
			a = 3;
			c3.signal();
			r.unlock();
	}
	public void print3() throws InterruptedException{
		r.lock();
		if(a != 3){
			c3.await();
		}
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.print("D");
		System.out.println("");
				a = 1;
				c.signal();
				r.unlock();
	}
	/*###25.08_���߳�(�̵߳�����״̬)(����)
	* ��ͼ˵��(���Ի����̵߳�����״̬����5��)
	* �½�,����,����,����,����*/



}