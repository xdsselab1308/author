package com.sselab.springboot.author.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sselab.springboot.author.common.BaseMapper;
import com.sselab.springboot.author.model.AuthorModel;

public interface AuthorMapper extends BaseMapper<AuthorModel>{
	
	public AuthorModel findAuthorInfo(String bookname);
	
	List<AuthorModel> selectPaged(
            @Param("offset") Integer offset,
            @Param("limits") Integer limits,
            @Param("orderBy") String orderBy
    );

}


