package Chapter.one.four;

class factor {
    private int initValue;

    public factor(int value) {
        this.initValue = value;
    }

    private int calcu(int x){
        if(x == 1){
            return 1;
        }
        else{
            return x * calcu(x - 1);
        }
    }

    public int getResult(){
        return calcu(this.initValue);
    }
}