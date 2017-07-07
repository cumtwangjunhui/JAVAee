package org.fkit.service.impl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.fkit.domain.Cart;
import org.fkit.mapper.CartMapper;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("cartService")
public class CartServiceImpl implements CartService{

	@Autowired
	private CartMapper cartMapper;

	@Override
	public List<Cart> getAll() {
		// TODO Auto-generated method stub
		return cartMapper.findAll();
	}
	
	@Override
	public Cart findCart(int book_id) {
		// TODO Auto-generated method stub
		return cartMapper.findWithId(book_id);
	}

	@Override
	public Cart saveCart(int book_id) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.setBook_id(book_id);
		final int i = 1;
		cart.setCount(i);
		cartMapper.saveCart(cart);
		return cart;
	}
	@Override
	public Cart addCart(int book_id) {
		// TODO Auto-generated method stub
		Cart cart = cartMapper.findWithId(book_id);
		cartMapper.addCart(cart);
		return cart;
	}

	@Override
	public Cart reduceCart(int book_id) {
		// TODO Auto-generated method stub
		
				Cart cart = cartMapper.findWithId(book_id);
				if (cart.getCount() >= 1) {
					cartMapper.reduceCart(cart);
				} else {
					Error e = null;
					throw new RuntimeErrorException(e);
				}
				return cart;
	}

	@Override
	public void clearCart() {
		// TODO Auto-generated method stub
		
		cartMapper.clearCart();
	}

	@Override
	public Cart removeCart(int book_id) {
		// TODO Auto-generated method stub
		Cart cart = cartMapper.findWithId(book_id);
		cartMapper.removeCart(cart);
		return cart;
	}

}

