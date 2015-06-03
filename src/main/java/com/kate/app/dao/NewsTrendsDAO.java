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
import com.kate.app.model.NewsTrends;

@Repository 

public class NewsTrendsDAO extends BaseDao {
	public List<NewsTrends> findAll(){
	List<NewsTrends> list = new ArrayList<NewsTrends>();
	try{
		
		String sql = " select * from news_trends";
        Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){					
			NewsTrends data = new NewsTrends();
			data.setId(rs.getInt("id"));
			data.setDetail(rs.getString("detail"));
			data.setImage(rs.getString("image"));
			data.setNews_id(rs.getInt("news_id"));
			data.setTime(rs.getDate("time"));
			data.setTitle(rs.getString("title"));
			list.add(data);
		}
		
	}catch (Exception e) {
        
    }
		return list;
	}
}