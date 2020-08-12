package com.sunghyun.board.controller;

import java.util.List;

import javax.annotation.Resource;

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
		List<BoardDto> list = (List<BoardDto>) service.selectData();
		for (int i = 0; i < list.size(); i++) {
			mv.addObject("content" + i, list.get(i).getContent());
		}
		return mv;
	}
}
