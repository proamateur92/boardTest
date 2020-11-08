package kr.co.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	String namespace = "boardMapper";
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<BoardVO> ListAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".listAll");
	}
}
