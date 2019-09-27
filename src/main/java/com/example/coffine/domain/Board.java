package com.example.coffine.domain;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class Board {
		
	private int bno;
    private String title;
    private String contents;
    private String writer;
    private int viewCnt;
    private Date postDate;
    private MultipartFile file1;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public MultipartFile getFile1() {
		return file1;
	}
	public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", contents=" + contents + ", writer=" + writer + ", viewCnt="
				+ viewCnt + ", postDate=" + postDate + ", file1=" + file1 + "]";
	}
	
	
	
    
    
}
