package com.gestion_retos.service;

import com.gestion_retos.dto.ChallengeDTO;
import com.gestion_retos.dto.InscriptionDTO;

import java.util.List;

public interface IChallengeService {
    //getAll
    List<ChallengeDTO> getAllChallenges();

    //getChallengeByID
    ChallengeDTO getChallengeByID(Long id);

    //create
    ChallengeDTO createChallenge(ChallengeDTO challengeDto);

    //createInscription
    InscriptionDTO createInscription(Long challengeID, Long userId, InscriptionDTO inscriptionDto);

    //completeChallenge
    InscriptionDTO completeInscription(Long challengeID, Long userId, InscriptionDTO inscriptionDto);

    //update
    ChallengeDTO updateChallenge(Long id, ChallengeDTO challengeDto);

    //delete
    void deleteChallenge(Long id);
}
