package com.itheima.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.springmvc.pojo.Items;

@Controller
public class ItemController {
//	@Autowired
//	private ItemService itemService;

		// ���ų��� ��һ ���� + ��� + ������,�����������֮��(����ӭ������ɨ��,��ʾ����Ҳ������.action��β������)
		@RequestMapping(value = "/item/itemlist.action")
	public ModelAndView itemList() throws Exception{
			
			// ����ҳ����Ҫ��ʾ����Ʒ����
			List<Items> list = new ArrayList<Items>();
			list.add(new Items(1, "1��Ϊ ��ҫ8", 2399f, new Date(), "�����ã�1"));
			ModelAndView mav = new ModelAndView();
			//����
			mav.addObject("itemList", list);
			mav.setViewName("itemList");
			return mav;
	}
		
		
		/*//���ų��� ��һ   ���� + ��� + ������
		@RequestMapping(value = "/item/queryitem.action")
		public ModelAndView itemList(){
			//��Mysql�в�ѯ
			List<Items> list = itemService.selectItemsList();
			
			ModelAndView mav = new ModelAndView();
			//����
			mav.addObject("itemList", list);
			mav.setViewName("itemList");
			return mav;
		}*/
}
