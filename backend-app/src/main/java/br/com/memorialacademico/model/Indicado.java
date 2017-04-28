package br.com.memorialacademico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by i857583 on 12/03/17.
 */
@Entity
public class Indicado {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 200)
    private String name;

    @Column(length = 150)
    private String fileLink;

    @Column
    private Integer year;

    public Indicado() {
    }

    public Indicado(String name, String fileLink, Integer year) {
        this.name = name;
        this.fileLink = fileLink;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Indicado{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fileLink='" + fileLink + '\'' +
                ", year=" + year +
                '}';
    }
}
