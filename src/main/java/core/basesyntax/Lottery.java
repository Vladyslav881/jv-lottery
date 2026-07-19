package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;

    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Color color = supplier.getRandomColor();
        Random random = new Random();
        int number = random.nextInt(MAX_BALL_NUMBER + 1);
        Ball ball = new Ball(color, number);
        return ball;
    }
}
