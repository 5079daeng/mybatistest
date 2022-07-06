package co.kr.mybatis.service;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import co.kr.mybatis.dto.post;
import co.kr.mybatis.dto.postList;
import co.kr.mybatis.mapper.boardMapper;

@Service
public class boardService implements boradServiceImpl {

	@Inject
	private boardMapper mapper;
	private static final int Post_Count_Per_Page = 10;

	@Override
	public postList getpostlist(int page) {

		int tempPage = page;
		postList postlist = null;

		int totalPost = mapper.getboardcount();

		List<post> list = null;
		int firstrow = 0;
		int endrow = 0;
		if (totalPost > 0) {
			firstrow = (page - 1) * Post_Count_Per_Page + 1;
			endrow = firstrow + Post_Count_Per_Page - 1;
			list = mapper.selectedPost(firstrow, endrow);
		} else {
			tempPage = 0;
			list = Collections.emptyList();

		}
		postlist = new postList(totalPost, tempPage, list, Post_Count_Per_Page, firstrow, endrow);

		return postlist;

	}

	@Override
	public post getSelecPost(int idpost) {
		post post = mapper.selecPost(idpost);
		return post;
	}

	@Override
	public int login(String id, String pw) {
		int result = mapper.logint(id, pw);
		return result;
	}

}
