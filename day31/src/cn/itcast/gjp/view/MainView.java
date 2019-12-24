package cn.itcast.gjp.view;

import java.util.List;
import java.util.Scanner;

import cn.itcast.gjp.controller.ZhangWuController;
import cn.itcast.gjp.domain.ZhangWu;

//��ͼ������û������Ͳ����ǽ���(�ÿ���̨ģ��),�������ݻᴫ�ݸ�controller��ʵ��.
//����ҪƵ����controller�㴫������,�����ڱ���new controller����)
//
public class MainView {
	private  ZhangWuController controller = new ZhangWuController();//˽�б�ʾֻ�ڱ�����,����ʹ��

	/*
			 *  ʵ�ֽ���Ч��
			 *  �����û�������
			 *  ��������,���ò�ͬ�Ĺ��ܷ���*/
	public void run(){
		Scanner sc = new Scanner(System.in);
		while(true){//���ڿ���̨���ѡ��
			System.out.println("---------------�ܼ��ż�ͥ�������---------------");
			System.out.println("1.�������2.�༭����3.ɾ������4.��ѯ����5.�˳�ϵͳ");
			System.out.println("������Ҫ�����Ĺ������[1-5]:");
			//�����û��Ĳ˵�ѡ��ѡ��
			int choose = sc.nextInt();
			//��ѡ��Ĳ˵��ж�,���ò�ͬ�Ĺ���
			switch(choose){//��ѡ����й̶��ж�
			case 1:
			   // ѡ���������,�����������ķ���
				addZhangWu();
				break;
			case 2:
				// ѡ��ı༭����,���ñ༭���񷽷�
				editZhangWu();
				break;
			case 3:
				// ѡ���ɾ������,����ɾ�����񷽷�
				deleteZhangWu();
				break;
			case 4:
				// ѡ����ǲ�ѯ����,���ò�ѯ����
				selectZhangWu();
				break;
			case 5:
				System.exit(0);//�����˳������
				break;
		}
			sc.close();			
		}
		
	}

	/*���巽��,ʵ�ֶ������ɾ������
	 * ʵ��˼��
	 * �����û�¼����Ϣ,����һ����������.���ɱ�����ÿ��Ʋ��ɾ������.��������ͼ����յ���������.
	 * */
	public void deleteZhangWu(){
		selectAll();
		System.out.println("��ѡ�����ɾ������,������Ҫɾ����id��");
		int Zwid = new Scanner(System.in).nextInt();//��Ϊֻ��Ҫ¼��һ��id��,���Կ���newһ������¼��,����¼�뷽��.
		controller.deleteZhangWu(Zwid);
		System.out.println("����ɾ���ɹ�");
		
	}
	
	
	
	
	
	
	/*���巽��,ʵ�ֶ�����ı༭����
	 * ʵ��˼��
	 * �����û�¼��������Ϣ,����Ϣ��װ��zhangwu����.
	 * ���ÿ��Ʋ�controller�ı༭����.����¼������������.ʵ�ֱ༭.
	 * 
	 * */
	public void editZhangWu(){
		selectAll();//��ʾ�û�ѡ��2ѡ��༭����ʱ,�Ȱ����������ӡ���û���,�Է���ѡ�б༭.
		System.out.println("��ѡ��Ҫ�༭������");
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�༭��id");
		int zwid = sc.nextInt();
		System.out.println("�������������");
		String flname = sc.next();//next()���Խ����������͵�����
		System.out.println("��������");
		 double money = sc.nextDouble();
		System.out.println("�������˻�");
		String zhanghu = sc.next();
		System.out.println("����������xxxx��-xx��-xx��");
		String createtime = sc.next();
		System.out.println("����������������Ϣ");
		String description = sc.next();
		//�Ѽ���¼�����Ϣ,��װ��zhangwu����.
		ZhangWu zw = new ZhangWu(zwid, flname, money, zhanghu, createtime, description);
		//���ÿ��Ʋ�controller������༭����.��������������
				controller.editZhangWu(zw);
				System.out.println("�༭����ɹ�");
				sc.close();
	}
	
	
	
	
	//����addZhangWu--- ������񷽷�,���û���ͼ����ѡ��1��ʱ�����.
	//�Ѽ���¼�����Ϣ,��װ��zhangwu����.���г���id֮���5���¼(��Ϊ����id�Ѿ��Զ�����,�������).
	public void addZhangWu(){
		System.out.println("��ѡ������������,��������������");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������");
		String flname = sc.next();//next()���Խ����������͵�����
		System.out.println("��������");
		 double money = sc.nextDouble();
		System.out.println("�������˻�");
		String zhanghu = sc.next();
		System.out.println("����������xxxx��-xx��-xx��");
		String createtime = sc.next();
		System.out.println("����������������Ϣ");
		String description = sc.next();
		sc.close();
/*�����յ������ݵ���Contorller���еķ���,����contorller�����service���еķ���,����service�����dao�㷽��,������dao�����
 * ��¼������ݵ����ݿ����(��Ϊ�������Ͳ�������һ����,����¼��Ĳξ������в���)*/
	
//�����¼��Ĳ�����װ��zhangwu����,��new zhangwu�������вι���,������������.��һ��id���Դ���0.��Ϊֻ�Ǹ���ʽ,û��¼��id��ѡ��
		ZhangWu zw = new ZhangWu(0, flname, money, zhanghu, createtime, description);
		controller.addZhangWu(zw);
		System.out.println("��ϲ�������ɹ�");
	}

	
	
