package com.javastart.multithreadingMatches.Service;

import com.javastart.multithreadingMatches.Team;

import static com.javastart.multithreadingMatches.Service.LastCompetitor.establishLastCompetitor;
import static com.javastart.multithreadingMatches.Service.MatchAccount.countMatchQuantity;

public class DoCompetition {

    public static void doMatches(Team team1, Team team2) {

        Thread matchThread = new Thread(new Runnable() {

            @Override
            public void run() {
                if (team1.getStrength() > team2.getStrength()) {
                    team1.setCompetitionResult("Победа");
                    team2.setCompetitionResult("Проигрыш");
                    team1.setScore(team1.getScore() + 1);
                } else {
                    team1.setCompetitionResult("Проигрыш");
                    team2.setCompetitionResult("Победа");
                    team2.setScore(team2.getScore() + 1);
                }
                System.out.println("Поток: " + Thread.currentThread().getName() + " организовал матч между командами: " + team1.getName() + " и " + team2.getName());
                establishLastCompetitor(team1, team2);

                countMatchQuantity(team1, team2);
            }
        });
        matchThread.start();
        try {
            matchThread.join();
        } catch (InterruptedException e) {
            matchThread.interrupt();
            System.out.println("Interrupted Exception occurred: " + e.getMessage());
        }
    }
}
