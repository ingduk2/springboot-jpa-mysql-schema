package com.practice.jpa.schema.interfaces;

import com.practice.jpa.schema.application.BookFacade;
import com.practice.jpa.schema.domain.BookInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookFacade bookFacade;
    private final BookMapper bookMapper;

    @GetMapping("/books")
    public List<BookDTO> findAll() {
        var bookInfos = bookFacade.findAll();
        var response = bookMapper.of(bookInfos);
        return response;
    }
}
