package com.felipefaria.springboot2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipefaria.springboot2.models.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
