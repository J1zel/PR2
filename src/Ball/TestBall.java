package Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(143, 165.0);
        Ball ball2 = new Ball(56, 45);
        System.out.println(ball1);
        System.out.println(ball2);
        ball1.move(25, 0);
        ball2.move(65, 34);
        System.out.println(ball1);
        System.out.println(ball2);
    }
}