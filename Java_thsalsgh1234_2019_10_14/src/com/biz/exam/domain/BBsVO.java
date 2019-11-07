package com.biz.exam.domain;

public class BBsVO {
	
	private int seq;
	private int data;
	private String auth;
	private String subject;
	private String text;
	private int count;
	
	
	public BBsVO(int seq, int data, String auth, String subject, String text, int count) {
		super();
		this.seq = seq;
		this.data = data;
		this.auth = auth;
		this.subject = subject;
		this.text = text;
		this.count = count;
	}
	public BBsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "examVO [seq=" + seq + ", data=" + data + ", auth=" + auth + ", subject=" + subject + ", text=" + text
				+ ", count=" + count + "]";
	}
	
}
