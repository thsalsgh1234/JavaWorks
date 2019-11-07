package com.biz.exam.service;

import java.util.List;

import com.biz.exam.domain.BBsVO;

public interface BBsReadService {

	public void readBBs(String bbsFile);
	public List<BBsVO> getBBsList();
}
