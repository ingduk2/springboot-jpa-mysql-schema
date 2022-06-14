package com.practice.jpa.schema.domain;

import java.util.List;

public interface BookReader {
    List<BookInfo> findAll();
}
