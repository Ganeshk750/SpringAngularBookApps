package com.ganesh.service;

import java.util.Collection;

public interface Service<T> {
	
Collection<T> findAll();
	
	T findById(Long id);
	
	T saveOrUpdate(T t);
	
	String deleteById(Long id);

}
