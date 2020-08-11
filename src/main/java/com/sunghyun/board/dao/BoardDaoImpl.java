package com.sunghyun.board.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao{
	@Autowired
	protected SqlSessionTemplate sqlSession;
	
	@Override
	public String selectData() throws Exception {
		return sqlSession.selectOne("sql.selectTable");
	}
}
