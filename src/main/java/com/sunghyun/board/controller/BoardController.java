package com.sunghyun.board.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sunghyun.board.service.BoardService;

@Controller
public class BoardController {
	@Resource(name="boardService")
	private BoardService service;
	
	@RequestMapping("/main")
	public ModelAndView select(ModelAndView mv) throws Exception {
		mv.addObject("dbResult", service.selectData());
		mv.setViewName("main");
		return mv;
	}
}
