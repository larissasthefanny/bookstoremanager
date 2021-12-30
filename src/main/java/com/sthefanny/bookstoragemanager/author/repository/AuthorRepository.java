package com.sthefanny.bookstoragemanager.author.repository;

import com.sthefanny.bookstoragemanager.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
