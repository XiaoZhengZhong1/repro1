package com.reflect;

import java.lang.reflect.Field;

public class L_04 {
	/*###27.09_����(ͨ������дһ��ͨ�õ�����ĳ�������ĳ������Ϊָ����ֵ)
	* A:������ʾ
	* Property�����е���˼
		* public void setProperty(Object obj, String propertyName, Object value){}���˷����ɽ�obj��������Ϊ
		* propertyName�����Ե�ֵ����Ϊvalue�����Ǵ���һ��������,Ȼ�󴴽�һ���Զ�����,���������Ĳ�����ֱ�new�����������Զ������
		* �������������,�����Զ�����ĳ�Ա����*/

	//�˷����ɽ�obj��������Ϊ,propertyName�����Ե�ֵ����Ϊvalue.
	public void setProperty (Object obj, String propertyName, Object value) throws Exception  {
		Class<? extends Object> class5 = obj.getClass();	//��ȡ�ֽ������.
			Field f = class5.getDeclaredField(propertyName);//���������ȡ�ֶ�.
				f.setAccessible(true);	//ȥ��Ȩ��.
				f.set(obj, value);      //���ô�������ֵ(����һ�����÷���,�ڱ�Ĳ��������)
	}

}
