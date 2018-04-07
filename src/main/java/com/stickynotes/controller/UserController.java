package com.stickynotes.controller;

import com.stickynotes.dao.NotesRepository;
import com.stickynotes.dao.UserRepository;
import com.stickynotes.entity.NotesEntity;
import com.stickynotes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import request.NotesRequest;
import request.TestRequest;
import request.UserRequest;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String index() {
        return new String("Hello");
    }

    @RequestMapping(path = "/test", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public String index2(@RequestBody TestRequest testRequest) {
        return new String(testRequest.toString());
    }

    @RequestMapping(path = "/createUser", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public  String addNote(@RequestBody UserRequest request) {
        return userService.createUser(request.getName(), request.getEmailId(), request.getPassword(), request.getActive());
    }
}
