package com.question.unit2;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Player implements Observer{

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住，"+this.name+"来救你！");
    }

    @Override
    public void beAttacked(Ally ally) {
        System.out.println(this.name+"被攻击！");
        ally.notifyObserver(name);
    }
}
