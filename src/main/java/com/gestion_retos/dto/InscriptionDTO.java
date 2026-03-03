package com.gestion_retos.dto;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class InscriptionDTO {
    private Long inscriptionId;
    private LocalDate inscriptionDate;
    private boolean completed;
    //User
    private Long userId;
    //Challenge
    private Long challengeId;
}