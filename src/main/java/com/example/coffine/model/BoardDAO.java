package com.example.coffine.model;

import java.util.List;

import com.example.coffine.Pagination;
import com.example.coffine.domain.Board;

public interface BoardDAO {
		
	
	// 게시물 전체 레코드 
	public int boardCount() throws Exception;
	// 게시물 리스트 조회
    List<Board> BoardList(Pagination pagination) throws Exception;
    
	// 게시물 등록
    void insertBoard(Board dto) throws Exception;
 
	// 게시물 수정
    void updateBoard(Board dto) throws Exception;
 
	// 게시물 삭제
    void deleteBoard(int bno) throws Exception;
 
	// 게시물 조회
    Board selectBoardView(int bno) throws Exception;
 
}
