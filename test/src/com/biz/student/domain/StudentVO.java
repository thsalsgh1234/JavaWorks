package com.biz.student.domain;

import javax.xml.bind.annotation.XmlInlineBinaryData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class StudentVO {

	/*
	 * 학생정보.txt 파일을 읽어서
	 * 1. 모든 학생의 리스트를 콘솔에 보이기
	 * 2. 이름을 입력받아 해당하는 학생 리스트를 콘솔에 보이기
	 * 3. 학년을 입력받아 해당하는 학년의 학생들만 콘솔에 보이기
	 * 4. 두개의 정수를 입력받아 해당 범위의 
	 * 		학년에 해당하는 학생들만 콘솔에 보이기
	 */
	
	
	private String num;
	private String name;
	private String tel;
	private int grade;
	private String addr;
	
}
