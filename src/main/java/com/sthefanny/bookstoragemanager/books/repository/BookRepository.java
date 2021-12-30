package com.sthefanny.bookstoragemanager.books.repository;

import com.sthefanny.bookstoragemanager.books.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books,Long> {
}
