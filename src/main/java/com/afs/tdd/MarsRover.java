package com.afs.tdd;

import java.util.List;

public class MarsRover {

    private final Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        switch (givenCommand) {
            case MOVE:
                executeCommandMove(location.getDirection());
                break;
            case TURN_LEFT:
                executeCommandLeft(location.getDirection());
                break;
            case TURN_RIGHT:
                executeCommandRight(location.getDirection());
                break;
        }
    }

    public void executeBatchCommands(List<Command> givenCommands) {
        givenCommands.forEach(this::executeCommand);
    }

    public void executeCommandMove(Direction direction) {
        switch (direction) {
            case NORTH:
                location.setY(location.getY() + 1);
                break;
            case SOUTH:
                location.setY(location.getY() - 1);
                break;
            case EAST:
                location.setX(location.getX() + 1);
                break;
            case WEST:
                location.setX(location.getX() - 1);
                break;
        }
    }

    public void executeCommandLeft(Direction direction) {
        switch (direction) {
            case NORTH:
                location.setDirection(Direction.WEST);
                break;
            case SOUTH:
                location.setDirection(Direction.EAST);
                break;
            case EAST:
                location.setDirection(Direction.NORTH);
                break;
            case WEST:
                location.setDirection(Direction.SOUTH);
                break;
        }
    }

    public void executeCommandRight(Direction direction) {
        switch (direction) {
            case NORTH:
                location.setDirection(Direction.EAST);
                break;
            case SOUTH:
                location.setDirection(Direction.WEST);
                break;
            case EAST:
                location.setDirection(Direction.SOUTH);
                break;
            case WEST:
                location.setDirection(Direction.NORTH);
                break;
        }
    }

    public Location getCurrentLocation() {
        return new Location(location.getX(), location.getY(), location.getDirection());
    }
}
