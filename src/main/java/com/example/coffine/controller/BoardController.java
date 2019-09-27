package com.example.coffine.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.coffine.Pagination;
import com.example.coffine.domain.Board;
import com.example.coffine.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	//날짜 타입 데이터 변환
		@InitBinder
		protected void initBinder(WebDataBinder wdb) {
				// SimpleDateFormat("yyyy-MM-dd")인 형태로 만 변환 시켜줌
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			wdb.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
		}

	@Inject
	BoardService boardService;
	//게시글 전체 목록 
	@RequestMapping(value = "boardList", method = RequestMethod.GET)
	public void boardList(Model model,
			@RequestParam(required = false, defaultValue = "1") int page
		   ,@RequestParam(required = false, defaultValue = "1") int range
		   ) throws Exception{
		//List<BoardDTO> list = boardService.BoardList();
		// 전체 게시글 개수
		int listCnt = boardService.boardCount();
		  //Pagination 객체생성
		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);
		
		model.addAttribute("pagination", pagination);
		model.addAttribute("list", boardService.BoardList(pagination));
	}
	
	//게시글 상세 목록
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public void selectBoardView(@RequestParam("bno") int bno, Model model)throws Exception {
		Board view = null;
		view = boardService.selectBoardView(bno);
		model.addAttribute("view", view);
	}
	// 글쓰기 페이지로 이동 
	@RequestMapping(value = "write", method = RequestMethod.GET)
	public void getWirte() throws Exception {
		
	}
	//게시글 등록 후 게시글 화면으로 이동 
	@RequestMapping(value = "write", method = RequestMethod.POST)
	public String postWrite(Board dto)throws Exception {
		boardService.insertBoard(dto);
		return "redirect:/board/boardList";
	}	
	//게시글 수정 
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String boardUpdate(@RequestParam("bno") int bno, Board dto)throws Exception {
		boardService.updateBoard(dto);
		return "redirect:/board/boardList";
	}
	//게시글 삭제
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public String boardDelete(@RequestParam("bno") int bno)throws Exception {
		boardService.deleteBoard(bno);
		return "redirect:/board/boardList";
	}
	
}




