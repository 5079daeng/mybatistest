package co.kr.mybatis.service;

import co.kr.mybatis.dto.post;
import co.kr.mybatis.dto.postList;

public interface boradServiceImpl {

	postList getpostlist(int page);

	post getSelecPost(int idpost);
	
	int login(String id, String pw);
}
