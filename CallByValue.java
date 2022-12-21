public class CallByValue {
    int a = 10;

    public void value(int a) {
        a = this.a + 200;
        System.out.println(a);
    }

    public static void main(String[] args) {

        CallByValue cv = new CallByValue();

        cv.value(20);
    }
}
