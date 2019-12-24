package com.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
/*###12TCP�Ŀͻ��˺ͷ�����
   *A:TCP�Ŀͻ��˺ͷ�����
     TCPͨ��ͬUDPͨ��һ��������ʵ����̨�����֮���ͨ�ţ�ͨ�ŵ����˶���Ҫ����socket����
      �������ڣ�UDP��ֻ�з��Ͷ˺ͽ��նˣ������ֿͻ�����������ˣ������֮���������ط������ݡ�
      ��TCPͨ�����ϸ����ֿͻ�����������˵ģ���ͨ��ʱ���������ɿͻ���ȥ���ӷ������˲���ʵ��ͨ�ţ�
      �������˲������������ӿͻ��ˣ����ҷ������˳�����Ҫ�����������ȴ��ͻ��˵����ӡ�
      ��JDK���ṩ������������ʵ��TCP����һ����ServerSocket�࣬���ڱ�ʾ�������ˣ�һ����Socket�࣬���ڱ�ʾ�ͻ��ˡ�
      ͨ��ʱ�����ȴ�������������˵�ServerSocket���󣬸ö����൱�ڿ���һ�����񣬲��ȴ��ͻ��˵����ӣ�
	  Ȼ�󴴽�����ͻ��˵�Socket������������˷����������󣬷���������Ӧ�������߽������ӿ�ʼͨ�š�*/
	
	/*ʵ��TCP�ͻ���,���ӵ�������
	    *  �ͷ�����ʵ�����ݽ���
	    *  ʵ��TCP�ͻ��˳������ java.net.Socketʵ��TCP�ͻ���,���ӵ�������
	    *  �ͷ�����ʵ�����ݽ���
	    *  ʵ��TCP�ͻ��˳������ java.net.Socket*/
	public class socketDemo{
		public static void main(String[] args) throws IOException {
		//1:�����ͻ��˶���,����pi�Ͷ˿ں�,���ӷ�����.
		Socket st = new Socket("127.0.0.1", 60000);
		//2:���ö����е�,�ֽ����������,��ȡ�������.
		OutputStream out = st.getOutputStream();
		//3:���������,�������д������.
		out.write("��÷�����".getBytes());
		//4:�ÿͻ��˶���,��ȡ����������,������ȡ��������������
		InputStream in = st.getInputStream();	;
		//5:����һ������,�������շ�������������
		byte[] data = new byte[1024];
		//6:�û�ȡ������������,��ȡ���е�����,����������.���ض�ȡ�ĳ���.
		int len = in.read(data);
		//7:�����ȡ����������,������0�����������ȫ������
		System.out.println(new String(data,0,len));
		//8:����
		st.close();
		
		}
}
