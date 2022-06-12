package com.question.unit2;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public interface Observer {

    String getName();

    void setName(String name);

    void help();

    void beAttacked(Ally ally);


}
