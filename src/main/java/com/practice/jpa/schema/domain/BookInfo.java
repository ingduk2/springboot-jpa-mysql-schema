package com.practice.jpa.schema.domain;

import com.practice.jpa.schema.domain.entity.Book;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookInfo {

    private Long bookStoreId;
    private String bookStoreName;
    private Long bookId;
    private String bookName;
    private int bookPrice;

    @Builder
    public BookInfo(Long bookStoreId, String bookStoreName, Long bookId, String bookName, int bookPrice) {
        this.bookStoreId = bookStoreId;
        this.bookStoreName = bookStoreName;
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public static BookInfo fromEntity(Book book) {
        return BookInfo.builder()
                .bookStoreId(book.getBookStore().getId())
                .bookStoreName(book.getBookStore().getName())
                .bookId(book.getId())
                .bookName(book.getName())
                .bookPrice(book.getPrice())
                .build();
    }
}
