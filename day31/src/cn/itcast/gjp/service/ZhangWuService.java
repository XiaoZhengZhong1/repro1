package cn.itcast.gjp.service;

import java.util.List;

import cn.itcast.gjp.dao.ZhangWuDao;
import cn.itcast.gjp.domain.ZhangWu;

/*������ҵ�����,������һ����Ʋ�contorller������,���������,���ݸ�dao��,(��Ϊ��ҪƵ����dao��������ݴ���,�������ڱ��ഴ��һ��dao��
 * �е�dao�����)
 * 
 */
public class ZhangWuService {
	private  ZhangWuDao dao = new ZhangWuDao();//˽�б�ʾֻ�ڱ�����,����ʹ��
	//����ͼ��,�����Ʋ�,��ҵ���,�ٵ�ZhangWu���ݿ��,����һһ������,1��ͼ������Ľ��,ʵ�������ɵ�4�����ݿ�ʵ����һ�����˵���ص�

	
	/*���巽��,ʵ�ֶ������ɾ������
	 * ʵ��˼��
	 * �ɿ��Ʋ���ñ���ɾ����������,������һ���������ݲ���.���ɱ������dao���ɾ������.�����ݴӿ��Ʋ���յ���������.
	 * */
	public void deleteZhangWU(int Zwid) {
		dao.deleteZhangwu(Zwid);
	}
	
	
	
	
	
	
	
	
	
	
	/*���巽��,ʵ�ֶ�����ı༭����
	 * ʵ��˼��
	 * �����û�¼��������Ϣ,����Ϣ��װ��zhangwu����.
	 * ����dao����������ݿ�༭���񷽷�.����¼������������.ʵ�ֱ༭.
	 * 
	 * */
	
	public void editZhangWu(ZhangWu zw){
		dao.editZhangWu(zw);
	}	
	
	
	
	
	/*����������񷽷�
	 * ���෽���ɿ��Ʋ�controller����,������zhangwu����
	 * �����ٵ���dao�㷽��,�����ݲ���.*/
	public void addZhangWu(ZhangWu zw){
		dao.addZhangWu(zw);
	}
	
	
	
	
	
	
	
	
	public List<ZhangWu> select(String startDate, String endDate){
	return dao.select(startDate, endDate);
	}
	
	/*���巽��,ʵ�ֲ�ѯ������������.�����ɿ��Ʋ�Controller����,�����ɱ�ҵ�������dao��(ʵ�����ݿ����ӳ�)*/	
		public List<ZhangWu> selectAll(){
			return dao.selectAll();/*��Ϊ��ҵ����,��������ZhangWudao���dao����.dao�����в������ݿ�����,����ɾ�Ĳ鹦��
			���Դ���ͼ��,�����Ʋ�,��ҵ���,�ٵ�ZhangWu���ݿ��,����һһ������,1��ͼ������Ľ��,ʵ�������ɵ�4�����ݿ�ʵ����
			һ�����˵���ص�*/
		}




		
}
