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

    public void executeBatchCommand(List<Command> givenCommands) {
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
        Direction newDirection = null;
        switch (direction) {
            case NORTH:
                newDirection = Direction.WEST;
                break;
            case SOUTH:
                newDirection = Direction.EAST;
                break;
            case EAST:
                newDirection = Direction.NORTH;
                break;
            case WEST:
                newDirection = Direction.SOUTH;
                break;
        }
        location.setDirection(newDirection);
    }

    public void executeCommandRight(Direction direction) {
        Direction newDirection = null;
        switch (direction) {
            case NORTH:
                newDirection = Direction.EAST;
                break;
            case SOUTH:
                newDirection = Direction.WEST;
                break;
            case EAST:
                newDirection = Direction.SOUTH;
                break;
            case WEST:
                newDirection = Direction.NORTH;
                break;
        }
        location.setDirection(newDirection);
    }

    public Location getCurrentLocation() {
        return location;
    }
}
