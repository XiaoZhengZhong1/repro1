package com.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
/*###01����ģ��
  *A:����ģ��
     TCP/IPЭ���е��Ĳ�ֱ���Ӧ�ò㡢����㡢��������·�㣬ÿ��ֱ���ͬ��ͨ�Ź��ܣ�������������Ĳ������ϸ�ؽ��⡣
       ��·�㣺��·�������ڶ���������ͨ����ͨ���Ƕ�ĳЩ���������豸������Э�飬������Թ��ˡ������ṩ��������
       ����㣺�����������TCP/IPЭ��ĺ��ģ�����Ҫ���ڽ���������ݽ��з��飬���������ݷ��͵�Ŀ�������������硣
       ����㣺��Ҫʹ����������ͨ�ţ��ڽ�������ͨ��ʱ�����Բ���TCPЭ�飬Ҳ���Բ���UDPЭ�顣
       Ӧ�ò㣺��Ҫ����Ӧ�ó����Э�飬����HTTPЭ�顢FTPЭ��ȡ�

###02IP��ַ
 *A:IP��ַ
      ��TCP/IPЭ���У������ʶ�ž���IP��ַ��������Ψһ��ʶһ̨�������
      Ŀǰ��IP��ַ�㷺ʹ�õİ汾��IPv4��������4���ֽڴ�С�Ķ�����������ʾ���磺00001010000000000000000000000001��
      ���ڶ�������ʽ��ʾ��IP��ַ�ǳ��������ʹ������ͨ���ὫIP��ַд��ʮ���Ƶ���ʽ��
      ÿ���ֽ���һ��ʮ��������(0-255)��ʾ�����ּ��÷��š�.���ֿ����� ��192.168.1.100��
      127.0.0.1 Ϊ����������ַ(���ػػ���ַ)
###03�˿ں�
 *A:�˿ں�
    ͨ��IP��ַ�������ӵ�ָ�������������������Ŀ�������е�ĳ��Ӧ�ó��򣬻���Ҫָ���˿ںš�
    �ڼ�����У���ͬ��Ӧ�ó�����ͨ���˿ں����ֵġ�
    �˿ں����������ֽڣ�16λ�Ķ�����������ʾ�ģ�����ȡֵ��Χ��0~65535��
    ���У�0~1023֮��Ķ˿ں�����һЩ֪*/



//java.net���µ���inetAddress ����û�й��췽��,����˽����,���Բ���new �����ʾ������Э�� (IP) ��ַ��


//ѧϰ����java.net.InetAddress;��������4����������
// ������һ��̬����. static InetAddress getLocalhost()������ʾ���ر�������.����Ƿ���ֵ����InetAddress����
//��һ����̬����static InetAddress  getByName(String host)  �ڸ����������������ȷ�������� IP ��ַ��

//���л��зǾ�̬����
//String getHostAddress()   ���� IP ��ַ�ַ��������ı�������ʽ����
//String getHostName() 	 ��ȡ�� IP ��ַ����������

	public class inetAddressDemo1 {
		public static void main(String[] args) throws UnknownHostException {
		//demo();
		demo2();
		}
	
		//String getHostAddress() String getHostName()	
		public static void demo() throws UnknownHostException{
		 InetAddress inet = InetAddress.getLocalHost();//��ȡ��������
		 String ip = inet.getHostAddress();//��ȡ����ip
		 String name = inet.getHostName();//��ȡ����������
		 System.out.println(ip + "  "  + name);
	
	}

	public static void demo2() throws UnknownHostException{
		InetAddress ip = InetAddress.getByName("192.168.43.189");//ͨ����������,��ȡ����ip
		System.out.println(ip);
		 
	}
	}
