package com.sselab.springboot.author.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sselab.springboot.author.model.AuthorModel;
import com.sselab.springboot.author.service.AuthorService;
import com.sselab.springboot.author.vm.AuthorBookVM;
import com.sselab.springboot.author.vm.BookVM;
import com.sselab.springboot.form.AuthorForm;

@RestController
public class AuthorController {

	private static final Log log = LogFactory.getLog(AuthorController.class);

    @Autowired
    private AuthorService authorService;

    @RequestMapping("/getAuthorInfo")
    @ResponseBody
    public AuthorModel getAuthorInfo(@RequestParam String bookname) {
    	AuthorModel author = authorService.getAuthorInfo(bookname);
        return author;
    }
    
    @RequestMapping("/getAuthorBookInfo")
    @ResponseBody
    public AuthorBookVM getAuthorBookInfo(@RequestParam String bookname, @RequestParam String ip) {
    	
    	AuthorModel author = authorService.getAuthorInfo(bookname);    	
    	RestTemplate restTemplate = new RestTemplate();
    	List<BookVM> list = restTemplate.getForObject("http://"+ip+":8081/getBookInfo?authorId="+author.getAuthorId(),List.class);
    	AuthorBookVM authorbook = new AuthorBookVM();
    	authorbook.setAuthorId(author.getAuthorId());
    	authorbook.setAuthorname(author.getAuthorname());
    	authorbook.setAddress(author.getAddress());
    	authorbook.setEmail(author.getEmail());
    	authorbook.setBook((ArrayList<BookVM>) list);    	
        return authorbook;
    }
    
    @RequestMapping("/insertAuthor")
    @ResponseBody
    public long add(@Valid @RequestBody AuthorForm form) {
        long authorId = authorService.add(form);
        return authorId;
    }
}
