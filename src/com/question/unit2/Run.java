package com.question.unit2;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Ally ally1 = new Ally("队伍1");
        Ally ally2 = new Ally("队伍2");

        for (int i = 0; i < 5; i++) {
            ally1.join(new Player("A" + i));
            ally2.join(new Player("B" + i));
        }

        ally1.getPlayByIndex(4).beAttacked(ally1);
        Thread.sleep(1_000);
        ally2.getPlayByIndex(1).beAttacked(ally2);
    }

}
