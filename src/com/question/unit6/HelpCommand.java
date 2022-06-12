package com.question.unit6;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class HelpCommand extends Command {
    private DisplayHelpClass displayHelpClass;
    {
        displayHelpClass = new DisplayHelpClass();
    }
    @Override
    public void execute() {
        displayHelpClass.display();
    }
}
