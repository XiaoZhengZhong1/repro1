package com.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class next2 {
public static void demo() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("hhh.txt"));
		TreeMap<Character, Integer> tm = new TreeMap<>();
			int i;
			while((i = br.read()) != -1){
				char c = (char)i;
				tm.put(c,!tm.containsKey(c) ? 1 : tm.get(c) + 1);	/*表示键是每次循环读出的字符,因为TreeMap
				集合添加是不可重复的.值就是题目要求的次数,值中三元运算符表示如果不包含一样的键,值为1.包含就是之前的值+1(注意
				是先有1,后有+1,所以三元运算是关系表达式是  !不包含.*/
			}
			br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
			for (Character key : tm.keySet()) {
				switch(key){
				case '\t':		//如果键是制表符
				bw.write("\\t" +  "=" + tm.get(key));	//就转义制表符再写出.并写出值对应的值
				break;
				case '\r':	//如果键是换行.
				bw.write("\\r" + "=" + tm.get(key));	//就转义换行符再写出.并写出值对应的值
				break;
				case '\n':	//如果键是回车.
				bw.write("\\n" + "=" + tm.get(key));	//就转义回车符再写出.并写出值对应的值
				break;
				default:	//如果上面三个都不是.
				bw.write(key + "=" + tm.get(key));	//就直接写出键.并写出值对应的值
				break;
				}
				bw.newLine();	//表示换行,因为switch循环语句结束后,必定有一个要写出.就写出一个换行一次.
			
			}
			bw.close();
	}

}
