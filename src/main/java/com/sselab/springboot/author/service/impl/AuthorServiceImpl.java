package com.sselab.springboot.author.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sselab.springboot.author.dao.AuthorDao;
import com.sselab.springboot.author.model.AuthorModel;
import com.sselab.springboot.author.service.AuthorService;
import com.sselab.springboot.form.AuthorForm;



@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorDao authorDao;

    @Override
	public AuthorModel getAuthorInfo(String bookname){
    	
		return authorDao.getInfo(bookname);
	}

	@Override
	public long add(AuthorForm form) {
		// TODO Auto-generated method stub
		AuthorModel model = new AuthorModel(null, form.getAuthorname(), form.getEmail(), form.getAddress());
		authorDao.insert(model);
        return model.getAuthorId();
	}



    
    
}


