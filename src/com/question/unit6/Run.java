package com.question.unit6;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class Run {
    public static void main(String[] args) {
        ExitCommand exitCommand = new ExitCommand();
        HelpCommand helpCommand = new HelpCommand();

        FunctionButton functionButton = new FunctionButton(exitCommand);
        FunctionButton functionButton1 = new FunctionButton(helpCommand);

        functionButton.click();
        functionButton1.click();
    }
}
