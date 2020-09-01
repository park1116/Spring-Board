package com.sunghyun.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunghyun.board.dao.BoardDao;
import com.sunghyun.board.dto.BoardDto;
import com.sunghyun.board.dto.PagingDto;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDao boardDao;
	
	@Override
	public List<BoardDto> selectData() throws Exception {
		return boardDao.selectData();
	}


	@Override
	public int countSearchData(String title) throws Exception {
		return boardDao.countSearchData(title);
	}
	
	@Override
	public List<BoardDto> searchData(PagingDto dto) throws Exception {
		return boardDao.searchData(dto);
	}

	@Override
	public int insertData(BoardDto dto) throws Exception {
		return boardDao.insertData(dto);
	}

	@Override
	public BoardDto readData(String title) throws Exception {
		return boardDao.readData(title);
	}

	@Override
	public void deleteData(int num) throws Exception {
		boardDao.deleteData(num);
	}

	@Override
	public BoardDto updateData(BoardDto dto) throws Exception {
		boardDao.updateData(dto);
		return boardDao.readData(dto.getTitle());
	}

	@Override
	public BoardDto numData(int num) throws Exception {
		return boardDao.numData(num);
	}

	@Override
	public BoardDto checkData(BoardDto dto) throws Exception {
		return boardDao.checkData(dto);
	}

	@Override
	public int countBoard() throws Exception {
		return boardDao.countBoard();
	}

	@Override
	public List<BoardDto> selectBoard(PagingDto dto) throws Exception {
		return boardDao.selectBoard(dto);
	}
}
