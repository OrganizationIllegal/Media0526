package com.kate.app.dao;


import java.sql.Connection;
import java.sql.DriverManager;




public class BaseDao {
	
	protected static String url = null;
	protected static String username = null;
	protected static String password = null;
	protected static Connection con = null;
	static {
		System.out.println("fffffffff");
		try{   
		    //锟斤拷锟斤拷MySql锟斤拷锟斤拷锟斤拷   
		    Class.forName("com.mysql.jdbc.Driver") ;  
		    System.out.println("fffffffff11111");
		}
		catch(ClassNotFoundException e){   
		    e.printStackTrace();   
		}   
		try {
			System.out.println("fffffff222222ff11111");
            url = "jdbc:mysql://54.187.200.118:3306/media";
            username = "root";
            password = "admin";
            System.out.println("fffffff22dddddddddddd2222ff11111");
            con = DriverManager.getConnection(url, username, password);
            System.out.println(url);
        } catch (Exception e) {
           
        }
	}
	
	
}
