package com.sunghyun.board.service;

import java.util.List;

import com.sunghyun.board.dto.BoardDto;

public interface BoardService {
	public List<BoardDto> selectData() throws Exception;
	public List<BoardDto> searchData(String title) throws Exception;
	public BoardDto readData(String title) throws Exception;
	public int insertData(BoardDto dto) throws Exception;
	public void deleteData(int num) throws Exception;
}
