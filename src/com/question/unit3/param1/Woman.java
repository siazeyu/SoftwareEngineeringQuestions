package com.question.unit3.param1;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Woman implements People{

    private String name;

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Woman: " + this.name + " Eat!");
    }

    @Override
    public void sleep() {
        System.out.println("Woman: " + this.name + " Sleep!");
    }
}
