package br.com.memorialacademico.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by i857583 on 18/04/17.
 */
@Entity
public class Estatistica {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    public Estatistica() {
    }

    @Column
    private Long accessTotalNum;

    public Long getAccessTotalNum() {
        return accessTotalNum;
    }

    public void setAccessTotalNum(Long accessTotalNum) {
        this.accessTotalNum = accessTotalNum;
    }
}
