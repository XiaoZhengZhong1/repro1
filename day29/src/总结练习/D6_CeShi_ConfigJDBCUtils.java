package �ܽ���ϰ;

import java.sql.Connection;

public class D6_CeShi_ConfigJDBCUtils {
//����D5_Config_Utils����д�����������ļ�����
	public static void main(String[] args) {
		Connection con = D5_Config_Utils.getConnection();
		System.out.println(con);
	}

}
