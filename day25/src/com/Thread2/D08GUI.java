package com.Thread2;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class D08GUI {

	public static void main(String[] args) {
	/*	###25.13_GUI(��δ���һ�����ڲ���ʾ)
		* Graphical User Interface(ͼ���û��ӿ�)��
		* */
				Frame  f = new Frame("�ҵĵ�һ������");//����һ������(����Ĭ������С״̬,�ǲ��ɼ���.Frame�������ÿɼ�����)
			//	      //���ò��ֹ�����
				f.setSize(500,400);//���ô����С
				f.setLocation(300,200);//���ô����������Ļ��λ��
	//	f.setIconImage(Toolkit.getDefaultToolkit().createImage("ws.jpg"));//�����Զ���ͼ��,(Ū����)
				Button b = new Button("��ť1");//���������ð�ť
				Button b2 = new Button("��ť2");//���������ð�ť
				f.add(b);					 //�����õİ�ť��ӵ�����
				f.add(b2);					 //�����õİ�ť��ӵ�����
				b2.addActionListener(new ActionListener() {	//��b2���������һ����������������.��д�رշ���.
					
					@Override
					public void actionPerformed(ActionEvent e) {	//����Ĭ��b2���ڹرռ��ǿո����������.
					System.exit(0);		//�����йر������.
					}
				});
				f.setLayout(new FlowLayout());//���ò��ֹ�����,"����1"��λ��(�� �� �� �� �� 4��λ��)
			//	f.addWindowListener(new abc());//���һ���йرմ��ڷ����Ķ���.(�����������������ɹر�)
				f.setVisible(true);	//���ô��ڿɼ�.
	}

}
class abc extends WindowAdapter{	//�̳�WindowAdapter��,��д����رմ��ڵķ���.
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);		//�ڷ���������ر������.����������ʱ�ͻ��Զ����ø÷���.
		
	}
}
/*###25.14_GUI(���ֹ�����)
* FlowLayout����ʽ���ֹ�������
	* �����ҵ�˳�����С�
	* PanelĬ�ϵĲ��ֹ�������
* BorderLayout���߽粼�ֹ�������
	* �����ϣ�����������
	* FrameĬ�ϵĲ��ֹ�������
* GridLayout�����񲼾ֹ�������
	* ����ľ���
* CardLayout����Ƭ���ֹ�������
	* ѡ�
* GridBagLayout����������ֹ�������
	* �ǹ���ľ���
###25.15_GUI(�������)
	Frame f = new Frame("�ҵĴ���");
	//�¼�Դ�Ǵ���,�Ѽ�����ע�ᵽ�¼�Դ��
	//�¼����󴫵ݸ�������
	f.addWindowListener(new WindowAdapter() {
	          public void windowClosing(WindowEvent e) {
	                     //�˳������,�رմ���
			System.exit(0);
		}
	});

###25.16_GUI(������)
###25.17_GUI(���̼����ͼ����¼�)
###25.18_GUI(��������)*/