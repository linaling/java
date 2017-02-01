package com.ktds.ln.news.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktds.ln.news.vo.NewsVO;

public class NewsDaoImpl implements NewsDao {

	private List<NewsVO> newsList;
	
	public NewsDaoImpl() {
		newsList = new ArrayList<NewsVO>();
	}
	
	@Override
	public List<NewsVO> queryAllNews() {
		return 	newsList;
	}

	@Override
	public void addNewNews(NewsVO newsVO) {
		newsList.add(newsVO);
		
	}

}
