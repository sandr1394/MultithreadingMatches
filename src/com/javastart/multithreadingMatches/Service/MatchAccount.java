package com.javastart.multithreadingMatches.Service;

import com.javastart.multithreadingMatches.Team;

public class MatchAccount {

    public static void countMatchQuantity(Team team1, Team team2) {

        team1.setMatchQuantity(team1.getMatchQuantity() + 1);

        team2.setMatchQuantity(team2.getMatchQuantity() + 1);
    }
}
