package com.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*###14TCP�ķ���������accept����
   A:TCP�ķ���������accept����
     /*
      *  ʵ��TCP����������
      *  ��ʾ������������� java.net.ServerSocket
      *  ���췽��:
      *    ServerSocket(int port) ���ݶ˿ں�
      *  
      *  ����Ҫ������: ����Ҫ��ÿͻ��˵��׽��ֶ���Socket
      *    Socket  accept()*/
	public class serversocket {
		public static void main(String[] args) throws IOException {
			//1:��������������,����˿ں�(�˿ںű���Ϳͻ���һ��),�����˿ں�(�����ȿ��������������˿ں�,�����յ��ͻ�������)
			ServerSocket sst = new ServerSocket(60000);
			//2:���÷��������еĽ��շ���,���տͻ��˷��͵��׽���,���ؿͻ��������.
			Socket st = sst.accept();
			System.out.println(st);			
			//3:�ÿͻ��˶�����û�ȡ����������,��ȡ����������.
			InputStream in = st.getInputStream();
			//4:�����ֽ�����,�����������տͻ������ݵ�����.	
			byte[] data = new byte[1024];
			//5:��ȡ��������,���ض�ȡ����.
			int length = in.read(data);
			//6:�����ӡ��ȡ������,�����������0��������󳤶�,��������ת���ַ���.
			System.out.println(new String(data,0,length));
			//7:�ý��յĿͻ��˶���,���û�ȡ���������,����һ�����������.
			OutputStream out = st.getOutputStream();
			//8:���������,��ͻ��˷�����Ϣ,����Ϣת�����ֽ�����,�ٷ���.
			out.write("�ͻ����".getBytes());
			//9:����	
				sst.close();
				st.close();
		}
		
}
