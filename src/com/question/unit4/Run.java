package com.question.unit4;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Run {

    public static void main(String[] args) {
        ConcreteCat cat = new ConcreteCat();
        ConcreteDog dog = new ConcreteDog();
        Adapter adapter = new Adapter(dog, cat);

        adapter.cry();
        adapter.catchMouse();
        adapter.wang();
        adapter.action();
    }
}
