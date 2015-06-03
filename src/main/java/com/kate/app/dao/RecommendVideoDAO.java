package com.kate.app.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.kate.app.model.News;
import com.kate.app.model.RecommendVideo;

@Repository 
public class RecommendVideoDAO extends BaseDao {
	public List<News> findAll(){
	List<News> list = new ArrayList<News>();
	try{
		
		String sql = " select * from News";
        Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){					
			News data = new News();
			data.setId(rs.getInt("id"));
			data.setNews_detail(rs.getString("news_detail"));
			data.setNews_id(rs.getInt("news_id"));
			data.setNews_time(rs.getDate("news_time"));
			data.setNews_title(rs.getString("news_title"));
			list.add(data);
		}
		
	}catch (Exception e) {
        
    }
		return list;
	}
}