package ss.example.designpattern.Command.invoker;

import ss.example.designpattern.Command.command.Command;

/**
 * Created by SS on 2017-03-16.
 */

public class RemoteControl {
    private Command button;

    public void setCommand(Command command) {
        button = command;
    }

    public void onClick() {
        button.execute();
    }
}
