package com.gestion_retos.dto;

import com.gestion_retos.model.Challenge;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long userId;
    private String username;
    private String email;
    private Integer totalPoints;
    private LocalDate dateRegister;

    //Challenge
    private List<Challenge> challengeList;
}
