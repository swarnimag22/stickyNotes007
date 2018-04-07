package com.stickynotes.service;

public interface UserService {

    String createUser( String name, String emailId, String password, Boolean isActive);
}
