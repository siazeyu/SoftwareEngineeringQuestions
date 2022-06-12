package com.question.unit4;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Adapter implements Cat,Dog{

    private Dog dog;
    private Cat cat;

    public Adapter(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void cry() {
        cat.cry();
    }

    @Override
    public void catchMouse() {
        cat.catchMouse();
    }

    @Override
    public void wang() {
        dog.wang();
    }

    @Override
    public void action() {
        dog.action();
    }
}
