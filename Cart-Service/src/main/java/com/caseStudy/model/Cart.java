package com.caseStudy.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "cartService")
public class Cart {
	@Id
	public int cartId;
	
	
	
	public List<BookStore> bookStores;
	
	public double total;

	public Cart() {
		super();
	}

	public Cart(int cartId, List<BookStore> bookStores, double total) {
		super();
		this.cartId = cartId;
		this.bookStores = bookStores;
		this.total = total;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public List<BookStore> getBookStores() {
		return bookStores;
	}

	public void setBookStores(List<BookStore> bookStores) {
		this.bookStores = bookStores;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	

}
