package com.question.unit5;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Run {
    public static void main(String[] args) {
        Banzhang banzhang = new Banzhang("啥鸟班长");
        Paizhang paizhang = new Paizhang("傻鸟排长");
        Yingzhang yingzhang = new Yingzhang("sb英扎");
        banzhang.setSuccessor(paizhang);
        paizhang.setSuccessor(yingzhang);

        Mission mission = new Mission("555", 2);
        Mission mission1 = new Mission("666", 30);
        Mission mission2 = new Mission("888", 88);
        Mission mission3 = new Mission("999", 999);

        banzhang.handleRequest(mission);
        banzhang.handleRequest(mission1);
        banzhang.handleRequest(mission2);
        banzhang.handleRequest(mission3);
    }
}
