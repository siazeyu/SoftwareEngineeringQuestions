package com.question.unit3.param3;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Run {

    public static void main(String[] args) {
        PcFactory pcFactory = new PcFactory();
        MacFactory macFactory = new MacFactory();

        pcFactory.getCPU().getMessage();
        pcFactory.getRAM().getMessage();

        macFactory.getCPU().getMessage();
        macFactory.getRAM().getMessage();
    }
}
