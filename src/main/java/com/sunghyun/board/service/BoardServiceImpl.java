package com.sunghyun.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunghyun.board.dao.BoardDao;
import com.sunghyun.board.dto.BoardDto;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDao boardDao;
	
	@Override
	public List<BoardDto> selectData() throws Exception {
		return boardDao.selectData();
	}
	
	@Override
	public List<BoardDto> searchData(String title) throws Exception {
		return boardDao.searchData(title);
	}

	@Override
	public int insertData(BoardDto dto) throws Exception {
		return boardDao.insertData(dto);
	}
}
