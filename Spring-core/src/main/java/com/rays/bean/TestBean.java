package com.rays.bean;

public class TestBean {
	public static void main(String[] args) {
		
	
	
	//by setter method 
	UserBean bean = new UserBean();
	bean.setLogin("hello");
	bean.setPassword("kanak");
	
	System.out.println(bean.getLogin());
	System.out.println(bean.getPassword());
	

}
}