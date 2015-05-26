package com.kate.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kate.app.model.Train;
import com.kate.app.model.TrainDetail;
import com.kate.app.service.TrainService;

@Controller
public class TrainController {
	@Autowired
	private TrainService trainService;
	
	@RequestMapping({ "/", "/Train" })
	public String getTrain(HttpServletRequest req,HttpServletResponse resp){
		List<Train> list=new ArrayList<Train>();
		List<TrainDetail> list1=new ArrayList<TrainDetail>();
		List<TrainDetail> list2=new ArrayList<TrainDetail>();
		List<TrainDetail> list3=new ArrayList<TrainDetail>();
		list=trainService.getTrainList();
		list1=trainService.getTrainDetail1();
		list2=trainService.getTrainDetail2();
		list3=trainService.getTrainDetail3();
		req.setAttribute("TrainList", list);
		req.setAttribute("TrainDetail1", list1);
		req.setAttribute("TrainDetail2", list2);
		req.setAttribute("TrainDetail3", list3);
		return "/train.jsp";
	}

}
