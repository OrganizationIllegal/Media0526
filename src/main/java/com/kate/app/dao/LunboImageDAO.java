package com.kate.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.kate.app.model.LunboImage;
import com.kate.app.model.MyInfo;
@Repository 
public class LunboImageDAO extends BaseDao{
	public String test(){
		//Statement stmt = con.createStatement() ;
		MyInfo myInfo = new MyInfo();
		try{
			Connection con = DriverManager.getConnection(url, username, password);
			//String sql = " select * from HouseInfo";
			String sql = " select * from MyInfo";
	        Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(rs.next());
			while(rs.next()){					
				myInfo.setName(rs.getString("name"));
				myInfo.setAge(rs.getInt("age"));
				System.out.println(myInfo.getAge());
	            
			}
			
		}catch (Exception e) {
            
        }
		
		return myInfo.getName();
        
	}
}
