public class CallByValueusingthis {
    int a = 60;

    public void value(int a) {
        a = this.a + 100;
        System.out.println(a);
    }

    public static void main(String[] args) {

        CallByValueusingthis cvt = new CallByValueusingthis();

        cvt.value(50);

    }

}
