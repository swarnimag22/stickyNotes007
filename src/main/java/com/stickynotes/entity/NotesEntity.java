package com.stickynotes.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notes")
public class NotesEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "data")
    private String data;

    @Column(name = "type")
    private String type;

    @JoinColumn(name = "user_id")
    @ManyToOne( cascade = CascadeType.ALL)
    private UserEntity user;

    @Column(name = "created")
    private Date created;

    @Column(name = "updated")
    private  Date updated;

    @Column(name = "is_delete")
    private  Boolean deleted;


    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "NotesEntity{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", type='" + type + '\'' +
                ", user=" + user +
                ", created=" + created +
                ", updated=" + updated +
                ", deleted=" + deleted +
                '}';
    }
}
