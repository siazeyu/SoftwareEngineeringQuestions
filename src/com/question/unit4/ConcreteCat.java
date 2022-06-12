package com.question.unit4;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class ConcreteCat implements Cat{
    @Override
    public void cry() {
        System.out.println("ConcreteCat cry.");
    }

    @Override
    public void catchMouse() {
        System.out.println("ConcreteCat catchMouse.");
    }
}
