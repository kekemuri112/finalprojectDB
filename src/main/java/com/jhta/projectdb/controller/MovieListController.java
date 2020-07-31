package com.jhta.projectdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jhta.projectdb.service.MovieListService;
import com.jhta.projectdb.service.ReviewListService;
import com.jhta.projectdb.vo.AllMoviesVo;
import com.jhta.projectdb.vo.MovieDetailVo;

@RestController
public class MovieListController {
	@Autowired
	private MovieListService movieListService;
	@Autowired
	private ReviewListService reviewService;
	
	//영화 nav클릭했을 때 처음으로 터지는 함수(예매율순으로 상영 영화 불러오기)
	@RequestMapping("/movie/showAllMovies.do")
	public List<AllMoviesVo> showAllMovies(){
		List<AllMoviesVo> allMovieList=movieListService.showAllMovies();
		return allMovieList;
	}
	
	//영화 평점순 클릭했을 때 함수(평점순으로 상영 영화 불러오기)
	@RequestMapping("/movie/showAllMoviesMRate.do")
	public List<AllMoviesVo> showAllMoviesMRate(){
		List<AllMoviesVo> allMovieList=movieListService.moviesByMRate();
		return allMovieList;
	}
	
	@RequestMapping("/movie/detailInfo.do")
	public MovieDetailVo detailInfo(@RequestParam int filmNum) {
		MovieDetailVo movieDetailVo=movieListService.showMovieDetailInfo(filmNum);
		return movieDetailVo;
	}
	
	@RequestMapping("/movie/movieDetailRate.do")
	public AllMoviesVo movieDetailRate(@RequestParam int filmNum) {
		return movieListService.showMovieDetailRate(filmNum);
	}
	
	
	@RequestMapping("/movie/reviewCount.do")
	public int reviewCount(@RequestParam int filmNum) {
		int reviewCount=reviewService.count(filmNum);
		return reviewCount;
	}
	
	
	@RequestMapping("/movie/movieGrade.do")
	public int movieGrade(@RequestParam int filmNum) {
		return reviewService.movieGrade(filmNum);
	}
	
}
 