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
/*###19TCP上传客户端
 *  实现TCP图片上传客户端
 *  实现步骤:
 *    1. Socket套接字连接服务器
 *    2. 通过Socket获取字节输出流,写图片
 *    3. 使用自己的流对象,读取图片数据源
 *         FileInputStream
 *    4. 读取图片,使用字节输出流,将图片写到服务器
 *       采用字节数组进行缓冲
 *    5. 通过Socket套接字获取字节输入流
 *       读取服务器发回来的上传成功
 *    6. 关闭资源
 */
//表示把读到的内容全部写出到服务器
//注意此次由于上面代码while后面的大括号后面加了注释,导致while里面的循环写出异常.找了几个小时才找出来.切记以后左大括号后面不能注释	
/*API显示read()方法在读取字节时没有遇到-1,并且未到达文件结尾时,会线程等待,线程阻塞
 * 由于上传图片,客户端在循环写出,服务端在循环接收,所以当客户端遇到-1结束时.服务器依然在线程等待客户端,而客户端也在read也在等待
 * 服务器返回上传成功信息,所以造成客户端和服务器都在线程等待.所以当客户端while循环写完字节后要通知服务器,写完了*/
//给服务器写终止序列.表示写出结束st.shutdownOutput();
	//任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
	// 5. 通过Socket套接字获取字节输入流,读取服务器发回来的上传成功