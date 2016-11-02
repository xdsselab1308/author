package com.sselab.springboot.author.dao;

import java.util.List;

import com.sselab.springboot.author.model.AuthorModel;


public interface  AuthorDao {
	
	AuthorModel getInfo(String bookname);
	
	int insert(AuthorModel model);
	
	int update(AuthorModel entity);
	
	int deleteById(long authorId);
	
	AuthorModel selectById(long authorId);
	
	List<AuthorModel> selectPaged(int page, int limits);


}
