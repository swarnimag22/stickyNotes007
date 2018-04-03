package com.stickynotes.dao;

import com.stickynotes.entity.NotesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<NotesEntity,Long> {

}
