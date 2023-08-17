package com.afs.tdd;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        if(givenCommand == Command.MOVE) {
            if(location.getDirection() == Direction.NORTH){
                location.setY(location.getY() + 1);
            }
        } else if (givenCommand == Command.TURN_LEFT) {
            if (location.getDirection() == Direction.NORTH) {
                location.setDirection(Direction.WEST);
            } 
        }
    }

    public Location getCurrentLocation() {
        return location;
    }
}
