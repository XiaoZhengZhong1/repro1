package com.xiaohai.srevice;

import java.sql.SQLException;
import java.util.List;

import com.xiaohai.dao.ProductDao;

public class ProductService {

	public List<Object> findProductByWord(String word) throws SQLException {
		ProductDao dao = new ProductDao();
		return dao.findProductByWord(word);
		
	}

}
