package Chapter.two.three;

/**
 * This class provide a static function to show all the classwork that belong to
 * the same section.
 * 
 * @author Chanth Miao
 */
public class Display {
    public static void now() {
        System.out.println("\nclasswork 2-3:\n");
        Book sampleBook = new Book("Go in Action", "William Kennedy", "人们邮电出版社", "2017-03-01");
        System.out.println(sampleBook.toString());
    }
}