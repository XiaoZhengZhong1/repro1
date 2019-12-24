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
//		###26.20_网络编程(练习)
//		* 客户端向服务器上传文件(分析客户端题目操作步骤)
//		* 1:提示输入要上传的文件路径.验证路径是否存在,以及是否是文件夹.
		File file = getfile();
//		* 2:发送文件名到客户端.
		Socket st = new Socket("127.0.0.1",12346);
		BufferedReader br = new BufferedReader(new InputStreamReader(st.getInputStream()));
		PrintStream ps = new PrintStream(st.getOutputStream());
			ps.print(file.getName());
//		* 6:接收结果,如果存在就给与提示,程序直接退出.
			String cba = br.readLine();	//读取服务器返回的,存在和不存在
			if("文件存在".equals(cba)){
				System.out.println("您上传的文件已存在,请不要重复上传");
				st.close();			//表示如果文件存在,就关闭通信插座.
				return;				//结束方法.不再执行下面代码. 
			}
//		*7:如果不存在,定义FileInputStream读取文件,写出到网络.
//FileInputStream 用于读取诸如图像数据之类的原始字节流。要读取字符流，请考虑使用 FileReader
			FileInputStream fil = new FileInputStream(file);
				byte[] arr = new byte[8192];
					int len;
			while((len = fil.read(arr)) != -1){
				ps.write(arr, 0, len);	//ps可以写出字符串也可以写出字符.
			}
			fil.close();	//关闭输入流
			st.close();  //因为调用ps又开启了一次通信插座.所有要再次关闭.
	}

	private static File getfile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件路径");
		while(true){
			String line = sc.nextLine();
			File file = new File(line);
			if(!file.exists()){
				System.out.print("您输入的路径不存在,请重新输入:");
			}else if(file.isDirectory()){
				System.out.print("您输入的是文件夹路径.请重新输入文件路径:");
			}else{
				return file;
			}
			sc.close();
		}
		
		
	}
	
}

