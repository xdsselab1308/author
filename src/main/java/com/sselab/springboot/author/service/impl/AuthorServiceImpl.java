package com.sselab.springboot.author.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sselab.springboot.author.dao.AuthorDao;
import com.sselab.springboot.author.model.AuthorModel;
import com.sselab.springboot.author.service.AuthorService;
import com.sselab.springboot.form.AuthorForm;
import com.sselab.springboot.form.AuthorUpdateForm;



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

	@Override
	public long update(AuthorUpdateForm form) {
		// TODO Auto-generated method stub
		AuthorModel model = new AuthorModel(form.getAuthorId(), form.getAuthorname(), form.getEmail(), form.getAddress());
		authorDao.update(model);
        return model.getAuthorId();
	}

	@Override
	public int deleteById(long authorId) {
		// TODO Auto-generated method stub
		return authorDao.deleteById(authorId);
	}

	@Override
	public AuthorModel getById(long authorId) {
		// TODO Auto-generated method stub
		return authorDao.selectById(authorId);
	}

	@Override
	public List<AuthorModel> selectPaged(int page, int limits) {
		// TODO Auto-generated method stub
		List<AuthorModel> list = authorDao.selectPaged(page, limits);
		return list;
	}
	
	



    
    
}


