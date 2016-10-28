package com.sselab.springboot.author.dao;

import com.sselab.springboot.author.model.AuthorModel;


public interface  AuthorDao {
	
	AuthorModel getInfo(String bookname);
	
	int insert(AuthorModel model);

}
