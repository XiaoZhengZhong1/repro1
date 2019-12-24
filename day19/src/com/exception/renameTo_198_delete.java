package com.exception;

import java.io.File;

public class renameTo_198_delete {
	/*###19.16_File类(File类的重命名和删除功能)
	* A:重命名和删除功能
		* public boolean renameTo(File dest):把文件重命名为指定的文件路径
		* public boolean delete():删除文件或者文件夹
	* B:重命名注意事项
		* 如果路径名相同，就是改名。
		* 如果路径名不同，就是改名并剪切。
	* C:删除注意事项：
		* Java中的删除不走回收站。
		* 要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
//renameto();---如果路径名相同，就是改名。如果路径名不同，就是改名并剪切。
*/
//改名,rename()
	public static void main(String[] args) {
		File f = new File("ccc.txt");
		File f2 = new File("e.txt");
		System.out.println(f.renameTo(f2));	//表示把f的文件名改成f2d,也可以改到别的盘符下面. 

//删除文件,delete();
		File f3 = new File("xxx.txt");
		System.out.println(f3.delete());  //表示删f3中的内容.如果要删除文件夹,文件夹必须是空的,删除不走回收站.
	}

}
/*###19.17_File类(File类的判断功能)
* A:判断功能
	* public boolean isDirectory():判断是否是目录,文件夹.
	* public boolean isFile():判断是否是文件
	* public boolean exists():判断是否存在
	* public boolean canRead():判断是否可读----window系统认为所有文件都是可读的,
	* public boolean canWrite():判断是否可写---window系统中如果自己setWrite设置成可写或者不可写,就是可写或者不可写.
	* public boolean isHidden():判断是否隐藏
	* 
	* 
	* */