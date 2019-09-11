package com.noxtech.games.boardgamedecider;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonPropertyOrder({
    "name",
    "owner",
    "minPlayers",
    "maxPlayers"
})
public class BoardGame {

    private String name;
    private String owner;
    private Integer minPlayers;
    private Integer maxPlayers;
}
