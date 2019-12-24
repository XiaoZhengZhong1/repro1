package com.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;		//表示文件可能出现不存在的异常,此行会出现黄色!号,注释掉不影响运行.
import java.io.FileOutputStream;
import java.io.IOException;



public class test03 {
	/*###23.03_File类递归练习(拷贝)
	* 需求:3,从键盘接收两个文件夹路径,把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
	* 1:接收两个文件路径,可以调用两次test01中的getDir()方法.获取两个文件夹路径.
	* 2:写一个拷贝copy(...);构造方法.自动生成get()方法.
	* 3:在获取拷贝方法中new File(拷贝目的地,拷贝来源.getName);得到拷贝后的对象.对象调用mkdir();创建拷贝得到的名称一样 的文件夹
	* 4:用拷贝后的对象调用,listFile()方法,返回	File[],拷贝对象变成数组元素.
	* 5;遍历数组,在遍历中做判断,if{是文件,就用字节读写流(6行标准代码)拷贝,关流},else{是文件夹,就递归}
	* 6:在主方法中,把拷贝方法做equals判断.if(路径相同){就是重复文件夹,}就提示.else{调用拷贝方法}因为方法中有新键文件夹的代码,
	* 如果文件夹路径名称相同,创建新文件夹,到循环到递归,又到方法上,还是那个文件夹又创建一次,又到循环到递归......就无限循环了,自动计算
	* 内存溢出,南屏为止.
	* */
	public static void main(String[] args) throws IOException {
		File fi = test01.getDir();
		File fi2 = test01.getDir();
			if(fi2.equals(fi)){
				System.out.println("该文件已存在,请重新输入非此类的子类文件.");
			}else{
				copy(fi,fi2);	//注意拷贝是参数顺序,(拷贝内容,拷贝目的地)

			}
				}

	public static void copy(File fi, File fi2) throws IOException {
		File newfi4 = new File(fi2,fi.getName());	/*此行因为多了双引号""("fi2,fi"."getName()")出错浪费一个小时
		时间,API中public File(String parent, String child)如果 parent 为 null，则创建一个新的 File 实例,空的一定是父类
 如果 child 为 null会抛出NullPointerException,文件路径本身就是String类型.无需加"",我定义是fi2是null,所以是parent(父类),
 fi有文件和文件夹是子类,我想要根据fi的文件夹名称创建新的文件夹,所以要getName();
*/
			newfi4.mkdir(); //表示把上面获取到的文件夹路径名称,写入newfi4中.
		File[] fi5 = fi.listFiles();	//注意一定要遍历子类有文件夹和文件内容的文件夹子类对象
			for (File fie : fi5) {
			if(fie.isFile()){
				BufferedInputStream bis = 
						new BufferedInputStream(new FileInputStream(fie));	//表示是文件就用标准字节输入流读文件.
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(new File(newfi4,fie.getName())));
				/*表示用标准字节输出流输出文件,在转换桥梁参数中重复第37行代码,把37行中在父类fi2中根据子类fi的文件夹名新创建的
				 * 文件夹对象newfi4,当作父类,把37行中的子类fi返回的数组fi5遍历后的变量fie当作子类.根据子类fie的文件名称在
				 * 父类newfi4中创建新的文件名称.这就是我想要的结果,输出流缓冲区bos就是fi2的子类newfi4的子类*/	
				int i;
					while((i = bis.read()) != -1){	//表示在缓冲区读fi返回的数组fi5的所有元素字节个数,
						bos.write(i);	//把读到的元素字节写到fi2的子类newfi4的子类bos中.
						
					}
				
				
					bis.close();	//流用完马上关掉.
					bos.close();
						}else{		//不是文件,那就是文件夹.
						copy(fie,newfi4);	//递归,继续上面的方法.
					}
				}
	
	
	}

}
