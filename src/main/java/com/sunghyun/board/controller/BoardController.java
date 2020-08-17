package com.sunghyun.board.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sunghyun.board.dto.BoardDto;
import com.sunghyun.board.service.BoardService;

@Controller
public class BoardController {
	@Resource(name = "boardService")
	private BoardService service;

	@RequestMapping("/")
	public ModelAndView select(ModelAndView mv) throws Exception {
		mv.setViewName("main");
		mv.addObject("list", service.selectData());	
		return mv;
	}
	
	@RequestMapping("/create")
	public ModelAndView create(ModelAndView mv) throws Exception {
		mv.setViewName("create");
		mv.addObject("list", service.selectData());
		return mv;
	}
	
	@RequestMapping("/insert")
	public String isnert(HttpServletRequest request) throws Exception {
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		BoardDto dto = new BoardDto();
		dto.setTitle(title);
		dto.setName(name);
		dto.setContent(content);
		service.insertData(dto);
		return "redirect:";
	}
	
	@RequestMapping("/search")
	public ModelAndView search(ModelAndView mv, HttpServletRequest request) throws Exception {
		String title = request.getParameter("searchData");
		mv.setViewName("main");
		mv.addObject("list", service.searchData(title));	
		return mv;
	}

	@RequestMapping("/read")
	public ModelAndView read(ModelAndView mv, HttpServletRequest request) throws Exception {
		String content = request.getParameter("content");
		System.out.println(content);
		mv.setViewName("main");	
		return mv;
	}
}
