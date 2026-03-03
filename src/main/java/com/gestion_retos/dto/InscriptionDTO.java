package com.gestion_retos.dto;

import com.gestion_retos.model.Challenge;
import com.gestion_retos.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InscriptionDTO {
    private Long inscriptionId;
    private LocalDate inscriptionDate;
    private boolean completed;

    //Challenge
    private Long userId;
    private Long challengeId;
}
