package com.regex;

public class demo146_replace {

	public static void main(String[] args) {
/*###14.07_��������(������ʽ���滻����)
* A:������ʽ���滻����
	* String��Ĺ��ܣ�public String replaceAll(String regex,String replacement)
* B:������ʾ
	* ������ʽ���滻����*/
	String a = "wo 1 ai 2 lei 3 ge";
	String regex = "\\d";	//������������.
	String a1 = a.replaceAll(regex, "_");/*all��ȫ������˼,replaceAll�����滻ȫ������˼.
											a.replaceAll(regex, "")��˼���滻a�е�ȫ��regex����,��""�մ��滻 */
	System.out.println(a1);
	}

}
