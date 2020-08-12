package com.sunghyun.board.service;

import java.util.List;

import com.sunghyun.board.dto.BoardDto;

public interface BoardService {
	public List<BoardDto> selectData() throws Exception;
}
