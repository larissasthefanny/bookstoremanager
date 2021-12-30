package com.sthefanny.bookstoragemanager.user.repository;

import com.sthefanny.bookstoragemanager.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
