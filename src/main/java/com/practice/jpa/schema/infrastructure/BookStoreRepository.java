package com.practice.jpa.schema.infrastructure;

import com.practice.jpa.schema.domain.entity.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStoreRepository extends JpaRepository<BookStore, Long> {
}
