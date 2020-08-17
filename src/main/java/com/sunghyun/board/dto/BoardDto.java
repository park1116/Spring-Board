package com.sunghyun.board.dto;

public class BoardDto {
	private int num;
	private String title;
	private String name;
	private String content;
	private String regdate;
	
	@Override
	public String toString() {
		return "BoardDto [num=" + num + ", title=" + title + ", name=" + name + ", content=" + content + ", regdate="
				+ regdate + "]";
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
