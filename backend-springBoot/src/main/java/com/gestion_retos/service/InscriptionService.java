package com.gestion_retos.service;

import com.gestion_retos.dto.user.UserResponseDTO;

import java.util.List;

public interface InscriptionService {

    //user enrollment
    List<UserResponseDTO> getUsersByChallenge(Long challengeId);

    //createInscription
    void createInscription(Long challengeId, Long userId);

    //completeChallenge
    void completeChallenge(Long challengeId, Long userId);
}
