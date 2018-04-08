package com.stickynotes.service.impl;


import com.stickynotes.dao.NotesRepository;
import com.stickynotes.dao.UserRepository;
import com.stickynotes.entity.NotesEntity;
import com.stickynotes.entity.UserEntity;
import com.stickynotes.service.NotesService;
//import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.Date;
import java.util.Optional;

@Service
public class NotesServiceImpl implements NotesService {

    private final NotesRepository notesRepository;
    private final UserRepository userRepository;

    @Autowired
    public NotesServiceImpl(NotesRepository notesRepository, UserRepository userRepository) {
        this.notesRepository = notesRepository;
        this.userRepository = userRepository;
    }


    @Override
    public String createNotes(String type, String data, Long userId, Boolean isDeleted) {

        NotesEntity notes = new NotesEntity();

        Optional<UserEntity> userEntityOptional = userRepository.findById(userId);
        UserEntity userEntity = userEntityOptional.get();

        if (userEntity != null) {

            try {
                notes.setType(type);
                notes.setData(data);
                notes.setDeleted(isDeleted);
                notes.setUser(userEntity);
                notesRepository.save(notes);
            } catch (Exception e) {
                return  e.getMessage();
            }
            return  "SUCCESS";

        } else {
            return "user entity is null";
        }
    }
}
