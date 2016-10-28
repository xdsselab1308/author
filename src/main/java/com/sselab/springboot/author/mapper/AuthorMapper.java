package com.sselab.springboot.author.mapper;

import com.sselab.springboot.author.common.BaseMapper;
import com.sselab.springboot.author.model.AuthorModel;

public interface AuthorMapper extends BaseMapper<AuthorModel>{
	
	public AuthorModel findAuthorInfo(String bookname);

}


