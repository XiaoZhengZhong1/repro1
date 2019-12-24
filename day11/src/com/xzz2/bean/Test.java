package com.xzz2.bean;

import java.awt.image.SampleModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Test t = new  Test();
		Calendar c = Calendar.getInstance();
        SimpleDateFormat s = new SimpleDateFormat("");
        try {
        	
        	
			s.parse("");
	        s.format(new Date());
	        
	        List l = new ArrayList<>();
	        Map m = new HashMap<>();
	        Map m1 = new HashMap<>();
	        m.put("qq", l);
	        m.put("qq", m1);
	        
	        
	        
		} catch (ParseException e) {
			
			e.printStackTrace();
		}


	}
	protected Test(){
		System.out.println("ssss");
	}

}
