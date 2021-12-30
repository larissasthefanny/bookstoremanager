package com.sthefanny.bookstoragemanager.repository;

import com.sthefanny.bookstoragemanager.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
