package com.sunghyun.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunghyun.board.dao.BoardDao;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDao boardDao;
	
	@Override
	public String selectData() throws Exception {
		return boardDao.selectData();
	}
}
