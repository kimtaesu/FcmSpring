package com.hucet.fcm.repository;

import com.hucet.fcm.domain.GoogleToken;
import org.springframework.data.repository.Repository;

public interface TokenRepository extends Repository<GoogleToken, Long> {
    GoogleToken save(GoogleToken token);
}
