package com.example.coffine.model.board.dto;

import java.util.Date;

public class BoardDTO {
		
	private int bno;
    private String title;
    private String contents;
    private String writer;
    private int viewCnt;
    private Date postDate;
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
	@Override
	public String toString() {
		return "BoardDTO [bno=" + bno + ", title=" + title + ", contents=" + contents + ", writer=" + writer
				+ ", viewCnt=" + viewCnt + ", postDate=" + postDate + "]";
	}
    
}
