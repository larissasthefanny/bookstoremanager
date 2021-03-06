package com.sthefanny.bookstoragemanager.author.controller;

import com.sthefanny.bookstoragemanager.author.service.AuthorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController implements AuthorControllerDocs{

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

}
