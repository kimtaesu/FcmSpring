package com.hucet.fcm.service;


import com.hucet.fcm.domain.GoogleToken;
import com.hucet.fcm.dto.GoogleTokenDto;
import com.hucet.fcm.repository.TokenRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {
    @Autowired
    TokenRepository repository;

    @Autowired
    ModelMapper modelMapper;

    public GoogleToken registerToken(GoogleTokenDto dto) {
        GoogleToken googleToken = modelMapper.map(dto, GoogleToken.class);
        return repository.save(googleToken);
    }

}
