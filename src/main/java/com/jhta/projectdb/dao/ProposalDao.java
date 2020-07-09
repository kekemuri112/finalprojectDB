package com.jhta.projectdb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.ProposalVo;
@Repository
public class ProposalDao {
	@Autowired
	private SqlSession session;
	private final String NAMESPACE="com.jhta.mybatis.mapper.proposal";
	public List<ProposalVo> selectList(){
		List<ProposalVo> list=session.selectList(NAMESPACE+".selectList");
		System.out.println("dao:"+list);
		return list;
	}
}
