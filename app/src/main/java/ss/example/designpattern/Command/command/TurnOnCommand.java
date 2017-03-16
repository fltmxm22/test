package ss.example.designpattern.Command.command;

import ss.example.designpattern.Command.receiver.Television;

/**
 * Created by SS on 2017-03-16.
 */

public class TurnOnCommand implements Command {
    private Television mTelevision;

    public TurnOnCommand(Television television) {
        mTelevision = television;
    }

    @Override
    public void execute() {
        mTelevision.on();
    }
}
