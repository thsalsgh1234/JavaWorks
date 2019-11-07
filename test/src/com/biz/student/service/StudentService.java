package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.biz.student.domain.StudentVO;

import lombok.Getter;

/*
 * 학생정보.txt 파일을 읽어서
 * 1. 모든 학생의 리스트를 콘솔에 보이기
 * 2. 이름을 입력받아 해당하는 학생 리스트를 콘솔에 보이기
 * 3. 학년을 입력받아 해당하는 학년의 학생들만 콘솔에 보이기
 * 4. 두개의 정수를 입력받아 해당 범위의 
 * 		학년에 해당하는 학생들만 콘솔에 보이기
 */
@Getter

public class StudentService {

	private List<StudentVO> stdList;
	
	
	public void Read(String fileName) throws Exception{
		
		FileReader fileReader = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		
		while(true) {
			
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] read = reader.split(":");
			
			StudentVO s = new StudentVO();
			s.setNum(read[0]);
			s.setName(read[1]);
			s.setTel(read[2]);
			s.setGrade(Integer.valueOf(read[3]));
			s.setAddr(read[4]);
			
			stdList.add(s);
			
			
			
			
		}
		
		buffer.close();
		fileReader.close();
		
	}
	
	public void view() {
		
		this.title();
		for(StudentVO s:stdList) {
			this.body(s);
			
		}
	}
	
	public void title() {
		
	}
	
	public void body() {
		
	}
	public void serch(String strname) {
		
	}
}
