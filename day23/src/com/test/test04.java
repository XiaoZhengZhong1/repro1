package com.test;

import java.io.File;
//import java.io.ObjectInputStream.GetField;  此行有黄色!号,注释后不影响运行结果.

public class test04 {
	/*###23.04_File类递归练习(按层级打印)
	* 需求:4,从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印, 例如:
aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,有eee这样的文件夹,eee中有fff.txt和ggg.txt,打印出层级来
aaa
	bbb.txt
	ccc.txt
	ddd.txt

	eee
		fff.txt
		ggg.txt
*1:接收文件夹路径,还是调用test01.get.Dir();方法.
*2:还是和前几个习题一样,写一个getxxx(File f)获取方法一个获取方法自动生成方法,打印层级,无需返回类型.就void
*3:要打印所有文件,还是要用获取是文件对象,调用listFile()返回File[],再遍历所有文件元素,并且做if判断,如果是文件就打印,如果是文件夹就
*递归,递归的参数就是循环到的文件夹元素变量.层级就是缩进\t就是Tab键(就是打印父类的子类文件,要往后缩进一次.)就是每打印一个文件或者文件夹,
*前面都需要缩进,按层级,最顶层的文件夹缩进0此,顶层的子类文件和文件夹是平级,缩进1次顶层的第二个子类中的文件夹和文件也是平级,缩进2次.
*4:层级需要打印,也要传入参数中getxxx(File f,int in);因为打印文件和文件夹前面都需要调用显示,直接父类和直到顶层的所有父类,
*比如F:\fi2\fi\4,这样系统才能识别找到文件和文件夹.所以层级缩进可以按照调用父类的次数来决定缩进次数,最底层的类缩进次数肯定最多.
*5:在数组变量循环中加一个缩进层级循环,初始值为0,打印一次就++一次,因为数组是按索引依次遍历的.遇到文件夹递归,参数中.
*getxxx(元素文件夹索引,in+1)因为它前面还是文件,它本身是文件夹(因为文件和文件夹在硬盘中就算是平级,也是文件夹在最前面,)递归把in+1返回
*,获取方法参数中,重新循环.in+1后,就和之前的文件相隔了一个缩进.
*/
	public static void main(String[] args) {
		File Dir = test01.getDir();
		getCenji(Dir,0);	//写获取方法,给参数初始化,ctrl+1生成方法
	
	}

	public static void getCenji(File Dir, int in) {
			 File[] f = Dir.listFiles();
			 for (File fie : f) {
				for (int i = 0; i <= in; i++) {	/*循环缩进层级.外循环每循环一次表示调用一次直接父类到顶级父类之间的次数.
				如果不遇到文件夹,被走递归,就只输出1次缩进0=0*/
					System.out.print("\t");	
				}
				 System.out.println(fie);	//表示遍历的每一个元素文件和文件夹,文件夹打印后再递归遍历里面的文件夹.
				if(fie.isDirectory()){		//如果是文件夹.就递归,继续上面的程序.
					getCenji(fie,in + 1);//表示遇到文件夹缩进层级就要0+1,表示调用了顶级父类文件夹名称1次.是顶层的子类要缩进
				}
			}
		/*	Run As:
		 *  F:\fi2
				F:\fi2\fi
					F:\fi2\fi\4
						F:\fi2\fi\4\1.txt
						F:\fi2\fi\4\2.rtf
						F:\fi2\fi\4\3.rtf*/
	}

}
