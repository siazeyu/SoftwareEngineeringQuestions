package com.question.unit3.param1;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Run {
    public static void main(String[] args) {
        People man = Nvwa.makePerson('M', "man1");
        People woman = Nvwa.makePerson('W', "woman1");
        People reboot = Nvwa.makePerson('R', "reboot1");

        man.eat();
        man.sleep();

        woman.eat();
        woman.sleep();

        reboot.eat();
        reboot.sleep();
    }
}
