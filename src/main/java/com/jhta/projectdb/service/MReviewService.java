package com.jhta.projectdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.projectdb.dao.MReviewDao;
import com.jhta.projectdb.vo.MReviewVo;

@Service
public class MReviewService {
	@Autowired
	private MReviewDao mReviewDao;

	public int mreviewInsert(MReviewVo vo) {
		return mReviewDao.mreviewInsert(vo);
	}
	public int mreviewUpdate(MReviewVo vo) {
		return mReviewDao.mreviewUpdate(vo);
	}
	public int mreviewDelete(MReviewVo vo) {
		return mReviewDao.mreviewDelete(vo);
	}
}
