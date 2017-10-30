package com.felipefaria.springboot2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipefaria.springboot2.models.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
