package com.practice.jpa.schema.infrastructure;

import com.practice.jpa.schema.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
