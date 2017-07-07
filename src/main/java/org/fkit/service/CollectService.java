package org.fkit.service;

import java.util.List;

import org.fkit.domain.Collect;

public interface CollectService {
	List<Collect> getAll();
	Collect removeCollect(int book_id);
	Collect findCollect(int book_id);
	Collect saveCollect(int book_id);
	void clearCollect();
}
