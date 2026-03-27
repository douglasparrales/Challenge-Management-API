package com.gestion_retos.service;

import com.gestion_retos.dto.challenge.ChallengeRequestDTO;
import com.gestion_retos.dto.challenge.ChallengeResponseDTO;

import java.util.List;

public interface ChallengeService {
    //getAll
    List<ChallengeResponseDTO> getAllChallenges();

    //getChallengeByID
    ChallengeResponseDTO getChallengeByID(Long id);

    //create
    ChallengeResponseDTO createChallenge(ChallengeRequestDTO challengeDto);

    //update
    ChallengeResponseDTO updateChallenge(Long id, ChallengeRequestDTO challengeDto);

    //delete
    void deleteChallenge(Long id);
}
