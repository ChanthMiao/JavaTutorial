package Chapter.one.five;

public class array {
    private int[] data;

    public array(int[] refData) {
        data = new int[refData.length];
        System.arraycopy(refData, 0, this.data, 0, refData.length);
    }

    void showArray() {
        System.out.println(this.data.toString());
    }

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