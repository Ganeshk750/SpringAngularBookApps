package com.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ganesh.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
