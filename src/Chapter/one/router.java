package Chapter.one;

public class router{
    public static void choose(int x){
        switch (x) {
            case 4:
                Chapter.one.four.display.now();
                break;
            case 5:
                Chapter.one.five.display.now();
                break;
            default:
            System.out.println("Error: the specified task number does not exist!");
                break;
        }
    }
}