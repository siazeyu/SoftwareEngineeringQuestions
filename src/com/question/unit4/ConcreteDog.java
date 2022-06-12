package com.question.unit4;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class ConcreteDog implements Dog{

    @Override
    public void wang() {
        System.out.println("ConcreteDog wang.");
    }

    @Override
    public void action() {
        System.out.println("ConcreteDog action.");
    }
}
