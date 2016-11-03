package com.sselab.springboot.author.form;

import com.sselab.springboot.author.model.AuthorModel;

public class AuthorForm {

    private String authorname;
    private String email;
    private String address;
    
    public AuthorModel toModel() {
    	AuthorModel model = new AuthorModel(null, authorname, email, address);
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

}





