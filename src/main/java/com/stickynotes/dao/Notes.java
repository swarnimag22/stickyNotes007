package com.stickynotes.dao;

import com.stickynotes.entity.NotesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Notes extends JpaRepository<NotesEntity,Long> {

}
