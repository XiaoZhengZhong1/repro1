package com.socket_Sever;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class text2 {
	
	public static void main(String[] args) throws IOException {
//		###26.20_������(��ϰ)
//		* �ͻ�����������ϴ��ļ�(�����ͻ�����Ŀ��������)
//		* 1:��ʾ����Ҫ�ϴ����ļ�·��.��֤·���Ƿ����,�Լ��Ƿ����ļ���.
		File file = getfile();
//		* 2:�����ļ������ͻ���.
		Socket st = new Socket("127.0.0.1",12346);
		BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));
		PrintStream ps = new PrintStream(st.getOutputStream());
			ps.print(file.getName());
//		* 6:���ս��,������ھ͸�����ʾ,����ֱ���˳�.
			String cba = br.readLine();	//��ȡ���������ص�,���ںͲ�����
			if("�ļ�����".equals(cba)){
				System.out.println("���ϴ����ļ��Ѵ���,�벻Ҫ�ظ��ϴ�");
				st.close();			//��ʾ����ļ�����,�͹ر�ͨ�Ų���.
				return;				//��������.����ִ���������. 
			}
//		*7:���������,����FileInputStream��ȡ�ļ�,д��������.
//FileInputStream ���ڶ�ȡ����ͼ������֮���ԭʼ�ֽ�����Ҫ��ȡ�ַ������뿼��ʹ�� FileReader
			FileInputStream fil = new FileInputStream(file);
				byte[] arr = new byte[8192];
					int len;
			while((len = fil.read(arr)) != -1){
				ps.write(arr, 0, len);	//ps����д���ַ���Ҳ����д���ַ�.
			}
			fil.close();	//�ر�������
			st.close();  //��Ϊ����ps�ֿ�����һ��ͨ�Ų���.����Ҫ�ٴιر�.
	}

	private static File getfile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ�·��");
		while(true){
			String line = sc.nextLine();
			File file = new File(line);
			if(!file.exists()){
				System.out.print("�������·��������,����������:");
			}else if(file.isDirectory()){
				System.out.print("����������ļ���·��.�����������ļ�·��:");
			}else{
				return file;
			}
			sc.close();
		}
		
		
	}
	
}

