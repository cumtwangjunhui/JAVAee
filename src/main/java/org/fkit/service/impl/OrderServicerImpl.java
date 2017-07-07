package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Order;
import org.fkit.mapper.OrderMapper;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("orderService")
public class OrderServicerImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderMapper.findAll();
	}

	@Override
	public Order removeOrder(int book_id) {
		// TODO Auto-generated method stub
		Order order = orderMapper.findWithId(book_id);
		orderMapper.removeOrder(order);
		return order;
	}

	@Override
	public Order findOrder(int book_id) {
		// TODO Auto-generated method stub
		return orderMapper.findWithId(book_id);
	}

	@Override
	public Order saveOrder(int book_id) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setBook_id(book_id);
		final int i = 1;
		order.setCount(i);
		orderMapper.saveOrder(order);
		return order;
	}

	@Override
	public Order addOrder(int book_id) {
		// TODO Auto-generated method stub
		Order order = orderMapper.findWithId(book_id);
		orderMapper.addOrder(order);
		return order;
	}

}
