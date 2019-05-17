package Chapter;

/**
 * This class processes the chapter_section number passed from the starUp class.
 * 
 * @author Chanth Miao
 */
public class Router {
    /**
     * This function calls specified child router class according to the param
     * 'chapter', passing param 'section' to child router class. If requested
     * resources is unavailable, offer an error message on the screen.
     * 
     * @param chapter Chapter number of the class.
     * @param section Section number of the class.
     */
    public static void choose(int chapter, int section) {
        switch (chapter) {
        case 1:
            Chapter.one.Router.choose(section);
            break;
        case 2:
            Chapter.two.Router.choose(section);
            break;
        case 3:
            Chapter.three.Router.choose(section);
            break;
        default:
            System.out.println("Error: the specified chapter number does not exist!");
            break;
        }
    }
}