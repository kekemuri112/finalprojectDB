package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.BranchVo;

@Repository
public class BranchDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.branch";
	public List<BranchVo> list(HashMap<String,Object> map){
		return sqlSession.selectList(NAMESPACE+".list", map);
	}
	public int count(HashMap<String,Object> map) {
		return sqlSession.selectOne(NAMESPACE+".count", map);
	}
	
	public int appProposalNBranch(BranchVo brVo) {
		System.out.println("braDao"+brVo);
		return sqlSession.insert(NAMESPACE+".insert",brVo);
	}
	public List<BranchVo> searchCity(String cityaddr){
		return sqlSession.selectList(NAMESPACE+".searchCity",cityaddr);
	}
	public List<String> getName(){
		return sqlSession.selectList(NAMESPACE+".getName");
	}
	
	public List<HashMap<String, Object>> getChat(String brName){
		return sqlSession.selectList(NAMESPACE+".getChat",brName);
	}
	
	public List<String> getBranchRegion(){
		return sqlSession.selectList(NAMESPACE+".getBranchRegion");
	}
	
	public List<String> getBranch(String proAddr){
		return sqlSession.selectList(NAMESPACE+".getBranch",proAddr);
	}
	
	public List<HashMap<String,Object>> getNewBranch(){
		return sqlSession.selectList(NAMESPACE+".getNewBranch");
	}
}
