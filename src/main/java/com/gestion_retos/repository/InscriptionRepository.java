package com.gestion_retos.repository;

import com.gestion_retos.model.Inscription;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface InscriptionRepository extends JpaRepository<@NonNull Inscription,@NonNull Long> {
    boolean existsByUser_UserIdAndChallenge_ChallengeId(Long userId, Long challengeId);
    Optional<Inscription> findByUser_UserIdAndChallenge_ChallengeId(Long userId, Long challengeId);
}
