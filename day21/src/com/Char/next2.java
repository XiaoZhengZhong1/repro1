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
				tm.put(c,!tm.containsKey(c) ? 1 : tm.get(c) + 1);	/*��ʾ����ÿ��ѭ���������ַ�,��ΪTreeMap
				��������ǲ����ظ���.ֵ������ĿҪ��Ĵ���,ֵ����Ԫ�������ʾ���������һ���ļ�,ֵΪ1.��������֮ǰ��ֵ+1(ע��
				������1,����+1,������Ԫ�����ǹ�ϵ���ʽ��  !������.*/
			}
			br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
			for (Character key : tm.keySet()) {
				switch(key){
				case '\t':		//��������Ʊ��
				bw.write("\\t" +  "=" + tm.get(key));	//��ת���Ʊ����д��.��д��ֵ��Ӧ��ֵ
				break;
				case '\r':	//������ǻ���.
				bw.write("\\r" + "=" + tm.get(key));	//��ת�廻�з���д��.��д��ֵ��Ӧ��ֵ
				break;
				case '\n':	//������ǻس�.
				bw.write("\\n" + "=" + tm.get(key));	//��ת��س�����д��.��д��ֵ��Ӧ��ֵ
				break;
				default:	//�����������������.
				bw.write(key + "=" + tm.get(key));	//��ֱ��д����.��д��ֵ��Ӧ��ֵ
				break;
				}
				bw.newLine();	//��ʾ����,��Ϊswitchѭ����������,�ض���һ��Ҫд��.��д��һ������һ��.
			
			}
			bw.close();
	}

}
