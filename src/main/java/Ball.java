import processing.core.PApplet;

public class Ball {
    private int x_position;
    private int y_position;
    private int diameter;

    Ball(int x, int y, int diameter) {
        this.x_position = x;
        this.y_position = y;
        this.diameter = diameter;
    }

    public void moveRight(int dx) {
        this.x_position += dx;
    }

    public void display() {
        TryProcessing.processing.ellipse(x_position, y_position, diameter, diameter);
    }

}
