package cn.xml.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;


//������ʾ����dom4j-1.6.1.jar������xml�ĵ�
public class textDom4j {
//	@Test
//	public void aaa() {
//		System.out.println("a");
//	}
	
//	public static void main(String[] args) {
//		textDom4j te = new textDom4j();
//		te.textXml();
//	}
	
	
	@Test
	public void textXml(){
	try {
			//1:��ȡ������
			SAXReader srr = new SAXReader();
		//2:��ȡdocument�ĵ����� 
			Document dom = srr.read("src/cn/xml/schema/web2xml.xml");
		//3:��ȡ��Ԫ��
			Element re = dom.getRootElement();
			System.out.println(re.getName());
		} catch (DocumentException e) {
			
			e.printStackTrace();
		}
	}
}
