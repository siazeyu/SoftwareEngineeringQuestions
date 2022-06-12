package com.question.unit3.param1;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Man implements People{

    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Man: " + this.name + " Eat!");
    }

    @Override
    public void sleep() {
        System.out.println("Man: " + this.name + " Sleep!");
    }
}
