package cn.itcast.gjp.controller;

import java.util.List;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.service.ZhangWuService;

//��������
//�����û���ͼ�������,���ݴ��ݸ�service��,(����ҪƵ����service�㴫������,�����ڱ���new service����)
public class ZhangWuController {
	private ZhangWuService service = new ZhangWuService();//˽�б�ʾֻ�ڱ�����,����ʹ��
	
//����ͼ��,�����Ʋ�,��ҵ���,�ٵ�ZhangWu���ݿ��,����һһ������,1��ͼ������Ľ��,ʵ�������ɵ�4�����ݿ�ʵ����һ�����˵���ص�

	/*���巽��,ʵ�ֶ������ɾ������
	 * ʵ��˼��
	 * ����ͼ����ñ���ɾ����������,������һ���������ݲ���.���ɱ������ҵ����ɾ������.�����ݴ���ͼ����յ���������.
	 * */
	public void deleteZhangWu(int Zwid) {
		service.deleteZhangWU(Zwid);
	}
	
	
	
	
	
	
	
	
	
	/*���巽��,ʵ�ֶ�����ı༭����
	 * ʵ��˼��
	 * �����û�¼��������Ϣ,����Ϣ��װ��zhangwu����.���෽������ͼ��view����.
	 * �������ҵ���service�ı༭���񷽷�.����¼������������.ʵ�ֱ༭.
	 * 
	 * */
	public void editZhangWu(ZhangWu zw){
		service.editZhangWu(zw);
	}	
	
	
	
	
	
/*����addZhangWu--- ������񷽷�,���෽������ͼ��view����,�����ݲ���,������ͼ��¼���5����������zhangwu����.�Ϳ���ֱ�����
 * zhangwu����Ϊ����.��������ٵ���service�㷽��,����zhangwu�������.��ȡ����Ӻ�Ľ����(��ӳɹ������� int)*/	
	public void addZhangWu(ZhangWu zw){
		service.addZhangWu(zw);
	}
	
	
	
	
	public List<ZhangWu> select(String startDate, String endDate){
		return service.select(startDate, endDate);
	}
	/*��Ϊ��ͼ��������ǿ�������,���Ե���ͼ��view,��������ʱ,���ݾͻᴫ�ݵ����Ʋ�controller.������ͼ���Ҫ���ɿ��Ʋ�ʵ��,��Ϊ��ͼ
	 * ��new����contorller����*/
	
	/*���Ʋ㶨�巽��,ʵ�ֲ�ѯ������������.��������ͼ��view����(��Ϊ��ͼ��new��controller).���Ʋ�controller��new��service
	 * ҵ������,���п��Ʋ���õ���ҵ���ķ���*/
	public List<ZhangWu> selectAll(){//�η���Ϊ��ͼ��4:��ѯ--1:��ѯ����
		return service.selectAll();//���ؽ��һ������.
	}





	

}
