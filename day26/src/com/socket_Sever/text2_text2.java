package com.socket_Sever;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class text2_text2 {

	public static void main(String[] args) throws IOException {
//		###26.20_������(��ϰ)
//		* �ͻ�����������ϴ��ļ�(������������������)
//		* 3:�������̷߳�����.
		ServerSocket server = new ServerSocket(12346);//�����˿ں�(�����ȿ��������������˿ں�,�����յ��ͻ�������)
		while(true){
			final Socket socket = server.accept();
			new Thread(){
				public void run() {
//					* 4:��ȡ�ļ���.
					try {
						InputStream is = socket.getInputStream();
						BufferedReader br2 = new BufferedReader(new InputStreamReader(is));/*ע��
						�ϴ���,���ô���ת������������socket.getInputStream()Alt+shift+r��ȡ������*/
						PrintStream ps2 = new PrintStream(socket.getOutputStream());
						String fileName = br2.readLine();
//						* 5:�ж��ļ��Ƿ����,��������ؿͻ���.					
						File dir = new File("abc");	//����һ���ļ���.
								dir.mkdir();		//����һ���ļ���.
						File file = new File(dir, fileName);	//��ʾ�ѽ��յ����ļ�����װ���Ӽ��ļ�����,
							if(file.exists()){					//��ʾ����������Ѿ����ڸ��ļ�
								ps2.println("�ļ�����");
								socket.close();   				//��ʾ����ļ�����.�Ϳ��Թر�ͨ��
									return;   //��ʾ����,����ִ�����´���.
							}else {
								ps2.println("�ļ�������");
								  }
//		 8:����FileOutputStream�������ȡ������,���浽����					
					FileOutputStream fos = new FileOutputStream(file);	
					byte[] arr2 = new byte[8192];
					int len2;
					while((len2 = is.read(arr2)) != -1){
						fos.write(arr2, 0, len2);
						fos.close();
						socket.close();
					}
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}.start();
			server.close();   //�رշ�����.���������,������ر�,��Ϊ����while�е���,����Ҫ��whlie����ǰ�ر�.
		}	
		
		



	}
	
}
