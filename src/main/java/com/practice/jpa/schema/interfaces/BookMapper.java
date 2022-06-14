package com.practice.jpa.schema.interfaces;

import com.practice.jpa.schema.domain.BookInfo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookMapper {

    public List<BookDTO> of(List<BookInfo> info) {
        return info.stream()
                .map(BookDTO::fromInfo)
                .collect(Collectors.toList());
    }
}
