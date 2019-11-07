package com.biz.exam.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public abstract class BBsViewServiceV1  implements BBsViewService{

	List<BBsVO> bbsList;
	
	public BBsViewServiceV1() {
		
		bbsList = new ArrayList<BBsVO>();
	}
	public void view() {
		this.title();
		for(BBsVO vo : bbsList) {
			this.body(vo);
		}
		System.out.println("==========================");
	}
	
	
	public void title() {
		System.out.println("======================================");
		System.out.println("게시판 관리 시스템 v1");
		System.out.println("======================================");
		System.out.println("순번\t작성자\t작성일자\t제목\t내용\t조회수");
		System.out.println("======================================");
		
		
	}
	
	public void body(BBsVO vo) {
		
		System.out.print(vo.getSeq() + "\t");
		System.out.print(vo.getData() + "\t");
		System.out.print(vo.getAuth()+  " \t");
		System.out.print(vo.getSubject()+ "\t");
		System.out.print(vo.getText()+ "\t");
		System.out.print(vo.getCount() + " \n ");
		
		
		
	}
	
	public void serch( ) {
		
		
	}
	
}
