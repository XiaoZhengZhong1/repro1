package DBUtils;

public class D02_ResultSetHandler {
/*###07JavaBean��
	* A: JavaBean��
		* a: ����
			* JavaBean����һ���࣬�ڿ����г��÷�װ���ݡ�������������
				1.	��Ҫʵ�ֽӿڣ�java.io.Serializable ��ͨ��ʵ�ֽӿ��ⲽ��ʡ���ˣ�����Ӱ�����
				2.	�ṩ˽���ֶΣ�private ���� �ֶ���;
				3.	�ṩgetter/setter������
				4.	�ṩ�޲ι���
			
###08DBUtils��������������ķ�ʽ
	* A: DBUtils��������������ķ�ʽ
		* a: QueryRunnerʵ�ֲ�ѯ����
			*	query(Connection conn, String sql, ResultSetHandler<T> rsh, Object... params) ��������ɱ����ݵĲ�ѯ����
		* b: ResultSetHandler�����������
			* ArrayHandler	��������еĵ�һ����¼��װ��һ��Object[]�����У������е�ÿһ��Ԫ�ؾ���������¼�е�ÿһ���ֶε�ֵ
			* ArrayListHandler	��������е�ÿһ����¼����װ��һ��Object[]�����У�����Щ�����ڷ�װ��List�����С�
			* BeanHandler	��������е�һ����¼��װ��һ��ָ����javaBean�С�
			* BeanListHandler	���������ÿһ����¼��װ��ָ����javaBean�У�����ЩjavaBean�ڷ�װ��List������
			* ColumnListHandler	���������ָ�����е��ֶ�ֵ����װ��һ��List������
			* ScalarHandler	�������ڵ����ݡ�����select count(*) from �������
			* MapHandler	���������һ�з�װ��Map������,Key ����, Value ��������
			* MapListHandler	���������һ�з�װ��Map������,Key ����, Value ��������,Map���ϴ洢��List����
			* ע��:query�����ķ���ֵ���� <T> ����,����ķ���ֵ������������ʽ�仯���仯.
			* ע��:query�����ķ���ֵ���� <T> ����,����ķ���ֵ������������ʽ�仯���仯.
			* */
	public static void main(String[] args) {

	}

}
