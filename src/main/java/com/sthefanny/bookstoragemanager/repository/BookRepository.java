package com.sthefanny.bookstoragemanager.repository;

import com.sthefanny.bookstoragemanager.entities.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books,Long> {
}
