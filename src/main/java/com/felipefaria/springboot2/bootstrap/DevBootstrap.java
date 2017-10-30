package com.felipefaria.springboot2.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.felipefaria.springboot2.models.Author;
import com.felipefaria.springboot2.models.Book;
import com.felipefaria.springboot2.models.Publisher;
import com.felipefaria.springboot2.repositories.AuthorRepository;
import com.felipefaria.springboot2.repositories.BookRepository;
import com.felipefaria.springboot2.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;

	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}

	private void initData() {

		Publisher publisher = new Publisher();
		publisher.setName("foo");

		publisherRepository.save(publisher);

		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "1234", publisher);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);

		authorRepository.save(eric);
		bookRepository.save(ddd);

	}

}
