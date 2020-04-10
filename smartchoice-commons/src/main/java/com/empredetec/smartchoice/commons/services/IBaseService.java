package com.empredetec.smartchoice.commons.services;

import java.util.Optional;

public interface IBaseService<E> {

	public Iterable<E> findAll();
	
	public Optional<E> findById(Long id);
	
	public E save(E entity);
	
	public void deleteById(Long id);
	
}
