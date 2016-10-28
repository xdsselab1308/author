package com.sselab.springboot.author.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sselab.springboot.author.dao.AuthorDao;
import com.sselab.springboot.author.mapper.AuthorMapper;
import com.sselab.springboot.author.model.AuthorModel;

import tk.mybatis.mapper.entity.Example;


@Repository
public class AuthorDaoImpl implements AuthorDao {

    @Autowired
    private AuthorMapper mapper;

	public AuthorModel getInfo(String bookname) {
		// TODO Auto-generated method stub
		return mapper.findAuthorInfo(bookname);
	}

	@Override
	public int insert(AuthorModel model) {
		// TODO Auto-generated method stub
		return mapper.insert(model);
	}

}



