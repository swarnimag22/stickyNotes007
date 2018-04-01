package com.stickynotes.sticky;

import com.stickynotes.dao.Notes;
import com.stickynotes.entity.NotesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import request.NotesRequest;
import request.TestRequest;

@RequestMapping("/api")
@RestController
public class TestController {

    @Autowired
    private Notes notesRepo;

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String index() {
        return new String("Hello");
    }

    @RequestMapping(path = "/test", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public String index2(@RequestBody TestRequest testRequest) {
        return new String(testRequest.toString());
    }

    @RequestMapping(path = "/addNote", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public  String addNote(@RequestBody NotesRequest noteRequest) {
        NotesEntity entity = new NotesEntity();
        entity.setEmail(noteRequest.getEmail());
        entity.setNoteContent(noteRequest.getNotes());
        notesRepo.save(entity);

        //
        return new String("succeded");
    }
}
