package Chapter.three;

/**
 * This class processes the section number passed from the parent router class.
 * 
 * @author Chanth Miao
 */
public class Router {
    /**
     * This function calls section achievement display function in specified display
     * class according to the param 'section'. If requested resources is
     * unavailable, offer an error message on the screen.
     * 
     * @param section Section number of the class.
     */
    public static void choose(int section) {
        switch (section) {
        case 1:
            Chapter.three.one.Display.now();
            break;
        case 2:
            Chapter.three.two.Display.now();
            break;
        default:
            System.out.println("Error: the specified task number does not exist!");
            break;
        }
    }
}