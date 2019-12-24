package com.xiaohai.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import redis.clients.jedis.Jedis;

import com.google.gson.Gson;
import com.xiaohai.commonsUtils.CommonsUtils;
import com.xiaohai.domain.Cart;
import com.xiaohai.domain.CartItem;
import com.xiaohai.domain.Category;
import com.xiaohai.domain.Order;
import com.xiaohai.domain.OrderItem;
import com.xiaohai.domain.PageBean;
import com.xiaohai.domain.Product;
import com.xiaohai.domain.User;
import com.xiaohai.service.ProductService;
import com.xiaohai.utils.JedisPoolUtils;
import com.xiaohai.utils.PaymentUtil;

/*��������ҳ���й���Ʒ��ɾ�Ĳ������ֻ����,�ñ���̳�BasicServlet��,����ͻᵽBasicServlet��,�����л�ȡ����ķ���
����,���÷��似����ȡ����ķ�������,��֮�Ա�,��ͬ�͵���*/
@SuppressWarnings("all")
public class productServlet extends BasicServlet {	
	
	//������Ʒ���������Ʒ���б�
		public void productList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			//���cid
			String cid = request.getParameter("cid");

			String currentPageStr = request.getParameter("currentPage");
			if(currentPageStr==null) currentPageStr="1";
			int currentPage = Integer.parseInt(currentPageStr);
			int currentCount = 12;

			ProductService service = new ProductService();
			PageBean pageBean = service.findProductListByCid(cid,currentPage,currentCount);

			request.setAttribute("pageBean", pageBean);
			request.setAttribute("cid", cid);

			//����һ����¼��ʷ��Ʒ��Ϣ�ļ���
			List<Product> historyProductList = new ArrayList<Product>();

			//��ÿͻ���Я�����ֽ�pids��cookie
			Cookie[] cookies = request.getCookies();
			if(cookies!=null){
				for(Cookie cookie:cookies){
					if("pids".equals(cookie.getName())){
						String pids = cookie.getValue();//3-2-1
						String[] split = pids.split("-");
						for(String pid : split){
							Product pro = service.findProductByPid(pid);
							historyProductList.add(pro);
						}
					}
				}
			}

			//����ʷ��¼�ļ��Ϸŵ�����
			request.setAttribute("historyProductList", historyProductList);

