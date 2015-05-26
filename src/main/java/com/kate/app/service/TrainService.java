package com.kate.app.service;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kate.app.dao.TrainDAO;
import com.kate.app.dao.TrainDetailDAO;
import com.kate.app.model.Train;
import com.kate.app.model.TrainDetail;

@Service
public class TrainService {
	@Autowired
	private TrainDAO trainDao;
	@Autowired
	private TrainDetailDAO trainDetailDao;
	private String trainid="id";
	private int value=0;
	
	public List<Train> getTrainList(){
		List<Train> list =new ArrayList<Train>();
		list=trainDao.findAll();
		return list;
	}
	//兴趣班详情
	public List<TrainDetail> getTrainDetail1(){
		List<TrainDetail> list =new ArrayList<TrainDetail>();
		value=1;
		list=trainDetailDao.findByTrain(trainid, value);
		for(int i=0;i<list.size();i++){
			Date date=list.get(i).getTime();
			DateFormat df = DateFormat.getDateInstance();//日期格式，精确到日
			String str=df.format(date);
			Date time=java.sql.Date.valueOf(str);
			list.get(i).setTime(time);
		}		
		
		return list;
	}
	//练习生详情
	public List<TrainDetail> getTrainDetail2(){
		List<TrainDetail> list =new ArrayList<TrainDetail>();
		value=2;
		list=trainDetailDao.findByTrain(trainid, value);
		return list;
	}
	//国际班详情
	public List<TrainDetail> getTrainDetail3(){
		List<TrainDetail> list =new ArrayList<TrainDetail>();
		value=3;
		list=trainDetailDao.findByTrain(trainid, value);
		return list;
	}

}
