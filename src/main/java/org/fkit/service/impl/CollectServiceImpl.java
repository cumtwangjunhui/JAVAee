package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Collect;
import org.fkit.mapper.CollectMapper;
import org.fkit.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("collectService")
public class CollectServiceImpl implements CollectService{
	@Autowired
	private CollectMapper collectMapper;
	@Override
	public List<Collect> getAll() {
		// TODO Auto-generated method stub
		return collectMapper.findAll();
	}

	@Override
	public Collect removeCollect(int book_id) {
		// TODO Auto-generated method stub
		Collect collect = collectMapper.findWithId(book_id);
		collectMapper.removeCollect(collect);
		return collect;
	}

	@Override
	public Collect findCollect(int book_id) {
		// TODO Auto-generated method stub
		return collectMapper.findWithId(book_id);
	}

	@Override
	public Collect saveCollect(int book_id) {
		// TODO Auto-generated method stub
		Collect collect=new Collect();
		collect.setBook_id(book_id);
		collectMapper.saveCollect(collect);
		return collect;
	}

	@Override
	public void clearCollect() {
		// TODO Auto-generated method stub
		collectMapper.clearCollect();
	}

}
