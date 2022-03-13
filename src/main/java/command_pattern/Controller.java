package command_pattern;

import command_pattern.command.ICommand;

import java.util.LinkedList;
import java.util.List;

/**
 * 遥控器
 */
public class Controller {
    List<ICommand> commands = new LinkedList<ICommand>();

    public void setCommand(ICommand command) {
        commands.add(command);
    }

    public void excuteCommands() {
        for (ICommand command : commands) {
            command.excute();
        }
    }
}
