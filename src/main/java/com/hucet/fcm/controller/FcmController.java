package com.hucet.fcm.controller;

import com.hucet.fcm.domain.GoogleToken;
import com.hucet.fcm.dto.GoogleTokenDto;
import com.hucet.fcm.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.ValidationException;

@RestController
public class FcmController {

    @Autowired
    TokenService tokenService;

    @RequestMapping(value = "/register", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Long> registerToken(@RequestBody @Valid GoogleTokenDto dto, BindingResult result) {
        if (result.hasErrors()) {
            throw new ValidationException(result.toString());
        }

        GoogleToken token = tokenService.registerToken(dto);
        return new ResponseEntity<Long>(token.getId(), HttpStatus.OK);
    }
}

