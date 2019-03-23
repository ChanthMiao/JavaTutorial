package Chapter;

public class router{
    public static void choose(int x, int y){
        switch (x) {
            case 1:
                Chapter.one.router.choose(y);
                break;
            default:
            System.out.println("Error: the specified chapter number does not exist!");
                break;
        }
    }
}