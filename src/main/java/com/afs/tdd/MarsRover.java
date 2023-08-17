package com.afs.tdd;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        if(givenCommand == Command.MOVE) {
            executeCommandMove(location.getDirection());
        } else if (givenCommand == Command.TURN_LEFT) {
            executeCommandLeft(location.getDirection());
        } else if (givenCommand == Command.TURN_RIGHT) {
           executeCommandRight(location.getDirection());
        }
    }

    public void executeCommandMove(Direction direction) {
        if(direction == Direction.NORTH){
            location.setY(location.getY() + 1);
        } else if (direction == Direction.SOUTH) {
            location.setY(location.getY() - 1);
        } else if (direction == Direction.EAST) {
            location.setX(location.getX() + 1);
        } else if (direction == Direction.WEST) {
            location.setX(location.getX() - 1);
        }
    }

    public void executeCommandLeft(Direction direction) {
        if (direction == Direction.NORTH) {
            location.setDirection(Direction.WEST);
        } else if (direction == Direction.SOUTH) {
            location.setDirection(Direction.EAST);
        } else if (direction == Direction.EAST) {
            location.setDirection(Direction.NORTH);
        } else if (direction == Direction.WEST) {
            location.setDirection(Direction.SOUTH);
        }
    }

    public void executeCommandRight(Direction direction) {
        if (direction == Direction.NORTH) {
            location.setDirection(Direction.EAST);
        } else if (direction == Direction.SOUTH) {
            location.setDirection(Direction.WEST);
        } else if (direction == Direction.EAST) {
            location.setDirection(Direction.SOUTH);
        } else if (direction == Direction.WEST) {
            location.setDirection(Direction.NORTH);
        }
    }

    public Location getCurrentLocation() {
        return location;
    }
}
