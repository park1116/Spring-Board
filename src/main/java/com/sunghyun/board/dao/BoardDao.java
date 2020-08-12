package com.sunghyun.board.dao;

import java.util.List;

import com.sunghyun.board.dto.BoardDto;

public interface BoardDao {
	public List<BoardDto> selectData() throws Exception;
}
