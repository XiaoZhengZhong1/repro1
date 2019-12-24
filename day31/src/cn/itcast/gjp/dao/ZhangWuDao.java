package cn.itcast.gjp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.dbcp.jdbcUtils;
import cn.itcast.gjp.domain.ZhangWu;

//ʵ�ֶ����ݱ�gjp_ZhangWu,����ɾ�Ĳ����.��dbUtils���߰��е�QueryRunner����,����sql���
public class ZhangWuDao {
	private  QueryRunner qr = new QueryRunner(jdbcUtils.getbds());//˽�б�ʾֻ�ڱ�����,����ʹ��
	//����ͼ��,�����Ʋ�,��ҵ���,�ٵ�ZhangWu���ݿ��,����һһ������,1��ͼ������Ľ��,ʵ�������ɵ�4�����ݿ�ʵ����һ�����˵���ص�
	
	
	/*���巽��,ʵ�ֶ������ɾ������
	 * ʵ��˼��
	 * ��ҵ�����ñ���ɾ����������,������һ���������ݲ���.���ɱ����������ݿ�,ƴдsql���ʵ��ɾ��.���ؽ��
	 * */
	public void deleteZhangwu(int Zwid) {
		//ƴдsql���
		try {
		String sql = "DELETE  FROM gjp_zhangwu WHERE zwid=?";
			qr.update(sql,Zwid);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("����ɾ��ʧ��");
		}
	}
	
	
	/*���巽��,ʵ�ֶ�����ı༭����
	 * ʵ��˼��
	 * �����û�¼��������Ϣ,����Ϣ��װ��zhangwu����.
	 * ���෽����serviceҵ������.������¼������������.ʵ�����ݿ�༭.
	 * 
	 * */
	public void editZhangWu(ZhangWu zw){
		//ƴдsql���
		try{
		String sql = "UPDATE gjp_zhangwu SET flname=?,money=?,zhanghu=?,createtime=?,description=? WHERE zwid=?";
		Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescription(),zw.getZwid()};
		qr.update(sql, params);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("�༭����ʧ��");
		}
	}	
	
	
	
	
	
	
	/*����������񷽷�
	 * ���෽��ҵ���service����,������zhangwu����*/
	public void addZhangWu(ZhangWu zw){
		//ƴдsql������
		try {
  String sql = "INSERT INTO gjp_zhangwu(flname,money,zhanghu,createtime,description) VALUES (?,?,?,?,?)";
  Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescription()};
		qr.update(sql, params);
		} catch (SQLException e) {
			System.out.println(e);
		throw new RuntimeException("�������ʧ��");
		}
	
	
	}
	

	
	
	
	
	public List<ZhangWu> select(String startDate, String endDate){
		try{
		String sql = "SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?";
		Object[] obj = {startDate , endDate};
		 return  qr.query(sql,new BeanListHandler<>(ZhangWu.class),obj);
			} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("���ݲ�ѯʧ��");
		}
	}
	
	/*���巽��,ʵ�ֲ�ѯ������������.�˷�����ҵ������.��ѯ�Ľ���Ӵ���,�����еļ�¼���ݴ��浽Bean�Ķ�����,�ٴ��浽List������*/
	public List<ZhangWu> selectAll(){
		String sql = "SELECT * FROM gjp_zhangwu";
		try {
		List<ZhangWu> list	= qr.query(sql, new BeanListHandler<>(ZhangWu.class));
		return list;
		} catch (SQLException e) {
		System.out.println(e);	
		throw new RuntimeException("��ѯ��������ʧ��");
		}
		
	}






	
}
