package com.pms.dao;



import java.util.List;

import com.pms.bean.Product;

public interface ProductDAO {
public void addProduct();
public Product viewProduct(int pid);
public List<Product> viewAllProdut();
public void updateProduct(int pid);
public void deleteProduct(int pid);
public void bill();
}
