package com.hucet.fcm.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

@Data
public class GoogleTokenDto implements Serializable {
    @NotEmpty
    private String token;
}