	 /*
	  * ���巽��,ʵ�ֲ�ѯ���е���������
	  */
	public void selectZhangWu(){
		 System.out.println("1. ��ѯ����    2. ������ѯ");
		 Scanner sc = new Scanner(System.in);
		 int selectChooser = sc.nextInt();
		 //�жϸ����û���ѡ��,���ò�ͬ�Ĺ���
		 sc.close();
		 switch(selectChooser){
		 case 1:
			 //ѡ��Ĳ�ѯ����,���ò�ѯ���еķ���
			 selectAll();
			 break;
		 case 2:
			 //ѡ��������ѯ,���ô��в�ѯ�����ķ���
			 select();
			 break;
		 }
	 }
	
	
	 //ѡ��Ĳ�ѯ����,���ò�ѯ���еķ���
	public void selectAll(){
		List<ZhangWu> list = controller.selectAll();
		//��ĿҪ��,����Ľ��Ҫ������ͷ(ָ������:id)
		 print(list);
	 }

	
	
	 /*
	  * ���巽��,ʵ��������ѯ��������
	  * �ṩ�û�����������,��ʼ���ڽ�������
	  * ��2������,���ݵ�controller��
	  * ����controller�ķ���,����2�����ڲ���
	  * ��ȡ��controller��ѯ�Ľ����,��ӡ����
	  */
	 public void select(){
		System.out.println("ѡ����Ӳ�ѯ:�밴��ʱ���ʽyyyy��-mm��-dd��");
		 Scanner sc = new Scanner(System.in);
		System.out.print("�����뿪ʼ����:");
		String startDate = sc.nextLine();
		System.out.print("�������������:");
		String endDate = sc.nextLine();
		List<ZhangWu> list = controller.select(startDate, endDate);
		sc.close();
		if(list.size() != 0)
			print(list);
		else
			System.out.println("û������");
	 }

	 	


//����Ĵ�ӡ��������,ÿ�δ�ӡ��Ҫ����,�ظ���̫��,�Ѿ�����ȡ����,һ������.
public void print(List<ZhangWu> list) {
	System.out.println("ID\t\t���\t\t���\t\t�˻�\t\tʱ��\t\t\t˵��");//ÿ�������������Ʊ����ʾ,��֮��ļ�¼���Զ
	 for (ZhangWu zw : list) {
		System.out.println(zw.getZwid() + "\t\t" + zw.getFlname() + "\t\t" + zw.getMoney() + "\t\t"
				+ zw.getZhanghu() + "\t\t" + zw.getCreatetime() + "\t\t" + zw.getDescription() );
	}
}




}