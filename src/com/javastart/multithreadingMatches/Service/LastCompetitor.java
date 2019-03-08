package com.javastart.multithreadingMatches.Service;

import com.javastart.multithreadingMatches.Team;

public class LastCompetitor {

    public static void establishLastCompetitor(Team team1, Team team2) {

        team1.setLastCompetitor(team2.getName());

        team2.setLastCompetitor(team1.getName());
    }
}
