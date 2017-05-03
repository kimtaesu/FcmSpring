package com.hucet.fcm.domain;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class GoogleToken {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String token;
}
