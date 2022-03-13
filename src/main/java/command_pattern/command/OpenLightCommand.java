package command_pattern.command;

import command_pattern.receiver.Light;

/**
 * 命令模式，命令的类是最关键的，多了命令这一层，可以进行记录、撤销、事务等处理
 */
public class OpenLightCommand implements ICommand{
    private final Light light;

    public OpenLightCommand(Light light) {
        this.light = light;
    }

    public void excute() {
        System.out.println("open light...");
    }
}
