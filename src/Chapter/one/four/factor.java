package Chapter.one.four;

/**
 * This class is a recursive implementation of factorial operations
 * 
 * @author Chanth Miao
 */
class factor {
    private int initValue;

    /**
     * This constructor init the class with the param 'startValue', offering the
     * starting value of the factorial.
     * 
     * @param startValue The starting value of the factorial.
     */
    public factor(int startValue) {
        this.initValue = startValue;
    }

    /**
     * The core of the factorial implementation, calculating the result of x! by
     * recursion.
     * 
     * @param x The starting value of the factorial.
     * @return x!
     */
    private int calcu(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * calcu(x - 1);
        }
    }

    /**
     * This function is able to get the result of the factorial.
     */
    public int getResult() {
        return calcu(this.initValue);
    }
}