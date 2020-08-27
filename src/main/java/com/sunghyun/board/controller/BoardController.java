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
	public ModelAndView isnert(ModelAndView mv, HttpServletRequest request) throws Exception {
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		BoardDto check = (BoardDto) service.readData(title);
		if(check == null) {
			BoardDto dto = new BoardDto();
			dto.setTitle(title);
			dto.setName(name);
			dto.setContent(content);
			service.insertData(dto);
			mv.setViewName("main");
			mv.addObject("list", service.selectData());
		} else {
			mv.setViewName("create");
			mv.addObject("check", "false");
		}
		return mv;
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
		String title = request.getParameter("title");
		mv.setViewName("read");
		mv.addObject("check", "true");
		mv.addObject("dto", service.readData(title));
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(ModelAndView mv, HttpServletRequest request) throws Exception {
		int num = Integer.parseInt(request.getParameter("num"));
		service.deleteData(num);
		mv.setViewName("main");
		mv.addObject("list", service.selectData());
		return mv;
	}
	
	@RequestMapping("/revise")
	public ModelAndView revise(ModelAndView mv, HttpServletRequest request) throws Exception {
		String title = request.getParameter("title");
		mv.setViewName("revise");
		mv.addObject("dto", service.readData(title));
		return mv;
	}

	@RequestMapping("/update")
	public ModelAndView update(ModelAndView mv,HttpServletRequest request) throws Exception {
		int num = Integer.parseInt(request.getParameter("num"));
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		BoardDto dto = new BoardDto();
		dto.setNum(num);
		dto.setTitle(title);
		dto.setName(name);
		dto.setContent(content);
		BoardDto check = service.checkData(dto);
		if(check == null) {
			mv.setViewName("read");
			mv.addObject("check", "true");
			mv.addObject("dto", service.updateData(dto));
		} else {
			mv.setViewName("read");
			mv.addObject("check", "false");
			mv.addObject("dto", service.numData(num));
		}
		return mv;
	}
}

