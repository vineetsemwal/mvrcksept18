package innerdemo;

public class Outer {

    private int outVal;

    public Outer(int val) {
        this.outVal = val;
    }

    public int getValue() {
        return outVal;
    }


    class Inner {


       public int addBy10() {
            return outVal + 10;
        }

    }
}
