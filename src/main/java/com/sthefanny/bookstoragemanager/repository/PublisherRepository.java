package com.sthefanny.bookstoragemanager.repository;

import com.sthefanny.bookstoragemanager.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
