package com.practice.jpa.schema.interfaces;

import com.practice.jpa.schema.domain.BookInfo;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookDTO {

    private Long bookStoreId;
    private String bookStoreName;
    private Long bookId;
    private String bookName;
    private int bookPrice;

    @Builder
    public BookDTO(Long bookStoreId, String bookStoreName, Long bookId, String bookName, int bookPrice) {
        this.bookStoreId = bookStoreId;
        this.bookStoreName = bookStoreName;
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public static BookDTO fromInfo(BookInfo info) {
        return BookDTO.builder()
                .bookStoreId(info.getBookStoreId())
                .bookStoreName(info.getBookStoreName())
                .bookId(info.getBookId())
                .bookName(info.getBookName())
                .bookPrice(info.getBookPrice())
                .build();
    }
}
