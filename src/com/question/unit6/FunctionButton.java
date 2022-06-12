package com.question.unit6;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class FunctionButton
{
    private Command command;

    public FunctionButton(Command command) {
        this.command = command;
    }

    public void setCommand(Command command)
    {
        this.command = command;
    }
    public void click()
    {
        command.execute();
    }
}