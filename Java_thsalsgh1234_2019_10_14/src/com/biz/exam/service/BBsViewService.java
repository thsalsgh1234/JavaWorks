package com.biz.exam.service;

import java.util.List;

import com.biz.exam.domain.BBsVO;

public interface BBsViewService {

	public void setBBsList(List<BBsVO>bbsList);
	public void viewBBs();
	public void viewBBS(String subject);
	public void viewBBs(int sDate, int eDate);
	public void viewBBs(boolean sort);
}
