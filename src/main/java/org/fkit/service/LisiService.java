package org.fkit.service;

import java.util.List;

import org.fkit.domain.Lisi;

public interface LisiService {
	List<Lisi> getAll();
	Lisi findLisi(int book_id);
	Lisi saveLisi(int book_id);
	Lisi pingjia(String wuliu,String ziliang,String fuwu,int book_id);
}
