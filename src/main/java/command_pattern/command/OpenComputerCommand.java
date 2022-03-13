package command_pattern.command;

import command_pattern.receiver.Computer;

public class OpenComputerCommand implements ICommand{
    private final Computer computer;

    public OpenComputerCommand(Computer computer) {
        this.computer = computer;
    }

    public void excute() {
        computer.open();
    }
}
