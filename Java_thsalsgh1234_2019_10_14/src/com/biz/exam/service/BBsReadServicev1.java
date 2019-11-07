package com.biz.exam.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public class BBsReadServicev1 {
	List<BBsVO> BBsList;
	
	
	public void readBBS(String bbsFile) throws Exception {
		
		
		
		
		
		FileReader fileReader = new FileReader(bbsFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] BBs = reader.split(":");
			
			BBsVO b = new BBsVO();
			
			b.setSeq(Integer.valueOf(BBs[0]));
			b.setData(Integer.valueOf(BBs[1]));
			b.setAuth(BBs[2]);
			b.setSubject(BBs[3]);
			b.setText(BBs[4]);
			b.setCount(Integer.valueOf(BBs[5]));	
			
	}
		buffer.close();
		fileReader.close();
	
}
	
	}

		
	


	