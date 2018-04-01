package com.stickynotes.entity;

import javax.persistence.*;

@Entity
@Table(name = "notes")
public class NotesEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "note_content")
    private String noteContent;

    @Column(name = "email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "NotesEntity{" +
                "id=" + id +
                ", noteContent='" + noteContent + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
