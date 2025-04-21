package com.grepp.spring.app.model.book.repository;

import com.grepp.spring.app.model.book.entity.Book;
import java.nio.channels.FileChannel;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>, BookRepositoryCustom {

}
