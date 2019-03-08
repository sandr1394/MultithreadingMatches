package com.javastart.multithreadingMatches.Service;

import com.javastart.multithreadingMatches.Team;

import java.util.ArrayList;

public class ListService {

    public static ArrayList<Team> sortList(ArrayList<Team> list) {
        Team temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                int score1 = list.get(j).getScore();
                int score2 = list.get(j + 1).getScore();
                if (score2 > score1) {
                    temp = list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static void printList(ArrayList<Team> list) {
        System.out.println("\n---------Турнирная доска футбольных клубов---------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Команда: " + list.get(i).getName() + " Счет: " + list.get(i).getScore() + " Количество проведенных матчей: " + list.get(i).getMatchQuantity()
                    + " Последний матч проведен с командой: " + list.get(i).getLastCompetitor());
        }
    }
}

