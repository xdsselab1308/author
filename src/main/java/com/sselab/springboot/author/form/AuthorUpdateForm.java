package com.sselab.springboot.author.form;

import com.sselab.springboot.author.model.AuthorModel;

public class AuthorUpdateForm {

	private Long authorId;
    private String authorname;
    private String email;
    private String address;
    
    public AuthorModel toModel() {
    	AuthorModel model = new AuthorModel(authorId, authorname, email, address);
	    return model;
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
	public Long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
	
	

}






