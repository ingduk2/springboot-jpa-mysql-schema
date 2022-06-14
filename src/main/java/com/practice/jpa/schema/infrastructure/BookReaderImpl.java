package com.practice.jpa.schema.infrastructure;

import com.practice.jpa.schema.domain.BookInfo;
import com.practice.jpa.schema.domain.BookReader;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@RequiredArgsConstructor
public class BookReaderImpl implements BookReader {

    private final BookRepository bookRepository;
    @Override
    public List<BookInfo> findAll() {
        return bookRepository.findAll().stream()
                .map(BookInfo::fromEntity)
                .collect(Collectors.toList());
    }
}
