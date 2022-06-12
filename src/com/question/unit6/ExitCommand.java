package com.question.unit6;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class ExitCommand extends Command
{
    private SystemExitClass seObj;
    public ExitCommand()
    {
        seObj = new SystemExitClass();
    }
    public void execute()
    {
        seObj.exit();
    }
}