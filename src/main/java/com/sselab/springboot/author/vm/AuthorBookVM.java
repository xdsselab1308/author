package com.sselab.springboot.author.vm;

import java.util.ArrayList;

public class AuthorBookVM {
	
    private Long authorId;
    private String authorname;
    private String email;
    private String address;
    
    private ArrayList<BookVM> book;

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<BookVM> getBook() {
		return book;
	}

	public void setBook(ArrayList<BookVM> book) {
		this.book = book;
	}
   
}

