package com.sunghyun.board.dao;

import java.util.List;

import com.sunghyun.board.dto.BoardDto;

public interface BoardDao {
	public List<BoardDto> selectData() throws Exception;
	public List<BoardDto> searchData(String title) throws Exception;
	public int insertData(BoardDto dto) throws Exception;
}
