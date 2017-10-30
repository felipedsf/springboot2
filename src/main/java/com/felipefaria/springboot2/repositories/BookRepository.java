package com.felipefaria.springboot2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipefaria.springboot2.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
