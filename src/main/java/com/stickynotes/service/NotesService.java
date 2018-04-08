package com.stickynotes.service;

import java.util.Date;

public interface NotesService {

    String createNotes(String type, String data, Long userId, Boolean isDeleted);
}
