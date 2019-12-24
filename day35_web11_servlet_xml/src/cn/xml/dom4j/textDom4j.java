package cn.xml.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;


//本类演示所有dom4j-1.6.1.jar包解析xml文档
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
			//1:获取解析器
			SAXReader srr = new SAXReader();
		//2:获取document文档对象 
			Document dom = srr.read("src/cn/xml/schema/web2xml.xml");
		//3:获取根元素
			Element re = dom.getRootElement();
			System.out.println(re.getName());
		} catch (DocumentException e) {
			
			e.printStackTrace();
		}
	}
}
