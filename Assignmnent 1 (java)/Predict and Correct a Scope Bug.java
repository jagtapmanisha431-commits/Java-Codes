public class Question9 {

    static int score = 50;

    public static void update() {
        System.out.println(score);
        score = score + 10;
    }

    public static void main(String[] args) {

        update();

        System.out.println(score);
    }
}
