package com.exception;

public class exception191 {
	/*###19.01_�쳣(�쳣�ĸ����ͷ���)
	* A:�쳣�ĸ���
		* �쳣����Java���������й����г��ֵĴ���
	* B:�쳣�ķ���
		* ͨ��API�鿴Throwable
		* Error
			* ������崻�,���ݿ������
		* Exception
	C:�쳣�ļ̳���ϵ
		* Throwable
			* Error	
			* Exception
				* RuntimeException*/

	public static void main(String[] args) {
//ʾ���쳣,ѧϰ������ķ���.���쳣Ҫ���쳣������´������Ͽ�.
		demo c = new demo();
		int d = c.division(10,0);	//��Ϊϵͳ�涨��������Ϊ0,���������쳣.
		System.out.println(d);
/*����������,
 * Exception in thread "main" java.lang.ArithmeticException: / by zero	//��ʾ����ǳ�0�쳣������API��
at com.exception.demo.division(exception1.java:38)	//��ʾ�����˵�38��(���)�ŵ����쳣,
at com.exception.exception1.main(exception1.java:21)	//��ʾ�쳣�����Դͷ�ڵ�21�д���(��ֵ)
*/
	
	}
	
}
class demo {
public  int division(int a,int b){
		
		return a / b;
	}
		
}
/*###19.02_�쳣(JVMĬ������δ����쳣��)
* A:JVMĬ������δ����쳣��
	* main�����յ��������ʱ,�����ִ���ʽ:
	* a:�Լ��������⴦��,Ȼ���������
	* b:�Լ�û����ԵĴ���ʽ,ֻ�н�������main��jvm������
	* jvm��һ��Ĭ�ϵ��쳣�������,�ͽ����쳣���д���.
	* �������쳣������,�쳣����Ϣ.�쳣���ֵ�λ�ô�ӡ���˿���̨��,ͬʱ������ֹͣ����
* B:������ʾ
	* JVMĬ����δ����쳣*/