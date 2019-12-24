package com.TCP2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class serverDemo2 {
/*###20TCP�ϴ�������
    *  TCPͼƬ�ϴ�������
    *   1. ServerSocket�׽��ֶ���,�����˿�8000
    *   2. ����accept()��ȡ�ͻ��˵����Ӷ���
    *   3. �ͻ������Ӷ����ȡ�ֽ�������,��ȡ�ͻ��˷���ͼƬ
    *   4. ����File����,���ϴ��ļ���
    *       �ж��ļ��д���, ����,�ڴ����ļ���
    *   5. �����ֽ������,����Ŀ��File���������ļ���
    *   6. �ֽ�����ȡͼƬ,�ֽ�����ͼƬд�뵽Ŀ���ļ�����
    *   7. ���ϴ��ɹ���д�ͻ���
    *   8. �ر���Դ*/
	public static void main(String[] args) throws IOException {
		ServerSocket sst = new ServerSocket(50003);
		Socket st = sst.accept();
		//3. �ͻ������Ӷ����ȡ�ֽ�������,��ȡ�ͻ��˷���ͼƬ
		InputStream in = st.getInputStream();
		//4. ����File����,�󶨽����ϴ����ļ���,���Ǵ���һ���ļ���׼������ͼƬ
		File fi = new File("F:\\tupian");//����һ���ļ�·������,�����и�һ���ļ���·��
		//�ж��ļ��д���, ����,�ڴ����ļ���
		if(!fi.exists()){//��ʾ����ļ��в�����
			fi.mkdirs();//�͸��ݲ�������ַ����һ���ļ���
		}
		//5. �����ļ��ֽ������,��ͼƬд����ļ����е��ļ���,ע���ļ�����Ŀ¼,Ŀ¼��Ҫ�о����ļ�װ�ļ�
		//Ϊ�˷�ֹ�ļ������õ�ǰ����ֵ����λ�����������ʾ�ļ���
		String fileName = System.currentTimeMillis() + new Random().nextInt(99999) + ".jpg";
		FileOutputStream fos = new FileOutputStream(fi + "\\" + fileName);
		int len = 0;
		byte[] data = new byte[1024];
		while((len = in.read(data))!=-1){
			fos.write(data, 0, len);
		}
		OutputStream out = st.getOutputStream();
		out.write("�ϴ��ɹ�".getBytes());
		st.close();
		fos.close();
		sst.close();
	}

}
