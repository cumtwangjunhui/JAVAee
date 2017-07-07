package org.fkit.service;

import java.util.List;

import org.fkit.domain.Cart;

public interface CartService {
	List<Cart> getAll();
	Cart findCart(int book_id);
	Cart saveCart(int book_id);
	Cart addCart(int book_id);
	Cart reduceCart(int book_id);
	Cart removeCart(int book_id);
	void clearCart();
}
