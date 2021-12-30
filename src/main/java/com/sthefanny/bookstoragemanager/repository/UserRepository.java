package com.sthefanny.bookstoragemanager.repository;

import com.sthefanny.bookstoragemanager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
