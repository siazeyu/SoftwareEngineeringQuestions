package com.question.unit3.param3;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class PcFactory implements AbstractFactory{

    @Override
    public RAM getRAM() {
        return new PcRAM();
    }

    @Override
    public CPU getCPU() {
        return new PcCPU();
    }
}
