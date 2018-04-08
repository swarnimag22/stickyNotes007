package com.stickynotes.controller;

import com.stickynotes.dao.NotesRepository;
import com.stickynotes.entity.NotesEntity;
import com.stickynotes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import request.NotesRequest;
import request.TestRequest;

@RequestMapping("/notes")
@RestController
public class NotesController {

    @Autowired
    private NotesService notesService;

  /*  public String index() {
        return new String("Hello");
    }

    @RequestMapping(path = "/test", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public String index2(@RequestBody TestRequest testRequest) {
        return new String(testRequest.toString());
    } */

    @RequestMapping(path = "/addNote", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public String addNote(@RequestBody NotesRequest noteRequest) {
        return notesService.createNotes(noteRequest.getType(), noteRequest.getData(), noteRequest.getUserId(), noteRequest.getDeleted());
    }

}

