package com.empredetec.smartchoice.commons.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public class BaseServiceImpl<E, R extends CrudRepository<E, Long>> implements IBaseService<E> {

	@Autowired
	protected R repositoy; 
	
	@Transactional(readOnly = true)
	@Override
	public Iterable<E> findAll() {
		return repositoy.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<E> findById(Long id) {
		return repositoy.findById(id);
	}

	@Override
	public E save(E entity) {
		return repositoy.save(entity);
	}

	@Override
	public void deleteById(Long id) {
		repositoy.deleteById(id);
	}

	
}
