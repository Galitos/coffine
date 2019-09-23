package com.example.coffine.service.board;

import java.util.List;

import com.example.coffine.Pagination;
import com.example.coffine.model.board.dto.BoardDTO;

public interface BoardService {

	// 게시물 리스트 조회
    List<BoardDTO> BoardList(Pagination pagination) throws Exception;
    
	// 게시물 등록
    void insertBoard(BoardDTO dto) throws Exception;
 
	// 게시물 수정
    void updateBoard(BoardDTO dto) throws Exception;
 
	// 게시물 삭제
    void deleteBoard(int bno) throws Exception;
 
	// 게시물 조회
    BoardDTO selectBoardView(int bno) throws Exception;
	
	// 게시물 전체 레코드 
	public int boardCount() throws Exception;
}
