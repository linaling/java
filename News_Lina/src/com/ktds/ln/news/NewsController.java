package com.ktds.ln.news;

import java.util.Scanner;

import com.ktds.ln.news.biz.NewsBizImpl;

public class NewsController {

	public void start() {

		Scanner input = new Scanner(System.in);
		NewsBizImpl newsBizImpl = new NewsBizImpl();

		while (true) {
			System.out.println("=====================================");
			System.out.println(" 1. 전체 뉴스 기사 제목 조회");
			System.out.println(" 2. 뉴스 기사 제목 등록");
			System.out.println(" 3. 종료");
			System.out.println("=====================================");
			System.out.print("선택해주세요 : ");
			int selectNum = input.nextInt();
			input.nextLine();

			if (selectNum == 1) {
				newsBizImpl.queryAllNews();
			} 
			else if (selectNum == 2) {
				newsBizImpl.addNewNews();
			} 
			else if (selectNum == 3)
				break;
		}
	}

	public static void main(String[] args) {

		NewsController newsController = new NewsController();
		newsController.start();

	}
}
