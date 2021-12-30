package com.sthefanny.bookstoragemanager.publisher.repository;

import com.sthefanny.bookstoragemanager.publisher.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
