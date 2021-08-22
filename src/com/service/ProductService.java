package com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.dao.ProductDao;
import com.utility.Items;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public String stroreProductDetails(Product pr) {
	
		if(productDao.storeProduct(pr)>0) {
			return "Product Details stored successfully";
		}else {
			return "Product Details didn't store successfully";
		}
	}
	
	public List<Product> getAllProduct(){
		return productDao.getAllProduct();
	}
	
	public Product getProduct(int pid) {
		return productDao.getProductById(pid);
	}
	
	public String udpateProductDetails(Product pro) {
		if(productDao.updateProdutDetails(pro)>0) {
			return "Product Updted successfully";
		}else {
			return "Product didn't update";
		}
	}
	
	public String reduceQuantity(List<Items> items) {
		for(Items ii:items){
			Product p = ii.getProduct();
			int quantity = ii.getQuantity();
			int result = productDao.reducerQuantity(p.getPid(), quantity);
			if(result==1) {
				return "success";
			}else {
				return "failure";
			}
		}
		return "done";
	}
}

