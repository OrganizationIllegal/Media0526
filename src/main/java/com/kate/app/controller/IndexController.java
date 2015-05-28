package com.kate.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kate.app.model.NewsTrends;
import com.kate.app.model.StarImage;
import com.kate.app.model.StarVedio;
import com.kate.app.model.Train;
import com.kate.app.service.IndexService;


@Controller
public class IndexController {
	@Autowired
	private IndexService indexService;
	
	@RequestMapping({ "/", "/Index" })
	public String getTrain(HttpServletRequest req,HttpServletResponse resp){
		List<NewsTrends> list1=new ArrayList<NewsTrends>();
		List<Train> list2=new ArrayList<Train>();
		List<StarImage> list3=new ArrayList<StarImage>();
		List<StarVedio> list4=new ArrayList<StarVedio>();
		list1=indexService.getNewsList();
		list2=indexService.getTrainList();
		list3=indexService.getImgList();
		list4=indexService.getVedioList();
		String train1=list2.get(0).getTrainImage();//兴趣班
		String train2=list2.get(1).getTrainImage();//练习生
		String train3=list2.get(2).getTrainImage();//国际班
		String img1=list3.get(0).getImg();//明星图片1
		String img2=list3.get(1).getImg();//明星图片2
		String img3=list3.get(2).getImg();//明星图片3
		String img4=list3.get(3).getImg();//明星图片4
		String img5=list3.get(4).getImg();//明星图片5
		String img6=list3.get(5).getImg();//明星图片6
		String img7=list3.get(6).getImg();//明星图片7
		String vedio1=list4.get(0).getVedio();//明星视频
		String vedio2=list4.get(1).getVedio();//明星视频
		String vedio3=list4.get(2).getVedio();//明星视频
		String vedio4=list4.get(3).getVedio();//明星视频
		req.setAttribute("NewsList", list1);
		req.setAttribute("train1", train1);
		req.setAttribute("train2", train2);
		req.setAttribute("train3", train3);
		req.setAttribute("img1", img1);
		req.setAttribute("img2", img2);
		req.setAttribute("img3", img3);
		req.setAttribute("img4", img4);
		req.setAttribute("img5", img5);
		req.setAttribute("img6", img6);
		req.setAttribute("img7", img7);
		req.setAttribute("vedio1", vedio1);
		req.setAttribute("vedio2", vedio2);
		req.setAttribute("vedio3", vedio3);
		req.setAttribute("vedio4", vedio4);
		return "/index.jsp";
	}

}
