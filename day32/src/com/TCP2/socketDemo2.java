package com.TCP2;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class socketDemo2{
	public static void main(String[] args) throws IOException {
		 Socket socket = new Socket("127.0.0.1", 50003);
	      OutputStream out = socket.getOutputStream();
	      FileInputStream fis = new FileInputStream("H:\\ws.JPG");
	      		int len = 0 ;
	      byte[] bytes = new byte[1024];
	      while((len = fis.read(bytes))!=-1){
	        out.write(bytes, 0, len);
	      }			
		socket.shutdownOutput();
		InputStream in = socket.getInputStream();
		len = in.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		socket.close();
		fis.close();
	}

}
/*###19TCP�ϴ��ͻ���
 *  ʵ��TCPͼƬ�ϴ��ͻ���
 *  ʵ�ֲ���:
 *    1. Socket�׽������ӷ�����
 *    2. ͨ��Socket��ȡ�ֽ������,дͼƬ
 *    3. ʹ���Լ���������,��ȡͼƬ����Դ
 *         FileInputStream
 *    4. ��ȡͼƬ,ʹ���ֽ������,��ͼƬд��������
 *       �����ֽ�������л���
 *    5. ͨ��Socket�׽��ֻ�ȡ�ֽ�������
 *       ��ȡ���������������ϴ��ɹ�
 *    6. �ر���Դ
 */
//��ʾ�Ѷ���������ȫ��д����������
//ע��˴������������while����Ĵ����ź������ע��,����while�����ѭ��д���쳣.���˼���Сʱ���ҳ���.�м��Ժ�������ź��治��ע��	
/*API��ʾread()�����ڶ�ȡ�ֽ�ʱû������-1,����δ�����ļ���βʱ,���̵߳ȴ�,�߳�����
 * �����ϴ�ͼƬ,�ͻ�����ѭ��д��,�������ѭ������,���Ե��ͻ�������-1����ʱ.��������Ȼ���̵߳ȴ��ͻ���,���ͻ���Ҳ��readҲ�ڵȴ�
 * �����������ϴ��ɹ���Ϣ,������ɿͻ��˺ͷ����������̵߳ȴ�.���Ե��ͻ���whileѭ��д���ֽں�Ҫ֪ͨ������,д����*/
//��������д��ֹ����.��ʾд������st.shutdownOutput();
	//�κ���ǰд������ݶ��������ͣ����Һ�� TCP ������������ֹ���С�
	// 5. ͨ��Socket�׽��ֻ�ȡ�ֽ�������,��ȡ���������������ϴ��ɹ