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
	public int quantity;
	public double bookPrice;

		
	
	public BookStore() {
		super();
	}
	public BookStore(int bookId, String bookName, int quantity, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	} 
	

}
