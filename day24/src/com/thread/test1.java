package com.thread;

public class test1 {
	/*###24.18_���߳�(�̰߳�ȫ����)(����)
	* ���̲߳�������ͬһ����ʱ,(����4���߳�,ͬʱ��100��Ʊ)���п��ܳ����̰߳�ȫ����(������������,4���̶߳����ߺ�,��ͬʱ�����ͻ������ж�
	* ����еıȽϱ���ֵ)
	* ʹ��ͬ���������Խ����������, �Ѳ������ݵĴ������ͬ��,(ͬ����ֻ��ÿ���߳�����һ�Ž�����Ż�����һ���߳̽���.) ��Ҫ����߳�һ�����
	* */
	public static void main(String[] args) {
		maipiao m = new  maipiao();		//��ʾ������4���߳�.
		maipiao m2 = new  maipiao();
		maipiao m3 = new  maipiao();
		maipiao m4 = new  maipiao();
			m.start();
			m2.start();
			m3.start();
			m4.start();
	}

}
class maipiao extends Thread{	//��ʾ�̳����߳���
	private static int piao = 100;//�������100��Ʊ����ɹ�����.�����.��ÿ�����඼���õ�100��Ʊ.ֻ�ж���ɹ����.4�̹߳�100
	public void run(){
			
		while(true){
			synchronized(maipiao.class){/*�����߳�ͬ��,��ʾֻ��ÿ���߳�����һ��Ʊ��,����̲߳��ܽ���.�����Ͱ�ȫ��.ע���ͬ��
			λ��.һ������while����.�������while����.��ʾ�������ѭ����һ��ͬ����.����ֻ�е�һ��0�߳̽���ִ��,ֱ������100��Ʊ����*/
			if(piao <= 0){
				break;
		}else{
				try {
					Thread.sleep(10);	//������߳�ÿ��ѭ������10����,��ִ�������������,�ʹ���4�̻߳�ֱ�ִ�м���.���ָ�Ʊ
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			System.out.println(getName() + "...���ǵ�:" + piao-- + "��Ʊ");
		}
			}
		}
		}
}