package com.sunghyun.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunghyun.board.dto.BoardDto;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao{
	@Autowired
	protected SqlSessionTemplate sqlSession;
	
	@Override
	public List<BoardDto> selectData() throws Exception {
		return sqlSession.selectList("sql.selectTable");
	}
	
	@Override
	public List<BoardDto> searchData(String title) throws Exception {
		return sqlSession.selectList("sql.searchData", title);
	}
	
	@Override
	public int insertData(BoardDto dto) throws Exception {
		return sqlSession.insert("sql.insertData", dto);
	}
}
