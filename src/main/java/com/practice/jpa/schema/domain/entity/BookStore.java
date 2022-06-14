package com.practice.jpa.schema.domain.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(catalog = "bookstore", name = "book_store_table")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
}
