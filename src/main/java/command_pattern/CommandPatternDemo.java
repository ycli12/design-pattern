package command_pattern;

import command_pattern.command.OpenComputerCommand;
import command_pattern.command.OpenLightCommand;
import command_pattern.receiver.Computer;
import command_pattern.receiver.Light;

public class CommandPatternDemo {
    public static void main(String[] args) {
        OpenLightCommand openLightCommand = new OpenLightCommand(new Light());
        OpenComputerCommand openComputerCommand = new OpenComputerCommand(new Computer());

        Controller controller = new Controller();
        controller.setCommand(openLightCommand);
        controller.setCommand(openComputerCommand);
        controller.excuteCommands();
    }
}
