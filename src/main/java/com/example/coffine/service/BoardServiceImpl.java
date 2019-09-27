package com.example.coffine.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.coffine.Pagination;
import com.example.coffine.domain.Board;
import com.example.coffine.model.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	BoardDAO boardDao;
	
	// 게시물 목록 조회
	@Override
	public List<Board> BoardList(Pagination pagination) throws Exception {
		return boardDao.BoardList(pagination);
	}
	// 게시물 등록
	@Override
	public void insertBoard(Board dto) throws Exception {
		boardDao.insertBoard(dto);
	}
	// 게시물 수정 
	@Override
	public void updateBoard(Board dto) throws Exception {
		boardDao.updateBoard(dto);
	}
	// 게시물 삭제
	@Override
	public void deleteBoard(int bno) throws Exception {
		boardDao.deleteBoard(bno);
	}
	// 게시물 상세 내용
	@Override
	public Board selectBoardView(int bno) throws Exception {
		return boardDao.selectBoardView(bno);
	}
	// 게시물 수량
	@Override
	public int boardCount() throws Exception {
		return boardDao.boardCount();
	}

}
