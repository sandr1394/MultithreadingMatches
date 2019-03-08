package com.javastart.multithreadingMatches;

import com.javastart.multithreadingMatches.Service.DoCompetition;
import com.javastart.multithreadingMatches.Service.ListService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Team zenit = new Team("Зенит", 3, 0);
        Team spartak = new Team("Спартак", 2, 0);
        Team csk = new Team("ЦСКА", 4, 0);
        Team real = new Team("Реал", 5, 0);
        Team barselona = new Team("Барселона", 7, 0);

        ArrayList<Team> list = new ArrayList<Team>();

        list.add(zenit);
        list.add(spartak);
        list.add(csk);
        list.add(real);
        list.add(barselona);

        doMatchesFromList(list);
        ListService.printList(ListService.sortList(list));
    }

    private static void doMatchesFromList(ArrayList<Team> list) {
        for (int i = 0; i < list.size(); i++) {
            Team team1 = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                Team team2 = list.get(j);
                if (team1 != team2) {
                    DoCompetition.doMatches(team1, team2);
                }
            }
        }
    }

}
