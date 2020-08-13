package com.sunghyun.board.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
