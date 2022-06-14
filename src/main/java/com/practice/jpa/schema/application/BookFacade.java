package com.practice.jpa.schema.application;

import com.practice.jpa.schema.domain.BookInfo;
import com.practice.jpa.schema.domain.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class BookFacade {

    private final BookService bookService;

    public List<BookInfo> findAll() {
        return bookService.findAll();
    }
}
