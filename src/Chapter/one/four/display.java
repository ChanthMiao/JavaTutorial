package Chapter.one.four;

public class display {
    public static void now() {
        System.out.println("\nclasswork 1-4-1:\n");
        factor sampleFactor = new factor(5);
        System.out.println("5! = " + sampleFactor.getResult());
        System.out.println("\nclasswork 1-4-2:\n");
        luckyDraw sampleLuckyDraw = new luckyDraw();
        sampleLuckyDraw.run();
    }
}