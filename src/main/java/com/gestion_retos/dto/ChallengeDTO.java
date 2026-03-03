package com.gestion_retos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChallengeDTO {
    private Long challengeId;
    private String title;
    private String description;
    private Integer points;
    private LocalDate dateOpen;
    private LocalDate dateEnd;
    private Long userId;
    private String username;
}
