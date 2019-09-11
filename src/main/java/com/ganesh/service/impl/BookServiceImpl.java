package com.ganesh.service.impl;

import java.util.Collection;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.ganesh.model.Book;
import com.ganesh.repository.BookRepository;
import com.ganesh.service.IService;

import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements IService<Book> {
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Collection<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book findById(Long id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public Book saveOrUpdate(Book book) {
		return bookRepository.saveAndFlush(book);
	}

	@Override
	public String deleteById(Long id) {
		JSONObject jsonObject = new JSONObject();
		try {
			bookRepository.deleteById(id);
			jsonObject.put("message", "Book deleted successfully");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}
}