			request.getRequestDispatcher("/product_list.jsp").forward(request, response);


		}
	
	
		//����ҵĶ���
		public void myOrders(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			HttpSession session = request.getSession();

			User user = (User) session.getAttribute("user");
			
			ProductService service = new ProductService();
			//��ѯ���û������еĶ�����Ϣ(������ѯorders��)
			//�����е�ÿһ��Order����������ǲ������� ȱ��List<OrderItem> orderItems����
			List<Order> orderList = service.findAllOrders(user.getUid());
			//ѭ�����еĶ��� Ϊÿ��������䶩�������Ϣ
			if(orderList!=null){
				for(Order order : orderList){
					//���ÿһ��������oid
					String oid = order.getOid();
					//��ѯ�ö��������еĶ�����---mapList��װ���Ƕ��������͸ö������е���Ʒ����Ϣ
					List<Map<String, Object>> mapList = service.findAllOrderItemByOid(oid);
					//��mapListת����List<OrderItem> orderItems 
					for(Map<String,Object> map : mapList){
						
						try {
							//��map��ȡ��count subtotal ��װ��OrderItem��
							OrderItem item = new OrderItem();
							//item.setCount(Integer.parseInt(map.get("count").toString()));
							BeanUtils.populate(item, map);
							//��map��ȡ��pimage pname shop_price ��װ��Product��
							Product product = new Product();
							BeanUtils.populate(product, map);
							//��product��װ��OrderItem
							item.setProduct(product);
							//��orderitem��װ��order�е�orderItemList��
							order.getOrderItems().add(item);
						} catch (IllegalAccessException | InvocationTargetException e) {
							e.printStackTrace();
						}
						
						
					}

				}
			}
			
			
			//orderList��װ������
			request.setAttribute("orderList", orderList);
			
			request.getRequestDispatcher("/order_list.jsp").forward(request, response);
			
			

			
		}

		//ȷ�϶���---�����ջ�����Ϣ+����֧��
		public void confirmOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			//1�������ջ�����Ϣ
			Map<String, String[]> properties = request.getParameterMap();
			Order order = new Order();
			try {
				BeanUtils.populate(order, properties);
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}

			ProductService service = new ProductService();
			service.updateOrderAdrr(order);

			//2������֧��
			/*if(pd_FrpId.equals("ABC-NET-B2C")){
				//����ũ�еĽӿ�
			}else if(pd_FrpId.equals("ICBC-NET-B2C")){
				//���빤�еĽӿ�
			}*/
			//.......

			//ֻ����һ���ӿڣ�����ӿ��Ѿ��������е����нӿ���  ������ӿ��ǵ�����֧��ƽ̨�ṩ��
			//��������ױ�֧��
			// ��� ֧�������������
			String orderid = request.getParameter("oid");
			//String money = order.getTotal()+"";//֧�����
			String money = "0.01";//֧�����
			// ����
			String pd_FrpId = request.getParameter("pd_FrpId");

			// ����֧����˾��Ҫ��Щ����
			String p0_Cmd = "Buy";
			String p1_MerId = ResourceBundle.getBundle("merchantInfo").getString("p1_MerId");
			String p2_Order = orderid;
			String p3_Amt = money;
			String p4_Cur = "CNY";
			String p5_Pid = "";
			String p6_Pcat = "";
			String p7_Pdesc = "";
			// ֧���ɹ��ص���ַ ---- ������֧����˾����ʡ��û�����
			// ������֧�����Է�����ַ
			String p8_Url = ResourceBundle.getBundle("merchantInfo").getString("callback");
			String p9_SAF = "";
			String pa_MP = "";
			String pr_NeedResponse = "1";
			// ����hmac ��Ҫ��Կ
			String keyValue = ResourceBundle.getBundle("merchantInfo").getString(
					"keyValue");
			String hmac = PaymentUtil.buildHmac(p0_Cmd, p1_MerId, p2_Order, p3_Amt,
					p4_Cur, p5_Pid, p6_Pcat, p7_Pdesc, p8_Url, p9_SAF, pa_MP,
					pd_FrpId, pr_NeedResponse, keyValue);


			String url = "https://www.yeepay.com/app-merchant-proxy/node?pd_FrpId="+pd_FrpId+
					"&p0_Cmd="+p0_Cmd+
					"&p1_MerId="+p1_MerId+
					"&p2_Order="+p2_Order+
					"&p3_Amt="+p3_Amt+
					"&p4_Cur="+p4_Cur+
					"&p5_Pid="+p5_Pid+
					"&p6_Pcat="+p6_Pcat+
					"&p7_Pdesc="+p7_Pdesc+
					"&p8_Url="+p8_Url+
					"&p9_SAF="+p9_SAF+
					"&pa_MP="+pa_MP+
					"&pr_NeedResponse="+pr_NeedResponse+
					"&hmac="+hmac;

			//�ض��򵽵�����֧��ƽ̨
			response.sendRedirect(url);


		}

		

	
	//1:��ȡ������Ʒ,���͵��̳���ҳ(ͨ�����ݿ���ϼ������ֶ�)
	public void index(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//1:��ȡ������Ʒ,���͵��̳���ҳ(ͨ�����ݿ���ϼ������ֶ�)
				ProductService service = new ProductService();		
				//׼��������Ʒ---List<Product>
				List<Product> hotProductList = service.findHotProductList();
				
				//2:��ȡ������Ʒ.���͵��̳���ҳ(ͨ�����ݿ��Ƿ������ֶ�0 1)
				List<Product> newProductList = service.findNewProductList();
				
				request.setAttribute("hotProductList", hotProductList);
				request.setAttribute("newProductList", newProductList);
				request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
	
	
	//������ʾ���������̳���ҳ��Ʒ���߷�����Ʒ,��ʾ�������Ʒ��ϸ��Ϣ����
	public void ProductInfo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//��ȡ�����Ʒ�ķ���cid �� ��Ʒչʾ�ĵ�ǰҲ,�Է�����Ʒ��ϸҳ�淵��ʱ��Ҫ�Ĳ�ѯ����
		String cid = request.getParameter("cid");
		String currentPage = request.getParameter("currentPage");
		
		
		
		//��ȡ�����Ʒ��pid
		String pid = request.getParameter("pid");
		//���÷���.�����ݿ��ѯ�������Ʒ��Ϣ
		ProductService service = new ProductService();
		Product product = service.findProductByPid(pid);
		//�洢�������������
		request.setAttribute("product", product);
		
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("cid", cid);
		
		

		//��ÿͻ���Я��cookie---���������pids��cookie
		String pids = pid;
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for(Cookie cookie : cookies){
				if("pids".equals(cookie.getName())){
					pids = cookie.getValue();
					//1-3-2 ���η�����Ʒpid��8----->8-1-3-2
					//1-3-2 ���η�����Ʒpid��3----->3-1-2
					//1-3-2 ���η�����Ʒpid��2----->2-1-3
					//��pids���һ������
					String[] split = pids.split("-");//{3,1,2}
					List<String> asList = Arrays.asList(split);//[3,1,2]
					LinkedList<String> list = new LinkedList<String>(asList);//[3,1,2]
					//�жϼ������Ƿ���ڵ�ǰpid
					if(list.contains(pid)){
						//������ǰ�鿴��Ʒ��pid
						list.remove(pid);
						list.addFirst(pid);
					}else{
						//��������ǰ�鿴��Ʒ��pid ֱ�ӽ���pid�ŵ�ͷ��
						list.addFirst(pid);
					}
					//��[3,1,2]ת��3-1-2�ַ���
					StringBuffer sb = new StringBuffer();
					for(int i=0;i<list.size()&&i<7;i++){
						sb.append(list.get(i));
						sb.append("-");//3-1-2-
					}
					//ȥ��3-1-2-���-
					pids = sb.substring(0, sb.length()-1);
				}
			}
		}
		

		Cookie cookie_pids = new Cookie("pids",pids);
		response.addCookie(cookie_pids);
		
		
		
		
		
		//ת������ʾ��Ʒ��ϸ��ҳ��
		request.getRequestDispatcher("/product_info.jsp").forward(request, response);
		
	}
	
	
	
	// ������ʾ��̬��ȡ�̳���ҳ��Ʒ����,ֱ�ӵ����ݿ��ѯ��Ʒ�����������Ʒ����,���ص�����ҳ��
	public void categoryList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				ProductService service = new ProductService();

				//�ȴӻ����в�ѯcategoryList �����ֱ��ʹ�� û���ڴ����ݿ��в�ѯ �浽������
				//1�����jedis���� ����redis���ݿ�
	
				//2���ж�categoryListJson�Ƿ�Ϊ��
					//׼����������
					List<Category> categoryList = service.findAllCategory();
					Gson gson = new Gson();
					String categoryListJson = gson.toJson(categoryList);
					
				

				response.setContentType("text/html;charset=UTF-8");
				response.getWriter().write(categoryListJson);
	}
	
	
	
	//����Ʒ���ӵ����ﳵ
	public void addProductToCart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		ProductService service = new ProductService();


		//���Ҫ�ŵ����ﳵ����Ʒ��pid
		String pid = request.getParameter("pid");
		//��ø���Ʒ�Ĺ�������
		int buyNum = Integer.parseInt(request.getParameter("buyNum"));

		//���product����
		Product product = service.findProductByPid(pid);
		//����С��
		double subtotal = product.getShop_price()*buyNum;
		//��װCartItem
		CartItem item = new CartItem();
		item.setProduct(product);
		item.setBuyNum(buyNum);
		item.setSubtotal(subtotal);

		//��ù��ﳵ---�ж��Ƿ���session���Ѿ����ڹ��ﳵ
		Cart cart = (Cart) session.getAttribute("cart");
		if(cart==null){
			cart = new Cart();
		}

		//��������ŵ�����---key��pid
		//���жϹ��ﳵ���Ƿ��ѽ������˹������� ----- �ж�key�Ƿ��Ѿ�����
		//������ﳵ���Ѿ����ڸ���Ʒ----���������������ԭ�е�����������Ӳ���
		Map<String, CartItem> cartItems = cart.getCartItems();

		double newsubtotal = 0.0;

		if(cartItems.containsKey(pid)){
			//ȡ��ԭ����Ʒ������
			CartItem cartItem = cartItems.get(pid);
			int oldBuyNum = cartItem.getBuyNum();
			oldBuyNum+=buyNum;
			cartItem.setBuyNum(oldBuyNum);
			cart.setCartItems(cartItems);
			//�޸�С��
			//ԭ������Ʒ��С��
			double oldsubtotal = cartItem.getSubtotal();
			//�������Ʒ��С��
			newsubtotal = buyNum*product.getShop_price();
			cartItem.setSubtotal(oldsubtotal+newsubtotal);

		}else{
			//�������û�и���Ʒ
			cart.getCartItems().put(product.getPid(), item);
			newsubtotal = buyNum*product.getShop_price();
		}

		//�����ܼ�
		double total = cart.getTotal()+newsubtotal;
		cart.setTotal(total);


		//�����ٴδ洢��session
		session.setAttribute("cart", cart);

		//ֱ����ת�����ﳵҳ��
		response.sendRedirect(request.getContextPath()+"/cart.jsp");
	}
		
		
	//ɾ����һ��Ʒ
		public void delProFromCart(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//���Ҫɾ����item��pid
			String pid = request.getParameter("pid");
			//ɾ��session�еĹ��ﳵ�еĹ�������е�item
			HttpSession session = request.getSession();
			Cart cart = (Cart) session.getAttribute("cart");
			if(cart!=null){
				Map<String, CartItem> cartItems = cart.getCartItems();
				//��Ҫ�޸��ܼ�
				cart.setTotal(cart.getTotal()-cartItems.get(pid).getSubtotal());
				//ɾ��
				cartItems.remove(pid);
				cart.setCartItems(cartItems);

			}

			session.setAttribute("cart", cart);

			//��ת��cart.jsp
			response.sendRedirect(request.getContextPath()+"/cart.jsp");
		}	
		
	
		//��չ��ﳵ
		public void clearCart(HttpServletRequest request, HttpServletResponse response) throws IOException{ 
			
			HttpSession session = request.getSession();
			session.removeAttribute("cart");
			response.sendRedirect(request.getContextPath()+"/cart.jsp");;
			
		}
		
		
		//�ύ����
		public void submitOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			HttpSession session = request.getSession();

			//�ж��û��Ƿ��Ѿ���¼ δ��¼������벻ִ��
			User user = (User) session.getAttribute("user");
				if(user==null){
				//û�е�¼
				response.sendRedirect(request.getContextPath()+"/login.jsp");
				return;
			}


			//Ŀ�ģ���װ��һ��Order���� ���ݸ�service��
			Order order = new Order();

			//1��private String oid;//�ö����Ķ�����
			String oid = CommonsUtils.getUUID();
			order.setOid(oid);

			//2��private Date ordertime;//�µ�ʱ��
			order.setOrdertime(new Date());

			//3��private double total;//�ö������ܽ��
			//���session�еĹ��ﳵ
			Cart cart = (Cart) session.getAttribute("cart");
			double total = cart.getTotal();
			order.setTotal(total);

			//4��private int state;//����֧��״̬ 1�����Ѹ��� 0����δ����
			order.setState(0);

			//5��private String address;//�ջ���ַ
			order.setAddress(null);

			//6��private String name;//�ջ���
			order.setName(null);

			//7��private String telephone;//�ջ��˵绰
			order.setTelephone(null);

			//8��private User user;//�ö��������ĸ��û�
			order.setUser(user);

			//9���ö������ж��ٶ�����List<OrderItem> orderItems = new ArrayList<OrderItem>();
			//��ù��ﳵ�еĹ�����ļ���map
			Map<String, CartItem> cartItems = cart.getCartItems();
			for(Map.Entry<String, CartItem> entry : cartItems.entrySet()){
				//ȡ��ÿһ��������
				CartItem cartItem = entry.getValue();
				//�����µĶ�����
				OrderItem orderItem = new OrderItem();
				//1)private String itemid;//�������id
				orderItem.setItemid(CommonsUtils.getUUID());
				//2)private int count;//����������Ʒ�Ĺ�������
				orderItem.setCount(cartItem.getBuyNum());
				//3)private double subtotal;//������С��
				orderItem.setSubtotal(cartItem.getSubtotal());
				//4)private Product product;//�������ڲ�����Ʒ
				orderItem.setProduct(cartItem.getProduct());
				//5)private Order order;//�ö����������ĸ�����
				orderItem.setOrder(order);

				//���ö��������ӵ������Ķ��������
				order.getOrderItems().add(orderItem);
			}


			//order�����װ���
			//�������ݵ�service��
			ProductService service = new ProductService();
			service.submitOrder(order);


			session.setAttribute("order", order);

			//ҳ����ת
			response.sendRedirect(request.getContextPath()+"/order_info.jsp");


		}

		
}