package Chapter.one.five;

/**
 * This class provides functions to get border values of all the elements of a
 * given integer array.
 * 
 * @author Chanth Miao
 */
public class array {
    private int[] data;

    /**
     * This constructor copy the array 'refData' to private varible.
     * 
     * @param refData The array provided by the user.
     */
    public array(int[] refData) {
        data = new int[refData.length];
        System.arraycopy(refData, 0, this.data, 0, refData.length);
    }

    /**
     * Show all the elements of the array class.
     */
    void showArray() {
        int len = this.data.length - 1;
        for (int i = 0; i < len; i++) {
            System.out.print(this.data[i] + " ");
        }
        System.out.println(this.data[len]);
    }

    /**
     * Pick the max Element from the array class.
     * 
     * @return The max element of the array class.
     */
    public int maxElem() {
        int result = this.data[0];
        int len = this.data.length;
        for (int i = 0; i < len; i++) {
            if (result < this.data[i]) {
                result = this.data[i];
            }
        }
        return result;
    }

    /**
     * Pick the min Element from the array class.
     * 
     * @return The min element of the array class.
     */
    public int minElem() {
        int result = this.data[0];
        int len = this.data.length;
        for (int i = 0; i < len; i++) {
            if (result > this.data[i]) {
                result = this.data[i];
            }
        }
        return result;
    }
}