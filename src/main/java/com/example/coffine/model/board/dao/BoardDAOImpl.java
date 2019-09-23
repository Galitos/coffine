package com.example.coffine.model.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.coffine.Pagination;
import com.example.coffine.model.board.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	SqlSession sqlSession;
	
	// 게시글 목록 
	@Override
	public List<BoardDTO> BoardList(Pagination pagination) throws Exception {
		return sqlSession.selectList("board.boardList", pagination);
	}
	// 게시글 등록
	@Override
	public void insertBoard(BoardDTO dto) throws Exception {
		sqlSession.insert("board.boardAdd", dto);
	}
	// 게시글 수정 
	@Override
	public void updateBoard(BoardDTO dto) throws Exception {
		sqlSession.update("board.boardUpdate", dto);
	}
	// 게시글 삭제 
	@Override
	public void deleteBoard(int bno) throws Exception {
		sqlSession.delete("board.boardDelete", bno);
	}
	// 게시글 상세 내용 
	@Override
	public BoardDTO selectBoardView(int bno) throws Exception {
		return sqlSession.selectOne("board.boardView", bno);
	}
	// 게시글 수량 
	@Override
	public int boardCount() throws Exception{
		return sqlSession.selectOne("board.totalCount");
		
	}

}
