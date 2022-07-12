import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int BALL_ONE_POSITION = HEIGHT / 5;
    public static final int BALL_TWO_POSITION = (HEIGHT * 2) / 5;
    public static final int BALL_THREE_POSITION = (HEIGHT * 3) / 5;
    public static final int BALL_FOUR_POSITION = (HEIGHT * 4) / 5;
    public static final int X_POSITION = 0;
    public static final int DIAMETER = 20;
    public static PApplet processing;
    Ball ballOne;
    Ball ballTwo;
    Ball ballThree;
    Ball ballFour;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
        processing = this;
        ballOne = new Ball(X_POSITION, BALL_ONE_POSITION, DIAMETER);
        ballTwo = new Ball(X_POSITION, BALL_TWO_POSITION, DIAMETER);
        ballThree = new Ball(X_POSITION, BALL_THREE_POSITION, DIAMETER);
        ballFour = new Ball(X_POSITION, BALL_FOUR_POSITION, DIAMETER);
    }

    @Override
    public void draw() {
        ballOne.display();
        ballOne.moveRight(1);
        ballTwo.display();
        ballTwo.moveRight(2);
        ballThree.display();
        ballThree.moveRight(3);
        ballFour.display();
        ballFour.moveRight(4);

    }
}
