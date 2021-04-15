package turtleGraphics;

public class Pen {
    private boolean isUp;

    public Pen() {
        this.isUp = true;
    }

    public void movePen(boolean direction) {
        isUp = direction;
    }

    public boolean isUp() {
        return isUp;
    }
}
