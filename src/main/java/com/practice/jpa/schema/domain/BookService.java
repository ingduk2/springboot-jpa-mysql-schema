package com.practice.jpa.schema.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class BookService {

    private final BookReader bookReader;

    public List<BookInfo> findAll() {
        return bookReader.findAll();
    }
}
