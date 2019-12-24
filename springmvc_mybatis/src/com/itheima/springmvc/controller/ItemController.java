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

		// 入门程序 第一 包类 + 类包 + 方法名,必须紧跟方法之上(就是迎合配置扫描,表示本类也符合以.action结尾的请求)
		@RequestMapping(value = "/item/itemlist.action")
	public ModelAndView itemList() throws Exception{
			
			// 创建页面需要显示的商品数据
			List<Items> list = new ArrayList<Items>();
			list.add(new Items(1, "1华为 荣耀8", 2399f, new Date(), "质量好！1"));
			ModelAndView mav = new ModelAndView();
			//数据
			mav.addObject("itemList", list);
			mav.setViewName("itemList");
			return mav;
	}
		
		
		/*//入门程序 第一   包类 + 类包 + 方法名
		@RequestMapping(value = "/item/queryitem.action")
		public ModelAndView itemList(){
			//从Mysql中查询
			List<Items> list = itemService.selectItemsList();
			
			ModelAndView mav = new ModelAndView();
			//数据
			mav.addObject("itemList", list);
			mav.setViewName("itemList");
			return mav;
		}*/
}
