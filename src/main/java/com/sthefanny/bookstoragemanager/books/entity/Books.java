package com.sthefanny.bookstoragemanager.books.entity;

import com.sthefanny.bookstoragemanager.user.entity.User;
import com.sthefanny.bookstoragemanager.auditable.entity.Auditable;
import com.sthefanny.bookstoragemanager.author.entity.Author;
import com.sthefanny.bookstoragemanager.publisher.entity.Publisher;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Books extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nameBook;

    @Column(nullable = false)
    private String isbn;

    @Column(columnDefinition = "integer default 0")
    private int pages;

    @Column(columnDefinition = "integer default 0")
    private int chapters;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Author author;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Publisher publisher;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private User user;

}
