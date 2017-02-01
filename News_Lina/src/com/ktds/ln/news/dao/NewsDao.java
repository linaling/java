package com.ktds.ln.news.dao;

import java.util.List;

import com.ktds.ln.news.vo.NewsVO;

public interface NewsDao {

	public List<NewsVO> queryAllNews(); 
	public void addNewNews(NewsVO newsVO);
	
}
