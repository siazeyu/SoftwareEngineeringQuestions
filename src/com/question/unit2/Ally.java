package com.question.unit2;

import java.util.ArrayList;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Ally {

    private String name;

    private ArrayList<Observer> players = new ArrayList<Observer>();

    public Ally(String name) {
        this.name = name;
    }

    public void join(Observer obs) {
        players.add(obs);
    }

    public void quit(Observer obs) {
        players.remove(obs);
    }

    public Observer getPlayByIndex(int index){
        return players.get(index);
    }

    public void notifyObserver(String name) {

        System.out.println(this.name + "紧急通知，盟友" + name + "遭受敌人攻击！");

        for (Observer obs:players) {
            if (!obs.getName().equalsIgnoreCase(name)) {
                obs.help();
            }

        }
    }
}

