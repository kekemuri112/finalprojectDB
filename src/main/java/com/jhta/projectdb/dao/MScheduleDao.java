package com.jhta.projectdb.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.projectdb.vo.MScheduleListVo;
import com.jhta.projectdb.vo.MScheduleVo;

@Repository
public class MScheduleDao {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.jhta.mybatis.mapper.mschedule";
	private final String NAMESPACE2="com.jhta.mybatis.mapper.seat";
	
	//��ü ������ ��ȭ��� �����ֱ� ���� dao��
	public MScheduleListVo showAllMovieSchedule(HashMap<String, Object> map){
		System.out.println("dao�� Ÿ�� �־��");
		return sqlSession.selectOne(NAMESPACE+".getList",map);
	}
	
	//mschedule�� values insert
	public int insert(MScheduleVo vo) {
		System.out.println("�鸮�� �� �˾Ұ����� �����̾�");
		return sqlSession.insert(NAMESPACE+".insert",vo);
	}
	
	//mschedule ��¥ �����ϱ�
	public List<HashMap<String, Object>> list(int branchNum,String regDate) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("branchNum", branchNum);
		map.put("regDate", regDate);
		return sqlSession.selectList(NAMESPACE+".list", map);
	}
	
	//�¼� ���� �����ϱ�
	public List<HashMap<String, Object>> scount(int branchNum) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("branchNum", branchNum);
		return sqlSession.selectList(NAMESPACE2+".scount", map);
	}
	
}
