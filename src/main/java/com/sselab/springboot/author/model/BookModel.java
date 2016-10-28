package com.sselab.springboot.author.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "BOOK")
public class BookModel {

    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name =  "BOOK_PK_ID")
    private Long bookId;

    @Column(name =  "BOOK_NAME")
    private String bookname;

    @Column(name =  "BOOK_YEAR")
    private String year;
    
    @Column(name =  "BOOK_FK_AUTHOR_ID")
    private String authorId;


	public Long getBookId() {
		return bookId;
	}


	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}


	public String getBookname() {
		return bookname;
	}


	public void setBookname(String bookname) {
		this.bookname = bookname;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getAuthorId() {
		return authorId;
	}


	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}


	@Override
	public String toString() {
		return "BookModel [bookId=" + bookId + ", bookname=" + 
				bookname + ", year=" + year+ ", authorId=" + authorId + "]";
	}
}




