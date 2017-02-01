package com.ktds.ln.news.biz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ktds.ln.news.dao.NewsDao;
import com.ktds.ln.news.dao.NewsDaoImpl;
import com.ktds.ln.news.vo.NewsVO;

public class NewsBizImpl implements NewsBiz {

	private Scanner input;
	private NewsVO newsVO;
	private NewsDao newsDao;	
	private int selectNum;
	
	public NewsBizImpl() {
		input = new Scanner(System.in);
		newsDao = new NewsDaoImpl();
	}
	
	@Override
	public void queryAllNews() {
		List<NewsVO> newsList = newsDao.queryAllNews();
		for( NewsVO newsVO : newsList ){
			printNews(newsVO);
		}
	}

	private void printNews(NewsVO newsVO) {
		System.out.println("=====================================");
		System.out.println("뉴스 제목 : " + newsVO.getHeadLine());
		System.out.println("언론사 : " + newsVO.getNewspaperName());
		System.out.println("기자 이름 : " + newsVO.getReporterName());
	}
	
	@Override
	public void addNewNews() {
		newsVO = new NewsVO();
		System.out.println("뉴스 제목을 입력하세요 : ");
		newsVO.setHeadLine(input.nextLine());
		System.out.println("언론사를 입력하세요 : ");
		newsVO.setNewspaperName(input.nextLine());
		System.out.println("기자 이름을 입력하세요 : ");
		newsVO.setReporterName(input.nextLine());
		
		newsDao.addNewNews(newsVO);
	}

	
}
