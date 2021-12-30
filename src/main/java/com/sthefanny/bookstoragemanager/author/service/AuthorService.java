package com.sthefanny.bookstoragemanager.author.service;

import com.sthefanny.bookstoragemanager.author.mapper.AuthorMapper;
import com.sthefanny.bookstoragemanager.author.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final static AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}
