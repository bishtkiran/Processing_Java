import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    public static final int Y_POSITION_BALL1 = HEIGHT / 5;
    public static final int Y_POSITION_BALL2 = HEIGHT * 2 / 5;
    public static final int Y_POSITION_BALL3 = HEIGHT * 3 / 5;
    public static final int Y_POSITION_BALL4 = HEIGHT * 4 / 5;
    int ball1Speed = 0;
    int ball2Speed = 0;
    int ball3Speed = 0;
    int ball4Speed = 0;

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
        super.setup();
    }

    @Override
    public void draw() {
        ellipse(ball1Speed, Y_POSITION_BALL1, DIAMETER, DIAMETER);
        ball1Speed++;
        ellipse(ball2Speed, Y_POSITION_BALL2, DIAMETER, DIAMETER);
        ball2Speed += 2;
        ellipse(ball3Speed, Y_POSITION_BALL3, DIAMETER, DIAMETER);
        ball3Speed += 3;
        ellipse(ball4Speed, Y_POSITION_BALL4, DIAMETER, DIAMETER);
        ball4Speed += 4;

    }
}
