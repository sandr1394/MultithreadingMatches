package com.javastart.multithreadingMatches;

public class Team {

    private String name;
    private int strength;
    private String lastCompetitor;
    private String competitionResult;
    private int matchQuantity;
    private int score;

    public Team(String name, int strength, int score) {
        this.name = name;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getLastCompetitor() {
        return lastCompetitor;
    }

    public void setLastCompetitor(String lastCompetitor) {
        this.lastCompetitor = lastCompetitor;
    }

    public String getCompetitionResult() {
        return competitionResult;
    }

    public void setCompetitionResult(String competitionResult) {
        this.competitionResult = competitionResult;
    }

    public int getMatchQuantity() {
        return matchQuantity;
    }

    public void setMatchQuantity(int matchQuantity) {
        this.matchQuantity = matchQuantity;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
