package com.example.restaurant.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

abstract public class MemoryDbRepositoryAbstract<T extends MemoryDbEntity> implements MemoryDbRepositoryIfs<T> {
	
	private final List<T> db = new ArrayList<>();
	private int index = 0;

	@Override
	public Optional<T> findById(int index) {
		return db.stream().filter(it -> it.getIndex() == index).findFirst();
	}

	@Override
	public T save(T entity) {
		
		var optionalEntity = db.stream().filter(it -> it.getIndex() == entity.getIndex());
		
		if(optionalEntity.isEmpty()) {
			// db�� �̹� �����Ͱ� ���� ���
			index++;
			entity.setIndex(index);
			db.add(entity);
			return entity;
			
		} else {
			// db�� �̹� �����Ͱ� �ִ� ���
			var preIndex = optionalEntity.get().getIndex();
			entity.setIndex(preIndex);
			
			deleteById(preIndex);
			db.add(entity);
			return entity;
		}
	}

	@Override
	public void deleteById(int index) {
		var optionalEntity = db.stream().filter(it -> it.getIndex() == index).findFirst();
		if(optionalEntity.isPresent()) {
			db.remove(optionalEntity.get());
		}
		
	}

	@Override
	public List<T> listAll() {
		return db;
	}

	
}
