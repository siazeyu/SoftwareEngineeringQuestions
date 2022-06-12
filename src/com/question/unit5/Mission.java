package com.question.unit5;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Mission {
    private String code;
    private int enemyNumber;

    public Mission(String code, int enemyNumber) {
        this.code = code;
        this.enemyNumber = enemyNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getEnemyNumber() {
        return enemyNumber;
    }

    public void setEnemyNumber(int enemyNumber) {
        this.enemyNumber = enemyNumber;
    }
}
