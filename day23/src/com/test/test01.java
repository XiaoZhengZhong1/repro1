package com.test;

import java.io.File;
import java.util.Scanner;

public class test01 {
/*###23.01_File类递归练习(统计该文件夹大小)
* 需求:,从键盘接收一个文件夹路径,统计该文件夹大小
* 1:定义两个方法,一个接收路径的方法,一个条件文件夹大小的方法.
* 2:定义接收路径方法,返回的是文件File,键盘录入没有参数列表.从键盘接收就要创建Scanner.并提示输入文件夹.
* 3:想要接收一个文件夹路径.就要不断的键盘录入,把录入结果封装成文件对象.做各种判断.路径是否存在.是不是文件路径.直到格式正确return文件对象
* 不断的录入就是while无限循环.在循环中录入.做if判断.
* 4:上面接收路径成功.就要创建一个统计文件夹大小的方法.(文件夹大小无法直接输出,输出会是0)就是所有文件夹中所有文件的字节个数.返回的是统计
* 结果Long(长整型),统计就是计算求和,首先就要定义一个变量.代表和,再做相加统计.因为文件字节如果很多,和的数值可能会很大,就定义成Long.
* 参数列表就是录入的文件对象.
* 5:定义变量代表和.用文件对象调用FileList()方法,把文件对象返回到File[]中.
* 6:遍历数组,在遍历中做判断,如果元素是文件,和=和+文件.length.如果是文件夹,接用递归方法.
* 
* 
* */
	public static void main(String[] args) {
			File dir = getDir() ;	//表示调用获取路径方法.得到路径对象dir,方便下面调用获取文件夹长度方法中,参数赋值.
		System.out.println(getFlieLength(dir));	//表示打印调用获取文件夹长度方法的结果.参数是上面方法获取的对象.
		
	}
	public static File getDir(){
		Scanner sc = new Scanner(System.in);
			System.out.println("请输入文件夹路径");		//注意文件夹就是H:\haoya 盘符中的都是文件夹.格式盘符后一个\
			while(true){
				String ine = sc.nextLine();	//注意录入一定要在循环中,才能多次录入.直到格式正确.
				File dir = new File(ine);	//把录入结果封装成文件,才能做判断.
				if(!dir.exists()){			//注意这里判断路径不存在,一定要加 ! (非),此次没加!出错浪费半小时.
					System.out.println("您输入的文件夹路径不存在,请重新输入文件夹路径.");
				}else if(dir.isFile()){
					System.out.println("您输入的是文件路径,请重新输入文件夹路径.");
				}else{
					return dir;		       //文件路径存在,不是文件路径,那只能是文件夹路径了.
				}
				sc.close();	                //注意关闭键盘录入在运行时不要关闭,否则只能录入一次.不能多次录入.做判断.
			}
			
	}
	public static long getFlieLength(File dir){
		long len = 0;					//定义和为len.文件大字节数也会很大,所有要定义成long.
		File[]	fi = dir.listFiles();//因为要判断文件夹对象dir中是否包含文件夹,还要把文件长度相加.想要把dir中内容遍历,要数组
	       for (File file : fi) {
				if(file.isFile()){
					len = len + file.length();
				}else {
					len = len + getFlieLength(file);	//递归方法中调用本方法,把方法再执行一次,把结果放这里相加.
				}
				
	        }
			return len;
	}
}
