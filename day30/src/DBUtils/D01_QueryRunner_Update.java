package DBUtils;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

public class D01_QueryRunner_Update {
/*###03QueryRunner���update��������
a: ��������
ʹ��QueryRunner���update(Connection conn, String sql, Object... params)������ɱ����ݵ����ӡ�ɾ�������²���
	*  Object...param �ɱ����,Object����,SQL�������?ռλ��
	*  ���ݿ����Ӷ���,�Զ���Ĺ����ഫ��*/
	
	
	
	private static Connection con = Config_Utils.getConnection();/*�Ѵ������ļ��������л�ȡ�����ݿ����Ӷ���con��װ
	��˽�еĹ���ĳ�Ա����,��ʾֻ���ڱ���ʹ��*/
	public static void main(String[] args) throws SQLException {
		//insert();
		//update();
		delete();
	}
//DBUtiles���߰��еĵ�һ������QueryRunner

//��ʾ����insert into
//���µ����SQL���߰�dbutils�е�QueryRunner���е�Update(Connection conn, String sql, Object... params)����,ʵ������
	public static void insert() throws SQLException{
		//1:����QueryRunner�����
		QueryRunner qr = new QueryRunner();
		//2:ƴдsql�������insert into
		String sql = "INSERT INTO sort(sname,sprice,sdesc)VALUES(?,?,?)";
		//3:����Object����,���� ? ������ֵ
		Object[] params = {"ˮ��",9.9,"����"};
		//4:����QueryRunner���е�update����
		int row = qr.update(con, sql, params);
		System.out.println(row);
		//5:����DbUtils���е�closeQuery������������;
		DbUtils.closeQuietly(con); //DBUtils���еĵڶ���������DbUtils
		}


	
//��ʾɾ������delete
	public static void delete() throws SQLException{
		//1:����QueryRunner�����
	QueryRunner qr = new QueryRunner();
	//2:ƴдsql�������insert into
	String sql = "DELETE FROM sort where sid=?";
	//4:����QueryRunner���е�update����
	 int row = qr.update(con, sql, 1);
	System.out.println(row);
	DbUtils.closeQuietly(con);
	}
	
	
	
//��ʾ���� update
	public static void update() throws SQLException{
		//1:����QueryRunner�����
		QueryRunner qr = new QueryRunner();
		//2:ƴдsql������� update
		String sql = "UPDATE sort SET sname=?,sprice=? WHERE sid=?";
		//3:����Object����,���� ? ������ֵ
		Object[] params = {"С��Ϻ",25,1};
		//4:����QueryRunner���е�update����
		int row = qr.update(con, sql, params);
		System.out.println(row);
		//5:����DbUtils���е�closeQuery������������;
		DbUtils.closeQuietly(con);;
	}

}
