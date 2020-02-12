package com.pms.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.bean.Product;
import com.pms.dao.ProductDAO;

public class ProductDAOImpl implements ProductDAO {
	Scanner sc=new Scanner(System.in);
	static List<Product> products=new ArrayList<Product>();
	static List<Product> tempList=new ArrayList<Product>();
	Product product=null;
	@Override
	public void addProduct() {
		int i=1;// TODO Auto-generated method stub
		while(i==1) {
			product=new Product();
			System.out.println();
			System.out.println("enter product id?");
			product.setPid(sc.nextInt());
			System.out.println("enter product name?");
			product.setPname(sc.next());
			System.out.println("enter product price");
			product.setPrice(sc.nextInt());
			System.out.println("enter ");
		}
	}

	@Override
	public Product viewProduct(int pid) {
		// TODO Auto-generated method stub
		Product p=new Product();
		for(Product p1:products)
		{
			if(p1.getPid()==pid)
			{
				p=p1;
				break;
			}
		}
		return null;
	}

	@Override
	public List<Product> viewAllProdut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(int pid) {
		// TODO Auto-generated method stub
		for(Product p2:products) {
			if(p2.getPid()==pid) {
				System.out.println("select your choic 1.name 2.qty 3.price");
				int ch=sc.nextInt();
				switch(ch) {
				case 1:System.out.println();
				p2.setPname(sc.next());
				case 2:System.out.println();
				p2.setQty(sc.nextInt());
				}
				tempList.add(p2);
				
				}else {
					tempList.add(p2);
			}
		}
		products=new ArrayList<>();
		for(product)
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bill() {
		// TODO Auto-generated method stub
		
	}
	

}
