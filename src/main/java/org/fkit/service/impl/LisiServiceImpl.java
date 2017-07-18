package org.fkit.service.impl;

import java.util.List;
import org.fkit.domain.Lisi;
import org.fkit.mapper.LisiMapper;
import org.fkit.service.LisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("lisiService")
public class LisiServiceImpl implements LisiService{
	@Autowired
	private LisiMapper lisiMapper;
	@Override
	public List<Lisi> getAll() {
		// TODO Auto-generated method stub
		return lisiMapper.findAll();
	}

	@Override
	public Lisi findLisi(int book_id) {
		// TODO Auto-generated method stub
		return lisiMapper.findWithId(book_id);
	}

	@Override
	public Lisi saveLisi(int book_id) {
		// TODO Auto-generated method stub
		Lisi lisi=new Lisi();
		lisi.setBook_id(book_id);
		lisiMapper.saveLisi(lisi);
		return lisi;
	}

	@Override
	public Lisi pingjia(String wuliu, String ziliang, String fuwu, int book_id) {
		// TODO Auto-generated method stub
		Lisi lisi=new Lisi();
		lisi.setWuliu(wuliu);
		lisi.setBook_id(book_id);
		lisi.setZiliang(ziliang);
		lisi.setFuwu(fuwu);
		lisiMapper.ping(lisi);
		return lisi;
		
	}

}
