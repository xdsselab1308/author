package com.sselab.springboot.author.service;

import java.util.List;

import com.sselab.springboot.author.model.AuthorModel;
import com.sselab.springboot.form.AuthorForm;
import com.sselab.springboot.form.AuthorUpdateForm;


public interface AuthorService {


	AuthorModel getAuthorInfo(String bookname);
	
	long add(AuthorForm form);
	
	long update(AuthorUpdateForm form);
	
	int deleteById(long authorId);
	
	AuthorModel getById(long authorId);
	
	List<AuthorModel> selectPaged(int page, int limits);
}


