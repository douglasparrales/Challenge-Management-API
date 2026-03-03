package com.gestion_retos.dto;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChallengeDTO {
    private Long challengeId;
    private String title;
    private String description;
    private Integer points;
    private LocalDate dateOpen;
    private LocalDate dateEnd;
    //User
    private Long creatorId;
}
