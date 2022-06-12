package com.question.unit3.param1;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Nvwa {
    public static People makePerson(char type, String name) {
        if (type == 'M'){
            return new Man(name);
        }else if (type == 'W'){
            return new Woman(name);
        }else if (type == 'R'){
            return new Reboot(name);
        }
        return null;
    }
}
