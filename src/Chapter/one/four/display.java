package Chapter.one.four;

public class display {
    public static void now() {
        System.out.println("classwork 1-4-1:");
        factor sampleFactor = new factor(5);
        System.out.println("5! = " + sampleFactor.getResult());
        System.out.println("classwork 1-4-2:");
        luckyDraw sampleLuckyDraw = new luckyDraw();
        sampleLuckyDraw.run();
    }
}