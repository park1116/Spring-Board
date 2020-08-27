package com.sunghyun.board.service;

import java.util.List;

import com.sunghyun.board.dto.BoardDto;
import com.sunghyun.board.dto.PagingDto;

public interface BoardService {
	public List<BoardDto> selectData() throws Exception;
	public List<BoardDto> searchData(String title) throws Exception;
	public BoardDto readData(String title) throws Exception;
	public BoardDto numData(int num) throws Exception;
	public int insertData(BoardDto dto) throws Exception;
	public void deleteData(int num) throws Exception;
	public BoardDto updateData(BoardDto dto) throws Exception;
	public BoardDto checkData(BoardDto dto) throws Exception;
	// 게시물 총 갯수
	public int countBoard();
	// 페이징 처리 게시글 조회
	public List<BoardDto> selectBoard(PagingDto dto);
}
