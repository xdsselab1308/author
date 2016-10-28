package com.sselab.springboot.author.service;

import com.sselab.springboot.author.model.AuthorModel;
import com.sselab.springboot.form.AuthorForm;


public interface AuthorService {

	public AuthorModel getAuthorInfo(String bookname);
	
	long add(AuthorForm form);
}


