package com.caseStudy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Document(collection = "books")

public class BookStore {
	@Id
	public int bookId;
	public String bookName;
	public String author;
	public double rating;
	public String description;
	public double bookPrice;
	
	public BookStore() {
		super();
	}
	public BookStore(int bookId, String bookName, String author, double rating, String description, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.rating = rating;
		this.description = description;
		this.bookPrice = bookPrice;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	} 

}
