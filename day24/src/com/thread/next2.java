package com.thread;

public class next2 {
	/*###24.19_���߳�(��վ��Ʊ��������ʵ��Runnable�ӿ�)(����)
*/
	public static void main(String[] args) {
		maipiao2 mp = new maipiao2();	//����ʵ�ּ̳нӿ��������.
		new Thread(mp).start();	//���߳̽ӿ�����������п���������Thread�߳��๹�캯����.�����ÿ����̷߳���.
		new Thread(mp).start();
		new Thread(mp).start();
		new Thread(mp).start();
	}

}
class maipiao2	implements Runnable{
	private int piao = 100;		//��Ϊֻ��Ҫ����һ������,����4���̹߳��캯����Ҳ��һ��ͬһ������.����ֻ��һ���������100,���蹲��.
	@Override
	public void run() {
	while(true){
		synchronized(maipiao.class){//�¼�ͬ����ʾ4���߳�,Ҫ��ÿ���߳̽���ִ������Ʊ��,����̲߳��ܽ���.�������ֽ��뵱�����Ψһ
		if(piao <= 0){
			break;
		}
			try {
				Thread.sleep(10);	//ע������ֻ�����������.��������������ǰ����,������Ч.ʱ��ֹͣ�쳣��ҪCtrl+1����try.... 
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "...���ǵ�:" + piao-- + "��Ʊ");/*��ΪRunnable
			ֻ��һ��run����.û����������.����Ҫ�õ�ǰ�̵߳���getName()����,�߳̿�����,run��������������Զ�ִ��,*/
		}
	}
	
	
	
	}
	
	
}

/*###24.20_���߳�(����)(�˽�)
* ���߳�ͬ����ʱ��, ���ͬ������Ƕ��, ʹ����ͬ��, ���п��ܳ�������
	* ������ҪǶ��ʹ��*/