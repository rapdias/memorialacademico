package br.com.memorialacademico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by i857583 on 18/04/17.
 */

@Entity
public class Mensagem {

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 200)
    private String name;

    @Column
    private String email;

    @Column(length = 600)
    private String message;

    @Column
    private boolean journal;

    public Mensagem(String name, String email, String message, boolean journal) {
        this.name = name;
        this.email = email;
        this.message = message;
        this.journal = journal;
    }

    public Mensagem() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isJournal() {
        return journal;
    }

    public void setJournal(boolean journal) {
        this.journal = journal;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
